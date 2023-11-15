import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> theDeck;

    public Deck()
    {
        Card fill;
        for(int i = 1; i < 14; i++)
        {
            fill = new Card(1, "Heart");

        }
    }
}
