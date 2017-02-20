import java.util.ArrayList;
import java.util.Random;


public class Dealer {
  private ArrayList<Card> deck;
  private ArrayList<Card> shuffleDeck;
  private int i; 
  private int winningScore;
  private Random random;
  public Dealer() {
    this.deck = new ArrayList<Card>(); 

  }

  public void getNewDeck() {
    i = 1;
    while (i <= 13 ) {
      deck.add(new Card("Hearts", i));
      i++; 
    }
    i = 1;
    while (i <= 13 ) {
      deck.add(new Card("Diamonds", i));
      i++; 
    }
    i = 1;
    while (i <= 13 ) {
      deck.add(new Card("Clubs", i));
      i++; 
    }
    i = 1;
    while (i <= 13 ) {
      deck.add(new Card("Spades", i));
      i++; 
    }

  }


  public int howBigMyDeck() {
    return this.deck.size();
  }


  public void shuffleTheDeck() {
    shuffleDeck = new ArrayList<Card>();
    while (this.deck.size() > 0) {
      shuffleDeck.add(deck.remove(random.nextInt((this.deck.size()+1))));
    }
deck.clear();
deck.addAll(shuffleDeck);
  }



  public Card giveRequestedCard() {
    return deck.remove(1);
  }


  public int determineWinningScore(Table table) {
    winningScore = table.findTopScore();
    return winningScore;
  }


// public String findWinner(int winnersScore) {
// return "The winner is " + player.name + "with " + winnersScore.toString 
//   }


}

