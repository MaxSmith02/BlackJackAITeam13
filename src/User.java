import java.util.Scanner;

public class User extends Player {

    public User() {

    }
    public User(Card firstCard, Card secondCard) {
        initDeal(firstCard, secondCard);
    }
    public boolean nextMove() {
        // ask for input from the ui

        return false;
    }

    public int placeBet(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much would you like to bet?");
        keyboard.nextInt();
        return keyboard.nextInt();
    }

}
