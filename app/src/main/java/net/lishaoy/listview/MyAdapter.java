package net.lishaoy.listview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import net.lishaoy.listview.item.Item;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private static final String TAG = "MyAdapter";
    private List<Item> list;
    private Context context;

    public MyAdapter(List<Item> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
            viewHolder = new ViewHolder();
            viewHolder.icon = convertView.findViewById(R.id.icon);
            viewHolder.text = convertView.findViewById(R.id.text);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Item item = list.get(position);
        viewHolder.icon.setImageResource(item.getIcon());
        viewHolder.text.setText(item.getText());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), item.getActivity());
                v.getContext().startActivity(intent);
            }
        });

        return convertView;
    }

    static class ViewHolder {
        public ImageView icon;
        public TextView text;
    }
}
