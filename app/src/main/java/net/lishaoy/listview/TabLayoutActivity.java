package net.lishaoy.listview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.androidkun.xtablayout.XTabLayout;

import net.lishaoy.listview.tabPages.AndroidFragment;
import net.lishaoy.listview.tabPages.FlutterFragment;
import net.lishaoy.listview.tabPages.IOSFragment;
import net.lishaoy.listview.tabPages.ReactFragment;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {
    private static final String TAG = "TabLayoutActivity";
    private XTabLayout tabLayout;
    private ViewPager2 viewPager;
    private List<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        setTitle("TabLayout");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab);
        tabLayout.setxTabDisplayNum(7);
        tabLayout.addTab(tabLayout.newTab().setText("Android"));
        tabLayout.addTab(tabLayout.newTab().setText("iOS"));
        tabLayout.addTab(tabLayout.newTab().setText("Flutter"));
        tabLayout.addTab(tabLayout.newTab().setText("React Native"));



        tabLayout.setOnTabSelectedListener(new XTabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(XTabLayout.Tab tab) {
                Log.d(TAG, "onTabSelected: " + tab.getPosition());
                viewPager.setCurrentItem(tab.getPosition(),false);
            }

            @Override
            public void onTabUnselected(XTabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(XTabLayout.Tab tab) {

            }
        });

        list.add(new AndroidFragment());
        list.add(new IOSFragment());
        list.add(new FlutterFragment());
        list.add(new ReactFragment());


        viewPager.setAdapter(new FragmentStateAdapter(getSupportFragmentManager(),getLifecycle()) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                return list.get(position);
            }

            @Override
            public int getItemCount() {
                return list.size();
            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                tabLayout.getTabAt(position).select();
            }
        });

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
