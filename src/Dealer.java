public class Dealer extends Player {

    public Dealer() {

    }
    public Dealer(Card firstCard, Card secondCard) {
        initDeal(firstCard, secondCard);
    }
    public boolean nextMove() {
        boolean isHit = false;
        if (showingAndHidden() < 17) {
            isHit = true;
        }
        return isHit;
    }
}
