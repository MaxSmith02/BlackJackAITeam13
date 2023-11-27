import java.util.LinkedList;
import java.util.Random;
public class Deck {
    private LinkedList<Card> theDeck;
    private LinkedList<Card> revealedCards;
    public Deck()
    {
        Card fill;
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Hearts");
            theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Spades");
            theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Diamonds");
            theDeck.add(fill);
        }
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(i, "Clubs");
            theDeck.add(fill);
        }
    }

    //Shuffles the deck
    public void shuffleDeck()
    {
        LinkedList<Card> shuffle = null;
        Random rand = new Random();
        int holdRand = rand.nextInt(52)+1;
        for(int i = 0; i < theDeck.size(); i++)
        {
            shuffle.add(theDeck.get(holdRand));
            holdRand = rand.nextInt(52-i)+1;
        }
    }

    public Card drawCard()
    {
        Card giveBack = theDeck.getFirst();
        revealedCards.add(giveBack);
        theDeck.removeFirst();
        return giveBack;
    }
}
