public class Card {
    int value;
    String suit;
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String displaycard(){
        if (value == 1){
            return "Ace " + suit;
        }
        if (value == 11){
            return "Jack " + suit;
        }
        if (value == 12){
            return "Queen " + suit;
        }
        if (value == 13){
            return "King " + suit;
        }

        return value + " " + suit;

    }


}
