import java.util.ArrayList;


public class Dealer {
  private ArrayList<Card> deck;
  private int i; 
  private int winningScore;
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


//   public void shuffleDeck() {
// This should probably be implemented last as random things are difficult to test.
//   }


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

