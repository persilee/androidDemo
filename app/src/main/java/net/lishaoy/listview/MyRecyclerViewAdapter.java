package net.lishaoy.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.lishaoy.listview.bean.Card;
import net.lishaoy.listview.dao.CardDao;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Card> listData;

    public MyRecyclerViewAdapter(Context context) {
        this.context = context;
        listData = CardDao.generateMockList();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(listData.get(position).getImgId());
        holder.title.setText(listData.get(position).getTitle());
        holder.content.setText(listData.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R2.id.recycler_list_img)
        ImageView imageView;
        @BindView(R2.id.recycler_list_title)
        TextView title;
        @BindView(R2.id.recycler_list_content)
        TextView content;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
        }


    }
}
