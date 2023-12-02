import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> theDeck;

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

        for(int i = 0; i < theDeck.size(); i++)
        {

        }
    }

    public Card dealCard(){
        return theDeck.pop();
    }


}
