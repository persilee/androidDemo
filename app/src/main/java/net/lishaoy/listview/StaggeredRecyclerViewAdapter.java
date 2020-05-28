package net.lishaoy.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.lishaoy.listview.bean.Card;
import net.lishaoy.listview.dao.CardDao;
import net.lishaoy.listview.util.Utils;

import java.util.List;

public class StaggeredRecyclerViewAdapter extends RecyclerView.Adapter<StaggeredRecyclerViewAdapter.MyViewHolder> {
    private static final String TAG = "StaggeredRecyclerViewAd";

    private Context context;
    private List<Card> listData;

    public StaggeredRecyclerViewAdapter(Context context) {
        this.context = context;
        listData = CardDao.generateMockMoreList();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_staggered_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(listData.get(position).getImgId());
        holder.title.setText(listData.get(position).getTitle());
        holder.content.setText(listData.get(position).getContent());

        if(listData.get(position).isLongImg()){
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) Utils.dp2px(286));
            holder.imageView.setLayoutParams(layoutParams);
        }else{
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) Utils.dp2px(126));
            holder.imageView.setLayoutParams(layoutParams);
        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView title;
        private final TextView content;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.recycler_grid_img);
            title = itemView.findViewById(R.id.recycler_grid_title);
            content = itemView.findViewById(R.id.recycler_grid_content);
        }


    }
}
