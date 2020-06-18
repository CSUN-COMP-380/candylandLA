/*
 * Project members: Sam, Tim, Bardha, Sylvia
 * Date: 12/09/15
 * Description: This program sets up our Player. It checks to see if the player won and it also sets up the game.
 */

import java.util.Scanner;

public class Player {
	
	public int p1 = 0;
	public int p2 = 0;
	public int p3 = 0;
	public int p4 = 0;
	private boolean finished = false;
	
	/*
	 * All the accessors and modifiers you need are:
	 * oNew.getSpin() - returns what you spun
	 * oNew.setTurn(int player) - sets the turn for the player
	 * oNew.getTurn() - returns the new position of the player
	 * oNew.getSpecial()
	 */
	public boolean getWinner(int p1, int p2, int p3, int p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		if (p1 > 128) {
			finished = true;
		}
		else if (p2 > 128) {
			finished = true;
		}
		else if (p3 > 128) {
			finished = true;
		}
		else if (p4 > 128) {
			finished = true;
		}
		else {
			finished = false;
		}
		return finished;
	}
	
	public String getWinner() {
		String winner = "";
		if (p1 >= 128) {
			winner = "Player One Wins!";
		}
		else if (p2 >= 128) {
			winner = "Player Two Wins!";
		}
		else if (p3 >= 128) {
			winner = "Player Three Wins!";
		}
		else if (p4 >= 128) {
			winner = "Player Four Wins!";
		}
		return winner;
	}
	
	public void setGame(){
		PlayerMovement oNew = new PlayerMovement();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Candyland!");
		System.out.print("How many players will there be (2-4): ");
		int iPlayers = scan.nextInt();
		
		while(getWinner(p1,p2,p3,p4) != true){
					System.out.print("Player 1's turn. Press any key to spin. ");
					if(scan.next() != null && getWinner(p1,p2,p3,p4) != true){
						oNew.setTurn(p1);
						System.out.println("You landed on " + oNew.getSpin() + ".");
						System.out.println(oNew.getSpecial());
						System.out.println("You moved "+ (oNew.getTurn() - p1) +" spaces. You are at space "+ oNew.getTurn() +".\n");
						p1 = oNew.getTurn();
						
						if (getWinner(p1,p2,p3,p4) != true) {
							System.out.print("Player 2's turn. Press any key to spin. ");
						}
					}
					
					if(scan.next() != null && getWinner(p1,p2,p3,p4) != true)
						{
						
						oNew.setTurn(p2);
						System.out.println("You landed on " + oNew.getSpin() + ".");
						System.out.println(oNew.getSpecial());
						System.out.println("You moved "+ (oNew.getTurn() - p2) +" spaces. You are at space "+ oNew.getTurn() +".\n");
						p2 = oNew.getTurn();
						}
					
					if(iPlayers >= 3  && getWinner(p1,p2,p3,p4) != true){ 
						System.out.print("Player 3's turn. Press any key to spin. ");
						if(scan.next() != null){
							oNew.setTurn(p3);
							System.out.println("You landed on " + oNew.getSpin() + "."); 
							System.out.println(oNew.getSpecial());
							System.out.println("You moved "+ (oNew.getTurn() - p3) +" spaces. You are at space "+ oNew.getTurn() +".\n");
							p3 = oNew.getTurn();
							}
						}
					
					if(iPlayers == 4  && getWinner(p1,p2,p3,p4) != true) {
						System.out.print("Player 4's turn. Press any key to spin. ");
						if(scan.next() != null){
							oNew.setTurn(p4);
							System.out.println("You landed on " + oNew.getSpin() + "."); 
							System.out.println(oNew.getSpecial());
							System.out.println("You moved "+ (oNew.getTurn() - p4) +" spaces. You are at space "+ oNew.getTurn() +".\n");
							p4 = oNew.getTurn();
						}
					}
					
		}
	}
}
