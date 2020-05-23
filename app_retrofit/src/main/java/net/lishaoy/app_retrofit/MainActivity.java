package net.lishaoy.app_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.lishaoy.app_retrofit.bean.SearchTripShoot;
import net.lishaoy.app_retrofit.bean.TripShoot;
import net.lishaoy.app_retrofit.net.retrofit.IApi;
import net.lishaoy.app_retrofit.net.retrofit.RetrofitImpl;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private Button buttonPost;
    private Button buttonPostJson;
    final private String POST_JSON_URL = "https://m.ctrip.com/restapi/soa2/16189/json/searchTripShootListForHomePageV2?_fxpcqlniredt=09031014111431397988&__gw_appid=99999999&__gw_ver=1.0&__gw_from=10650013707&__gw_platform=H5";
    final private String POST_JSON_STR = "{\"districtId\": -1, \"groupChannelCode\": \"RX-OMF\", \"type\": null, \"lat\": -180, \"lon\": -180, \"locatedDistrictId\": 0, \"pagePara\": {\"pageIndex\": 1, \"pageSize\": 10, \"sortType\": 9, \"sortDirection\": 0}, \"imageCutType\": 1, \"head\": {\"cid\": \"09031014111431397988\"}, \"contentType\": \"json\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initEvents();
    }

    private void initEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IApi api = RetrofitImpl.getRetrofit().create(IApi.class);
                api.get().enqueue(new Callback<TripShoot>() {
                    @Override
                    public void onResponse(Call<TripShoot> call, Response<TripShoot> response) {
                        textView.setText(response.body().getSubjectModules().toString());
                    }

                    @Override
                    public void onFailure(Call<TripShoot> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"网络异常", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        buttonPostJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IApi api = RetrofitImpl.getRetrofit().create(IApi.class);
                MediaType mediaType = MediaType.get("application/json; charset=utf-8");
                RequestBody requestBody = RequestBody.create(mediaType,POST_JSON_STR);
                api.postJson(requestBody).enqueue(new Callback<SearchTripShoot>() {
                    @Override
                    public void onResponse(Call<SearchTripShoot> call, Response<SearchTripShoot> response) {
                        textView.setText(response.body().getResultList().toString());
                    }

                    @Override
                    public void onFailure(Call<SearchTripShoot> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"网络异常", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void initViews() {
        button = findViewById(R.id.btn_get);
        textView = findViewById(R.id.content);
        buttonPost = findViewById(R.id.btn_post);
        buttonPostJson = findViewById(R.id.btn_post_json);
    }
}
