package net.lishaoy.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class AsyncTaskActivity extends AppCompatActivity {

    private TextView textView;
    private ProgressBar progressBar;
    private Button btn_begin;
    private Button btn_pause;
    private ProgressTask progressTask;
    private int temp = 0;
    boolean isPause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        setTitle("AsyncTask");

        initViews();
        initEvents();
    }

    private void initEvents() {
        btn_begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progressTask.isCancelled()){
                    progressTask = new ProgressTask();
                }
                progressTask.execute();
            }
        });
        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressTask.cancel(true);
            }
        });
    }

    private void initViews() {
        textView = findViewById(R.id.async_text);
        progressBar = findViewById(R.id.async_progress);
        btn_begin = findViewById(R.id.async_btn_begin);
        btn_pause = findViewById(R.id.async_btn_pause);
        progressTask = new ProgressTask();
    }

    class ProgressTask extends AsyncTask<Void, Integer, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            textView.setText("加载中 ... ");
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if(s != null) {
                textView.setText(s);
                progressTask = new ProgressTask();
                temp = 0;
            }
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
            textView.setText("进度：" + values[0] + "%");
            temp = values[0];
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            textView.setText("已暂停");
            isPause = true;
        }

        @Override
        protected String doInBackground(Void... voids) {
            try {
                for (int i = isPause?temp:0; i < 100; i++) {
                    publishProgress(i);
                    Thread.sleep(new Random().nextInt(666));
                }
                return "完成";
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
