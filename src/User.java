import java.util.Scanner;

public class User extends Player {

    public User() {

    }
    public User(Card firstCard, Card secondCard) {
        initDeal(firstCard, secondCard);
    }
    public boolean nextMove() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to get another card (y/n)");
        String choice = keyboard.next();
        if (choice.equals("y")){
            return true;
        }
        return false;
    }

    public int placeBet(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much would you like to bet?");
        return keyboard.nextInt();
    }

}
