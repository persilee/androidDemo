package net.lishaoy.listview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;

import net.lishaoy.listview.tabPages.AndroidFragment;
import net.lishaoy.listview.tabPages.FlutterFragment;
import net.lishaoy.listview.tabPages.IOSFragment;
import net.lishaoy.listview.tabPages.ReactFragment;

import java.util.ArrayList;

public class FlyTabLayoutActivity extends AppCompatActivity {

    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fly_tab_layout);
        setTitle("fly tab layout");

        slidingTabLayout = findViewById(R.id.sliding_tab_layout);
        viewPager = findViewById(R.id.fly_view_pager);
        list.add(new AndroidFragment());
        list.add(new IOSFragment());
        list.add(new FlutterFragment());
        list.add(new ReactFragment());
        slidingTabLayout.setViewPager(viewPager, new String[]{"android", "iOS", "flutter", "react Native"}, this, list);
    }
}
