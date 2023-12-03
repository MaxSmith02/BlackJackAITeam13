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

            System.out.println();
            System.out.println("The Player has: $" + playerMoney);
            System.out.println("The Minimum Bet is: $" + minBet);

            currentBet = this.player1.placeBet();
            if (currentBet < minBet){
                currentBet = minBet;
            }
            if (currentBet > playerMoney){
                currentBet = playerMoney;
            }
            System.out.println("The Current Bet is: $" + currentBet);

            deck.shuffleDeck();
            playHand(currentBet);

            if (playerMoney <= 0){
                donePlaying = true;
            }


        }


    }

    public void playHand(int currentBet){
        boolean playerDone = false;
        boolean dealerDone = false;

        dealer.initDeal(deck.dealCard(), deck.dealCard());
        player1.initDeal(deck.dealCard(), deck.dealCard());

        displayDealerHand(false);
        displayPlayerHand();

        while (!playerDone || !dealerDone){

            if(!playerDone){
                playerDone = !player1.nextMove();
                if(!playerDone){
                    System.out.println();
                    player1.hit(deck.dealCard());
                    displayDealerHand(false);
                    displayPlayerHand();
                }
            }
            if (player1.showingAndHidden() > 21){
                playerDone = true;
            }

            if(!dealerDone){
                dealerDone = !dealer.nextMove();

                if(!dealerDone){
                    System.out.println();
                    System.out.println("The dealer hits");
                    dealer.hit(deck.dealCard());
                    displayDealerHand(false);
                    displayPlayerHand();
                }
            }
            if (dealer.showingAndHidden() > 21){
                dealerDone = true;
            }

        }

        System.out.println();
        displayDealerHand(true);
        displayPlayerHand();

        determineWinner(currentBet);


    }


    public void displayGameStats(){
        System.out.println("The Player has $" + playerMoney);
        System.out.println("The minimum bet is $" + minBet);
    }

    public void displayDealerHand(boolean showHidden){
        System.out.println("The dealer's hand:");
        System.out.println(dealer.displayCards(showHidden));
    }

    public void displayPlayerHand(){
        System.out.println("The player's hand:");
        System.out.println(player1.displayCards(true));
    }

    public void determineWinner(int currentBet){
        int p1Score = player1.showingAndHidden();
        int dealScore = dealer.showingAndHidden();

        if (p1Score <= 21 && dealScore <= 21){
            if (p1Score > dealScore){
                System.out.println("The Player Wins!");
                playerMoney = playerMoney + currentBet;
                System.out.println("Money Gained: $" + currentBet);
            }
            if (p1Score <= dealScore ){
                System.out.println("The Dealer Wins!");
                playerMoney = playerMoney - currentBet;
                System.out.println("Money Lost: $" + currentBet);

            }
        }
        if (p1Score > 21){
            System.out.println("The Player Busts, The Dealer Wins!");
            playerMoney = playerMoney - currentBet;
            System.out.println("Money Lost: $" + currentBet);
        }
        else if(dealScore > 21){
            System.out.println("The Dealer Busts, The Player Wins!");
            playerMoney = playerMoney + currentBet;
            System.out.println("Money Gained: $" + currentBet);
        }

    }








}
