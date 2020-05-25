package net.lishaoy.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import net.lishaoy.listview.bean.Card;
import net.lishaoy.listview.dao.CardDao;

import java.util.ArrayList;
import java.util.List;

public class CardViewActivity extends AppCompatActivity {

    private TextView textView;
    private ListView listView;
    private List<Card> cards = new ArrayList<>();
    private CardAdapter cardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        setTitle("CardView");

        textView = findViewById(R.id.card_text);
        listView = findViewById(R.id.card_list_view);
        cards.addAll(CardDao.generateMockList());
        cardAdapter = new CardAdapter(this,cards);
        listView.setAdapter(cardAdapter);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cards.addAll(CardDao.generateMockList());
                cardAdapter = new CardAdapter(CardViewActivity.this,cards);
                listView.setAdapter(cardAdapter);
                Toast.makeText(CardViewActivity.this,"add 8，total "+ cards.size(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
