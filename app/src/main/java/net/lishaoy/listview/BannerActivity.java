package net.lishaoy.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BannerActivity extends AppCompatActivity {
    private static final String TAG = "BannerActivity";
    List<Integer> images = new ArrayList<>();
    private ViewPager2 pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        setTitle("Banner");

        images.add(R.mipmap.bg1);
        images.add(R.mipmap.bg2);
        images.add(R.mipmap.bg4);
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(BannerActivity.this).inflate(R.layout.img_container,parent,false);
                return new ViewHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                ViewHolder h = (ViewHolder) holder;
                h.container.setImageResource(images.get(position));
            }

            @Override
            public int getItemCount() {
                return images.size();
            }
        };

        pager = findViewById(R.id.image);
        pager.setAdapter(adapter);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView container;
        public TextView pText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            container = itemView.findViewById(R.id.pagers);
            pText = itemView.findViewById(R.id.p_text);
        }
    }
}
