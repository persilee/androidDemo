package net.lishaoy.listview.net.okhttp;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public class OkHttpUtils {
    private static final String TAG = "OkHttpUtils";
    private Handler handler = new Handler(Looper.getMainLooper());
    OkHttpClient client;

    private OkHttpUtils() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.d(TAG, message);
            }
        });
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
    }

    public static OkHttpUtils sInstance = new OkHttpUtils();

    public static OkHttpUtils getInstance() {
        return sInstance;
    }

    /**
     * https://cdn.lishaoy.net/ctrip/homeConfig.json
     *
     * @param url
     */
    public String doGet(String url, INetCallBack callBack) {

        Request request = new Request.Builder()
                .url(url)
                .build();
        executeRequest(callBack, request);
        return null;
    }

    public void doPost(String url, HashMap<String, String> params, INetCallBack callBack) {
        FormBody.Builder builder = new FormBody.Builder();
        if (params != null) {
            for (String param : params.keySet()){
                builder.add(param, params.get(param));
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
        executeRequest(callBack, request);
    }

    public void doPostMultipart(String url, HashMap<String, String> params, INetCallBack callBack) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        if (params != null) {
            for (String param : params.keySet()){
                builder.addFormDataPart(param, params.get(param));
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
        executeRequest(callBack, request);
    }

    public void doPostJson(String url, String jsonStr, INetCallBack callBack) {
        RequestBody requestBody = RequestBody.create(jsonStr, MediaType.get("application/json"));
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        executeRequest(callBack, request);
    }

    private void executeRequest(INetCallBack callBack, Request request) {
        Call call = client.newCall(request);
        /* 同步
            Response response = call.execute();*/
        //异步
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        callBack.onFailed(e);
                    }
                });
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String str = null;
                try {
                    str = response.body().string();
                } catch (IOException e) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            callBack.onFailed(e);
                        }
                    });
                    return;
                }
                String finalStr = str;
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        callBack.onSuccess(finalStr);
                    }
                });
            }

        });
    }
}
