package net.lishaoy.listview.dao;

import net.lishaoy.listview.R;
import net.lishaoy.listview.bean.Card;

import java.util.ArrayList;
import java.util.List;

public class CardDao {
    public static List<Card> generateMockList() {
        List<Card> cardList = new ArrayList<>();

        Card card = new Card(1, R.drawable.bg1,"Hooray! It's snowing!","It's time to make a snowman.James runs out. He makes a big pile of snow. He puts a big snowball on top. He adds a scarf and a hat. He adds an orange for the nose. He adds coal for the eyes and buttons.In the evening, James opens the door. What does he see?");
        cardList.add(card);
        card = new Card(2, R.drawable.bg2,"From Spyware with Love!","It's late. You've been scouring the web for that perfect present for your Aunt Bess in Idaho. You finally find it at presents4aunties.com.");
        cardList.add(card);
        card = new Card(3, R.drawable.bg4,"Computer Viruses, Worms, and Hoaxes","In recent days, I was one of the unfortunate persons to receive the \"Mydoom\" worm emails. Not just one, but at least forty appeared in my popserver mailbox. As frustrating as it was deleting all of these nasty little boogers.");
        cardList.add(card);
        card = new Card(4, R.drawable.bg5,"Is Your Email Private? Part 1 of 3","On occasion, email sent to you or by you may even be delivered to the wrong inbox and your private message is no longer private. ");
        cardList.add(card);
        card = new Card(5, R.drawable.bg6,"Pervasive Phishing Scams","Scams involving email continue to plague consumers across America, indeed the world. These so called \"phishing\" scams involve \"spoofed\" emails meant to draw the unwary to bogus internet sites masquerading as legitimate sites. ");
        cardList.add(card);
        card = new Card(6, R.drawable.bg7,"The Saga of the Annoying Adware","When we think of adware, what comes to mind are those annoying and pesky ads that pop up out of nowhere whenever we are surfing the net. Anybody who has surfed through the net has encountered those irritating pop-up adwares advertising everything from computer software down to Viagra. ");
        cardList.add(card);
        card = new Card(7, R.drawable.bg8,"Phishing - Learn To Identify It","This is when someone sends you an email falsely claiming to be a legitimate Business - like your bank or credit card company - in an attempt to scam you into giving them your personal, private information that they can use to access your accounts.");
        cardList.add(card);
        card = new Card(8, R.drawable.bg9,"If You Steal It, They May Come!","Business on the internet is getting down right shameless. This week, my email box was literally filled with hype, overly inflated promises, phish mail, scams, ezines I did not order, and about 14 viagra gimmicks. ");
        cardList.add(card);


        return cardList;
    }
}
