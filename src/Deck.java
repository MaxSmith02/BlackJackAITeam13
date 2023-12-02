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
        LinkedList<Card> shuffle = new LinkedList<Card>();
        Random n = new Random();
        int randVal = n.nextInt(theDeck.size());
        for(int i = 0; i < 52; i++)
        {
            randVal = n.nextInt(theDeck.size());
            shuffle.add(theDeck.get(randVal));
            theDeck.remove(randVal);
            //theDeck.remove(n);
        }
        theDeck = shuffle;
    }

    public Card drawCard()
    {
        return theDeck.removeFirst();
    }

}
