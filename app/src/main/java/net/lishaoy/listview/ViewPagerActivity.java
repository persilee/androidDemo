package net.lishaoy.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ViewPagerActivity extends AppCompatActivity {

    private Button banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        setTitle("ViewPager");

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        banner = findViewById(R.id.banner);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
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
            case R.id.tab_layout:
                Intent it2 = new Intent(this, TabLayoutActivity.class);
                startActivity(it2);
                break;
            case R.id.fly_tab_layout:
                Intent it3 = new Intent(this, FlyTabLayoutActivity.class);
                startActivity(it3);
                break;
        }
    }
}
