import java.util.ArrayList;


public class Table {

private ArrayList<Player> game;
private Player player1;
private int topScore;


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





}





