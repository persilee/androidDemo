package net.lishaoy.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import net.lishaoy.listview.item.Item;

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
        Item item1 = new Item(R.drawable.ic_pages,"ViewPager",ViewPagerActivity.class);
        data.add(item1);
        Item item6 = new Item(R.drawable.ic_card,"CardView",CardViewActivity.class);
        data.add(item6);
        Item item2 = new Item(R.drawable.ic_message,"Handler",HandlerActivity.class);
        data.add(item2);
        Item item3 = new Item(R.drawable.ic_sync,"AsyncTask",AsyncTaskActivity.class);
        data.add(item3);
        Item item4 = new Item(R.drawable.ic_network,"OKHttp",OKHttpActivity.class);
        data.add(item4);
        Item item5 = new Item(R.drawable.ic_network_check,"Retrofit",RetrofitActivity.class);
        data.add(item5);


        BaseAdapter adapter = new MyAdapter(data,this);

        listView.setAdapter(adapter);

    }
}
