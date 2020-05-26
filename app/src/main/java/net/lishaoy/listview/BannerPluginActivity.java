package net.lishaoy.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.config.IndicatorConfig;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.indicator.RectangleIndicator;
import com.youth.banner.itemdecoration.MarginDecoration;
import com.youth.banner.listener.OnPageChangeListener;
import com.youth.banner.transformer.AlphaPageTransformer;
import com.youth.banner.transformer.DepthPageTransformer;
import com.youth.banner.transformer.RotateDownPageTransformer;
import com.youth.banner.transformer.RotateYTransformer;
import com.youth.banner.transformer.ScaleInTransformer;
import com.youth.banner.transformer.ZoomOutPageTransformer;
import com.youth.banner.util.BannerUtils;

import net.lishaoy.listview.bean.DataBean;
import net.lishaoy.listview.util.EllipseIndicator;

import java.util.ArrayList;
import java.util.List;

public class BannerPluginActivity extends AppCompatActivity implements OnPageChangeListener {
    private static final String TAG = "BannerPluginActivity";
    List<Integer> images = new ArrayList<>();
    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_plugin);
        setTitle("BannerPlugin");

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        images.add(R.drawable.bg1);
        images.add(R.drawable.bg2);
        images.add(R.drawable.bg4);

        banner = findViewById(R.id.banner_container);
        banner.setAdapter(new ImageAdapter(DataBean.getTestData()));
        banner.setIndicator(new EllipseIndicator(this));
        banner.setIndicatorSelectedColorRes(R.color.main_color);
        banner.setIndicatorNormalColorRes(R.color.textColor);
        banner.setIndicatorGravity(IndicatorConfig.Direction.CENTER);
        banner.setIndicatorSpace((int) BannerUtils.dp2px(10));
        banner.setIndicatorMargins(new IndicatorConfig.Margins((int) BannerUtils.dp2px(10)));
        banner.setPageTransformer(new ZoomOutPageTransformer()); // 图片切换效果
        banner.setOnBannerListener((data, position) -> {
            Snackbar.make(banner, ((DataBean) data).title, Snackbar.LENGTH_SHORT).show();
        });
        banner.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.i(TAG, "onPageSelected: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class ImageAdapter extends BannerAdapter<DataBean,ImageAdapter.BannerViewHolder> {

        public ImageAdapter(List<DataBean> datas) {
            super(datas);
        }

        @Override
        public BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return new BannerViewHolder(imageView);
        }

        @Override
        public void onBindView(BannerViewHolder holder, DataBean data, int position, int size) {
            holder.imageView.setImageResource(data.imageRes);
        }


        class BannerViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;

            public BannerViewHolder(@NonNull ImageView view) {
                super(view);
                this.imageView = view;
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        banner.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        banner.stop();
    }
}
