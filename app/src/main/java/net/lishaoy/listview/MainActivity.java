package net.lishaoy.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter arrayAdapter;
    private ImageView iconView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view1);
        iconView = findViewById(R.id.icon);

        List<Item> data = new ArrayList<>();
        Item item = new Item(R.drawable.ic_list,"ListView",ListViewActivity.class);
        data.add(item);
        Item item2 = new Item(R.drawable.ic_pages,"ViewPager",ViewPagerActivity.class);
        data.add(item2);

        BaseAdapter adapter = new MyAdapter(data,this);

        listView.setAdapter(adapter);

    }
}
