package net.lishaoy.listview;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import net.lishaoy.listview.net.okhttp.INetCallBack;
import net.lishaoy.listview.net.okhttp.OkHttpUtils;

public class OKHttpActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private Button buttonPost;
    private Button buttonPostJson;
    final private String POST_JSON_URL = "https://m.ctrip.com/restapi/soa2/16189/json/searchTripShootListForHomePageV2?_fxpcqlniredt=09031014111431397988&__gw_appid=99999999&__gw_ver=1.0&__gw_from=10650013707&__gw_platform=H5";
    final private String POST_JSON_STR = "{\"districtId\": -1, \"groupChannelCode\": \"RX-OMF\", \"type\": null, \"lat\": -180, \"lon\": -180, \"locatedDistrictId\": 0, \"pagePara\": {\"pageIndex\": 1, \"pageSize\": 10, \"sortType\": 9, \"sortDirection\": 0}, \"imageCutType\": 1, \"head\": {\"cid\": \"09031014111431397988\"}, \"contentType\": \"json\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_http);
        setTitle("OKHttp");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        initViews();
        initEvents();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    private void initEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkHttpUtils.getInstance().doGet("https://cdn.lishaoy.net/ctrip/homeConfig.json",
                        new INetCallBack() {
                            @Override
                            public void onSuccess(String response) {
                                textView.setText(response);
                            }

                            @Override
                            public void onFailed(Throwable e) {
                                Toast.makeText(OKHttpActivity.this, "网络错误", Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

        buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                OkHttpUtils.getInstance().doPost();
            }
        });

        buttonPostJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkHttpUtils.getInstance().doPostJson(POST_JSON_URL, POST_JSON_STR, new INetCallBack() {
                    @Override
                    public void onSuccess(String response) {
                        textView.setText(response);
                    }

                    @Override
                    public void onFailed(Throwable e) {
                        Toast.makeText(OKHttpActivity.this, "网络错误", Toast.LENGTH_SHORT).show();
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
