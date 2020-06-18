/*
 * Project members: Sam, Tim, Bardha, Sylvia
 * Date: 12/09/15
 * Description: This program is our main program. It instantiates a new player and starts the game. It also prints the winner.
 */

public class Game {

	public static void main(String[] args) {
		Player oNew = new Player();
		oNew.setGame();
		System.out.println(oNew.getWinner());
	}	
}


