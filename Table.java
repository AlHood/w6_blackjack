import java.util.ArrayList;


public class Table {

private ArrayList<Player> game;
private Player player1;
private int topScore;
private ArrayList<String> winners;


public Table() {
this.game = new ArrayList<Player>();


}

public void addPlayerToGame(Player newPlayer) {
  game.add(newPlayer);

}

public int howManyPlayers() {
return game.size();
}

public int findTopScore(){
topScore = 0;
for (Player player : game ) {
topScore = Math.max(player.howBigMyScore(), topScore);
}
return topScore;

}

public ArrayList<String> findPlayerWithScore(int playerScore){
  winners = new ArrayList<String>();
for (Player player : game ){
  if (player.howBigMyScore() == playerScore ) {
winners.add(player.name);
  }
}

  return winners; 
}



}





