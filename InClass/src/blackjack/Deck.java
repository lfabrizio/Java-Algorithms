package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final static String [] SUITS = {"A", "K"};
    private final static int[] values = {1,2 ,3 ,4,5,6,7,8,9};
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public Card draw(){
        return cards.remove(cards.size()-1);
    }
}
