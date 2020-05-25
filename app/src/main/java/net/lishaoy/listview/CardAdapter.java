package net.lishaoy.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import net.lishaoy.listview.bean.Card;

import java.util.List;

public class CardAdapter extends BaseAdapter {

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
            convertView.setTag(viewHoder);
        }else {
            viewHoder = (ViewHoder) convertView.getTag();
        }

        Card card = cards.get(position);
        viewHoder.imageView.setImageResource(card.getImgId());
        viewHoder.title.setText(card.getTitle());
        viewHoder.content.setText(card.getContent());

        return convertView;
    }

    public static class ViewHoder {
        ImageView imageView;
        TextView title;
        TextView content;
    }
}
