package blackjack;

public class Card {
    private int value;
    private String suit;

    public Card(int value, String suit){
        this.value = value;
        this.suit=suit;
    }

    public String toString(){
        String output = "";
        switch(value){
            case 1:
                output = "AC";
                break;
        }
    }
}
