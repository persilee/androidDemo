package net.lishaoy.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewPagerActivity extends AppCompatActivity {

    private Button banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        setTitle("ViewPager");

        banner = findViewById(R.id.banner);
    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.banner:
                Intent it = new Intent(this, BannerActivity.class);
                startActivity(it);
                break;
            case R.id.banner_plugin:
                Intent it1 = new Intent(this, BannerPluginActivity.class);
                startActivity(it1);
                break;
        }
    }
}
