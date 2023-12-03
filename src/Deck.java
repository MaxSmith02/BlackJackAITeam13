import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
public class Deck {
    private LinkedList<Card> theDeck;

    public Deck()
    {
        this.theDeck = new LinkedList<Card>();
        Card fill;
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Hearts");
            this.theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Spades");
            this.theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Diamonds");
            this.theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Clubs");
            this.theDeck.add(fill);
        }
    }

    //Shuffles the deck
    public void shuffleDeck()
    {

        Collections.shuffle(theDeck);
    }

    public Card dealCard(){
        return theDeck.pop();
    }


}
