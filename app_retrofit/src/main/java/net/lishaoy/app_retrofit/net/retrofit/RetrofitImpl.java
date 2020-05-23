package net.lishaoy.app_retrofit.net.retrofit;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitImpl {
    private static final String TAG = "RetrofitImpl";

    public static RetrofitImpl sInstance = new RetrofitImpl();

    public static  RetrofitImpl getInstance() {
        return sInstance;
    }

    private Retrofit retrofit;

    public static Retrofit getRetrofit() {
        return sInstance.retrofit;
    }

    private RetrofitImpl() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.d(TAG, message);
            }
        });
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://m.ctrip.com/restapi/soa2/")
                .build();
    }
}
