import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;



public class GameTest {
 
Dealer dealer;
Table table;
Player player1;
Player player2;
Player player3;
Player player4;



  @Before
  public void before(){
   dealer = new Dealer(); 
   table = new Table();
   player1 = new Player("Alastair");
   player2 = new Player("Balastair");
   player3 = new Player("Calastair");
   player4 = new Player("Dave");
  }


@Test
public void canCreateDeck() {
dealer.getNewDeck(); 

assertEquals( 52, dealer.howBigMyDeck() );

}

@Test
public void canSetupNewGame() {
  table.addPlayerToGame(player1);
  table.addPlayerToGame(player2);
  table.addPlayerToGame(player3);
  table.addPlayerToGame(player4);

assertEquals( 4, table.howManyPlayers());
}

@Test
public void canPlayersGetCards() {
table.addPlayerToGame(player1);
dealer.getNewDeck();
player1.askForCard(dealer);
player1.askForCard(dealer);

assertEquals(2, player1.howBigMyHand());


}

@Test
public void canPlaySimpleGame() {
  table.addPlayerToGame(player1);
  table.addPlayerToGame(player2);
  table.addPlayerToGame(player3);
  table.addPlayerToGame(player4);

  dealer.getNewDeck();
  player1.askForCard(dealer);
  player2.askForCard(dealer);
  player3.askForCard(dealer);
  player4.askForCard(dealer);

assertEquals( 11, dealer.determineWinningScore(table));

}

@Test
public void canShuffleDeck(){
  dealer.getNewDeck(); 
  dealer.shuffleTheDeck();

  assertEquals(52, dealer.howBigMyDeck());
}


}