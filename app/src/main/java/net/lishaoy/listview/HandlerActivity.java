package net.lishaoy.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.lang.ref.WeakReference;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * 演示 handler 的使用方法
 */

public class HandlerActivity extends AppCompatActivity {

    private static final String GET_URL = "https://cdn.lishaoy.net/ctrip/homeConfig.json";
    private Button btnGet;
    private TextView content;
    private OkHttpClient client = new OkHttpClient.Builder().build();
    private MyHandler handler = new MyHandler(HandlerActivity.this);
    static class MyHandler extends Handler {
        private WeakReference<HandlerActivity> weakReference;

        public MyHandler(HandlerActivity activity) {
            weakReference = new WeakReference<>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            HandlerActivity handlerActivity = weakReference.get();
            switch (msg.what) {
                case 1000:
                    handlerActivity.content.setText((String)msg.obj);
                    break;
                case -1:
                    Toast.makeText(handlerActivity,"网络错误",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        setTitle("Handler");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        initViews();
        initEvents();
    }

    private void initEvents() {
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Request request = new Request.Builder()
                        .url(GET_URL)
                        .build();
                Call call = client.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(@NotNull Call call, @NotNull IOException e) {
                        handler.sendEmptyMessage(-1);
                    }

                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        Message message = new Message();
                        message.what = 1000;
                        message.obj = response.body().string();
                        handler.sendMessage(message);
                    }
                });
            }
        });
    }

    private void initViews() {
        btnGet = findViewById(R.id.handler_btn_get);
        content = findViewById(R.id.handler_content);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
