import java.util.ArrayList;


public class Player {

public String name;
private ArrayList<Card> hand;
private int score;

public Player(String name) {
 this.name = name; 
this.hand = new ArrayList<Card>();

}

public void askForCard(Dealer dealer) {
hand.add(dealer.giveRequestedCard());
}

public int howBigMyHand() {
  return this.hand.size();
}


public int howBigMyScore() {
score = 0;
for (Card card : hand){
score += card.gameValue;
}
return score;
}

}



