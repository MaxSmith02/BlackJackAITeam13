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

        if (playerMoney == 0){
            donePlaying = true;
        }


    }

    public void playHand(){
        boolean playerDone = false;
        boolean dealerDone = false;

        dealer.initDeal(deck.dealCard(), deck.dealCard());
        player1.initDeal(deck.dealCard(), deck.dealCard());

        while (!playerDone && dealerDone){

            if(!dealerDone){
                dealerDone= dealer.nextMove();
                if(!dealerDone){
                    dealer.hit(deck.dealCard());
                }
            }
            if(!playerDone){
                playerDone = player1.nextMove();
                if(!playerDone){
                    player1.hit(deck.dealCard());
                }
            }
        }



    }


    public void displayGameStats(){
        System.out.println("The Player has $" + playerMoney);
        System.out.println("The minimum bet is $" + minBet);
    }

    public void displayDealerHand(){
        System.out.println("The dealer's hand:");



    }







}
