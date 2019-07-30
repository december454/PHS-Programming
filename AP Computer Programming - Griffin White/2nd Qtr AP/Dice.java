/**
 * @(#)Dice.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/24
 */


public class Dice {
	
	//A set of int variables that will hold the number of times to roll the dice and how many boxcars were rolled.
	private int NumRolls, Boxcars;

	//The default constructor that assigns the number sent over to the "NumRolls" variable.
    public Dice(int NumRolls1) 
    {
    	//Setting how many times the dice are to be rolled.
    	NumRolls = NumRolls1;
    }
    
    //The method which will record the number of boxcars rolled by calling to other methods.
    public int RollDice ()
    {
    	//The main for loop which will cycle once for each dice roll.
    	for (int I = 0; I < NumRolls; I++)
    	{
    		//Setting the ramdom values for each die.
    		int DieA = (int)(Math.random() * 6 + 1);
    		int DieB = (int)(Math.random() * 6 + 1);
    		System.out.println(DieA +" "+DieB);
    		//The if statement for when it rolls boxcars.
    		if (DieA == 6 && DieB == 6)
    			//Calling to the "CountBoxcars" method.
    			CountBoxcars();
    	}
    	
    	//Returning the value of the "ReturnBoxcars" method.
    	return ReturnBoxcars();   	
    }
    
    //The method which will tally the boxcars rolled.
    public void CountBoxcars ()
    {
    	//Adding one to the boxcars total.
    	Boxcars++;
    }
    
    //The method which will return the number of boxcars rolled.
    public int ReturnBoxcars ()
    {
    	//Returning the number of boxcars.
    	return Boxcars;
    }   
}