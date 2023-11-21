import java.util.LinkedList;

public abstract class Player {
    private Card hiddenCard;
    private LinkedList<Card> visibleCards;
    private int cash;

    /**
     * The initial deal that sets the first two cards, a hidden and a shown one
     * @param newhidden - The new hidden card
     * @param newShown - The first shown card
     */
    public void initDeal(Card newhidden, Card newShown) {
        hiddenCard = newhidden;
        visibleCards.add(newShown);
    }

    /**
     * When the players "hits" acquiring a new shown card
     * @param newCard
     */
    public void hit(Card newCard) {
        visibleCards.add(newCard);
    }

    /**
     * Returns the cumulative value of all the player's cards
     * @return sum of all player's cards
     */
    public int showingAndHidden() {
        return hiddenCard.value + showing(); //change to get value

    }

    /**
     * Returns the cumulative value of the player's shown cards
     * @return sum of player's shown cards
     */
    public int showing() {
        int sum = 0;
        for (int i = 0; i < visibleCards.size(); i++) {
            sum = sum + visibleCards.get(i).value; //change to get value
        }
        return sum;
    }

    /**
     *
     */
    public abstract void nextMove();
}
