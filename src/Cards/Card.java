package Cards;


import java.util.ArrayList;
import java.util.Random;

public class Card {
    private String[] suits={"Clubs","Hearts","Spades","Diamonds"};
    private String[] values={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};

    private String mSuit;
    private String mValue;
    public Card(){
        genCard();
    }

    private void genCard(){
        Random random=new Random();
        mSuit=suits[random.nextInt(suits.length)];
        mValue=values[random.nextInt(values
                .length)];
    }

    @Override
    public String toString() {
        return (mValue+" of "+mSuit);
    }
}
