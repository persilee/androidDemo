package net.lishaoy.listview;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import net.lishaoy.listview.util.GlideApp;
import net.lishaoy.listview.util.GlideOptionsUtils;

public class GlideActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imageView = findViewById(R.id.glide_img);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadImage(view);
            }
        });
    }

    private void loadImage(View view) {
        Glide.with(view)
                .load("https://resources.ninghao.org/images/contained.jpg")
                .apply(GlideOptionsUtils.baseOptions())
                .into(imageView);
    }

    private void injectLoadImage(View view) {
        GlideApp.with(view)
                .load("https://resources.ninghao.org/images/contained.jpg")
                .injectOptions()
                .into(imageView);
    }

}
