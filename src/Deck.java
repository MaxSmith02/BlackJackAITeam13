import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> theDeck;

    public Deck()
    {
        Card fill;
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(1, "Hearts");
            theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(1, "Spades");
            theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(1, "Diamonds");
            theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(1, "Clubs");
            theDeck.add(fill);
        }
    }

    public void shuffleDeck()
    {

    }
}
