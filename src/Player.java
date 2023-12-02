import java.util.LinkedList;
import java.util.Scanner;

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
        this.hiddenCard = newhidden;
        this.visibleCards = new LinkedList<Card>();
        this.visibleCards.add(newShown);
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
     * @return sum of all player's card values
     */
    public int showingAndHidden() {
        if (hiddenCard.value == 1){
            if (showing() + 11 < 22){
                return showing() + 11;
            }
        }
        if (hiddenCard.value > 10){
            return 10 + showing();
        }

        return hiddenCard.value + showing(); //change to get value

    }

    /**
     * Returns the cumulative value of the player's shown cards
     * @return sum of player's shown card values
     */
    public int showing() {
        int sum = 0;
        boolean hasAce = false;
        for (int i = 0; i < visibleCards.size(); i++) {
            if (visibleCards.get(i).value == 1){
                hasAce = true;
            }
            if (visibleCards.get(i).value > 10){
                sum = sum + 10;
            }
            sum = sum + visibleCards.get(i).value; //change to get value
        }
        if (hasAce){
            if (sum + 10 < 22){
                sum = sum + 10;
            }
        }
        return sum;
    }

    /**
     * Returns the players card with how they can be seen in game
     * @return a string showing cards in game
     */
    public String displayCards(boolean showHidden){
        String cards = "";
        if (showHidden){
            cards = cards + hiddenCard.value + " ";
        }
        else{
            cards = cards + "? ";
        }
        for (int card = 0; card < visibleCards.size(); card++){

        }

        return cards;
    }


    /**
     * Returns whether or not the player wants to hit or stand
     * @return true if the player wants to hit
     */
    public abstract boolean nextMove();

    public abstract int placeBet();


}
