/*
 * Project members: Sam, Tim, Bardha, Sylvia
 * Date: 12/09/15
 * Description: This class allows each player to move through the board.
 */
import java.util.Scanner;
public class PlayerMovement {
	
	Scanner scan = new Scanner(System.in);
	Spinner oSpin = new Spinner();
	Board board = new Board();
	
	public String special;
	public String spin;
	
	public int player;
	
	public void setTurn(int o){
		player = o;
		
		oSpin.setSpin();
		board.setSpaces();
		
		special = "";

		boolean loseTurn = false;
		boolean notFound = true;
		boolean isDouble = false;
		
		//While loop is so that it breaks once the correct index position is found
		//Sometimes it doesn't want to break out of the loop so I added break statements too
		while (notFound){
			spin = oSpin.getSpin();
			
			if(spin.equals("Peppermint Forest")){
				player = 35;
				notFound = false;
				break;
				}
			
			if(spin.equals("Nana's Nutt House")){
				player = 49;
				notFound = false;
				break;
				}
			
			if(spin.equals("Lollipop Palace")){
				player = 78;
				notFound = false;
				break;
				}
			
			if(spin.equals("Frosted Palace")){
				player = 111;
				notFound = false;
				break;
				}
			
			//Contains finds if the char string double is in Spin, and returns true if it is 
			if(spin.contains("Double")){
				//This creates a substring, so double is cut out of the string and the color name is left
				//So we can compare it in the if statement below
				spin = spin.substring(7);
				//This is so that i can mark if a turn is a double color, and i can add the word "Double" back to the spin
				//So when we return what the player spinned, they'll know its a double.
				isDouble = true;
				//This adds 6 to the players position, so if the player spun a double, it only has to find the single color index
				player += 6;
			}
			//The for loop initializes i to the position of player 1, terminates in 6 loops (or a break statement), and increments 1 each time
			for(int i=player+1; i <= player +8; i++){
				//Checks if the board space is equal to the spin
				if((board.getSpace(i).equals(spin)) && (player <= 128)){
					player = i;
					if (player == 9) {
						special = "You found the Chocolate Bar Road! Skip ahead 36 spaces.";
						player=44;
						break;
						}
					else if(player == 20){
						special = "You found the Gum Drop Lane! Skip ahead 14 spaces.";
						player = 34;
						break;
						}
					
					else
					{
						break;
					}
				}
				else
				{
					notFound = true;
				}
			}
			notFound = false;
		}
		if (isDouble)
			spin = "Double " + spin;		
	} 
	public int getTurn(){
		return player;
	}
	public String getSpecial(){
		return special;
	}
	public String getSpin(){
		return spin;
	}
	
}
