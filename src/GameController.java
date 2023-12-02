import java.util.Scanner;

public class GameController {

    Scanner keyBoard = new Scanner(System.in);

    int minBet;
    int playerMoney;

    Player player1;

    Player dealer;

    Deck deck;

    public GameController(){
        this.minBet = 5;
        this.playerMoney = 100;
        this.player1 = new User();
        this.deck = new Deck();
        this.dealer = new Dealer();
    }


    public void playGame(){
        boolean donePlaying = false;

        int currentBet = minBet;
        int deckIndex = 0;

        while(!donePlaying){

            currentBet = this.player1.placeBet();
            deck.shuffleDeck();
            playHand();


        }
    }

    public void playHand(){
        boolean playerDone = false;
        boolean dealerDone = false;

        while (!playerDone && dealerDone){

        }

    }


    public void displayGameStats(){
        System.out.println("The Player has $" + playerMoney);


    }







}
