/*
 * Project members: Sam, Tim, Bardha, Sylvia
 * Date: 12/09/15
 * Description: This class gets a random number and determines what space the player should go to on the board.
 */

import java.util.Random;
public class Spinner {

Random randomGenerator = new Random();
String sColorSpace = "";
/**
 * Mutator method:
 * This method picks a random number from the spinner and sets it as our spinner number.
 */
public void setSpin(){
	int iSpin = randomGenerator.nextInt(40);
	//Single colors
	if(iSpin == 1 || iSpin == 2 || iSpin == 3 || iSpin == 4)
	{
		sColorSpace = "Green";
	}
	else if(iSpin == 5 || iSpin == 6 || iSpin == 7 || iSpin == 8)
	{
		sColorSpace ="Purple";
	}
	else if(iSpin == 9 || iSpin == 10 || iSpin == 11 || iSpin == 12)
	{
		sColorSpace ="Yellow";
	}
	else if(iSpin == 13 || iSpin == 14 || iSpin == 15 || iSpin == 16)
	{
		sColorSpace ="Blue";
	}
	else if(iSpin == 17 || iSpin == 18 || iSpin == 19 || iSpin == 20)
	{
		sColorSpace ="Red";
	}
	else if(iSpin == 21 || iSpin == 22 || iSpin == 23 || iSpin == 24)
	{
		sColorSpace ="Orange";
	}
	//Double colors
	else if(iSpin == 25 || iSpin == 26)
	{
		sColorSpace ="Double Green";
	}
	else if(iSpin == 27 || iSpin == 28)
	{
		sColorSpace ="Double Purple";
	}
	else if(iSpin == 29 || iSpin == 30)
	{
		sColorSpace ="Double Yellow";
	}
	else if(iSpin == 31 || iSpin == 32)
	{
		sColorSpace ="Double Blue";
	}
	else if(iSpin == 33 || iSpin == 34)
	{
		sColorSpace ="Double Red";
	}
	else if(iSpin == 35 || iSpin == 36)
	{
		sColorSpace ="Double Orange";
	}
	//Special Spots
	else if(iSpin == 37)
	{
		sColorSpace = "Peppermint Forest";
	}
	else if(iSpin == 38)
	{
		sColorSpace = "Nana's Nutt House";
	}
	else if(iSpin == 39)
	{
		sColorSpace = "Frosted Palace";
	}
	else if(iSpin == 40)
	{
		sColorSpace = "Lollipop Palace";
	}
	}
	/**
	 * Accessor Method:
	 * This method prints out the space that the player rolled. 
	 * 
	 */
	public String getSpin(){
		return sColorSpace;
	}
}
