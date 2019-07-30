/**
 * @(#)OnePotato.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/26
 */
 
 //Importing everything that I may need.
 import java.io.*;
 import java.util.*;

public class OnePotato {
	
	//Instantiating a private String ArrayList which will hold all of the student's names.
	private ArrayList <String> NameList;
	//A private int variable which will keep track of the current location being looked at in the ArrayList.
	private int CurrentSpot = 0;
	
	//The main constructor which will take in the values sent over from "OnePotatoDriver".
    public OnePotato(String SentNames) 
    {
    	//Assigning the sent over names to the "NameList".
    	NameList = new ArrayList <String>(Arrays.asList(SentNames.split(" ")));
    }
	
	//The "ItCalculator" method which will find out which student is it.
    public void ItCalculator ()
    {
    	//A while loop that will cycle until only one student is left.
    	while (NameList.size() > 1)
    	{
			//A for loop which will cycle 15 times, once for each phrase in the game.
    		for (int I = 0; I < 14; I++)
    		{
    			//An if statement for when the the "CurrentSpot" being looked at exists within the "NameList".
    			if (CurrentSpot < NameList.size() - 1)
    				//Moving to the next spot.
    				CurrentSpot++;
 				
 				//An else statement for when the "CurrentSpot" being looked at is too large for the "NameList".
    			else
    				//Setting the "CurrentSpot" back to the begining of the "NameList".
    				CurrentSpot = 0;    			
    		} 
    			   	
			//Removing the name that the game stopped on.    		
    		NameList.remove (CurrentSpot);
    		
    		//An if statement for if the "CurrentSpot" is now out of bounds since a name was removed.
    		if (CurrentSpot == NameList.size())
    			//Setting the "CurrentSpot" back to the begining of the "NameList".
    			CurrentSpot = 0;	    		
    	}    	    	
    }
    
    //A method which will print the one remaining student.
    public void ItPrinter ()
    {
    	//Printing out who is it.
    	System.out.println(NameList.get(0));
    }    
}