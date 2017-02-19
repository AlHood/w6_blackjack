
public class Card {

private String suit;
private int faceValue;
public int gameValue;
private int determineGameValue;

public Card(String suit, int faceValue) {
this.suit = suit;
this.faceValue = faceValue;

if (this.faceValue == 1 ) { determineGameValue = 11;
} else if (this.faceValue > 10) {
  determineGameValue = 10;
} else { determineGameValue = this.faceValue;
}

this.gameValue = determineGameValue;
}

public String prettyName() {

// ugh, too tired

return "some card";

}
















}