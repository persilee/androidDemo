package net.lishaoy.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import net.lishaoy.listview.util.BannerUtils;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyRecyclerViewAdapter myRecyclerViewAdapter;
    private FloatingActionButton button;
    private GridRecyclerViewAdapter gridRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setTitle("Recycler");

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = findViewById(R.id.recycler_container);
        /**
         * 线性布局
         */
        getLinearLayout();

        button = findViewById(R.id.recycler_btn_switch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (recyclerView.getLayoutManager().getClass() == LinearLayoutManager.class) {
                    getGridLayout();
                }else if (recyclerView.getLayoutManager().getClass() == GridLayoutManager.class) {
                    getStaggeredLayout();
                }else if(recyclerView.getLayoutManager().getClass() == StaggeredGridLayoutManager.class){
                    getLinearLayout();
                }
            }
        });

    }

    private void getLinearLayout() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        myRecyclerViewAdapter = new MyRecyclerViewAdapter(RecyclerViewActivity.this);
        recyclerView.setAdapter(myRecyclerViewAdapter);
    }

    private void getStaggeredLayout() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter = new StaggeredRecyclerViewAdapter(RecyclerViewActivity.this);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);
    }

    private void getGridLayout() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(RecyclerViewActivity.this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        gridRecyclerViewAdapter = new GridRecyclerViewAdapter(RecyclerViewActivity.this);
        recyclerView.setAdapter(gridRecyclerViewAdapter);
        recyclerView.setPadding(
                (int) BannerUtils.dp2px(8),
                (int) BannerUtils.dp2px(8),
                (int) BannerUtils.dp2px(8),
                (int) BannerUtils.dp2px(8)
        );
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
