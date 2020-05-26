package net.lishaoy.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import net.lishaoy.listview.bean.Card;
import net.lishaoy.listview.util.BannerUtils;

import java.util.List;

import static androidx.cardview.widget.CardView.*;

public class CardAdapter extends BaseAdapter {

    private static final String TAG = "CardAdapter";

    private Context context;
    private LayoutInflater inflater;
    private List<Card> cards;

    public CardAdapter(Context context, List<Card> cards) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.cards = cards;
    }

    @Override
    public int getCount() {
        return cards.size();
    }

    @Override
    public Card getItem(int position) {
        return cards.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoder viewHoder = null;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.item_card, parent,false);
            viewHoder = new ViewHoder();
            viewHoder.imageView = convertView.findViewById(R.id.card_list_img);
            viewHoder.title = convertView.findViewById(R.id.card_list_title);
            viewHoder.content = convertView.findViewById(R.id.card_list_content);
            viewHoder.cardView = convertView.findViewById(R.id.card_card);
            convertView.setTag(viewHoder);
        }else {
            viewHoder = (ViewHoder) convertView.getTag();
        }

        Card card = cards.get(position);
        viewHoder.imageView.setImageResource(card.getImgId());
        viewHoder.title.setText(card.getTitle());
        viewHoder.content.setText(card.getContent());
        Log.d(TAG, "getView: " + position);
//        if (position == 0) {
//            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewHoder.cardView.getLayoutParams();
//            layoutParams.setMargins(
//                    (int) BannerUtils.dp2px(18),
//                    (int) BannerUtils.dp2px(20),
//                    (int) BannerUtils.dp2px(18),
//                    (int) BannerUtils.dp2px(20)
//            );
//            viewHoder.cardView.setLayoutParams(layoutParams);
//        }
        return convertView;
    }

    public static class ViewHoder {
        ImageView imageView;
        TextView title;
        TextView content;
        CardView cardView;
    }
}
