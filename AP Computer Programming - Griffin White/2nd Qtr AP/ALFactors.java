/**
 * @(#)ALFactors.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/14
 */
 

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class ALFactors {
	
	//A private Integer ArrayList that will will hold all of the number's factors.
	private ArrayList <Integer> NumList = new ArrayList <Integer>();
	
	//A private int variable that will take in the number sent over.
	private int Num = 0;
	
	//The main constructor that takes in the values sent over.
    public ALFactors(int Num1) 
    {
    	//Assigning the value sent over to "Num".
    	Num = Num1;
    }
    
    //A method which will return the factors of the number sent over.
    public ArrayList<Integer> Factors () 
    {
    	//A for loop that will test every possible factor of the value.
    	for (int I = 1; I < Num; I++)
    		//An if statement for when the current number is a factor of the value sent over.
    		if (Num % I == 0 && I != 1)
    			//Adding it to the arraylist.
    			NumList.add (I);
    		
    	//Returning the ArrayList.
    	return (NumList);
    }
    
    //A method for removing the non-composite numbers from the arraylist.
    public ArrayList<Integer> CompNums () 
    {
    	//A for loop that will cycle once for each value in the list.
    	for (int I = 0; I < NumList.size(); I++)
    	{
    		//A for loop that will test every possible factor of the value.
    		for (int J = 1; J < NumList.get(I); J++ )
    		{
    			//An if statement for when the number is composite.
    			if (NumList.get(I) % J == 0 && J != 1)
    				//Breaking out of the loop and moving on to the the next value.
    				break;
    				
    			//An else statement for when the number was not compisite.
    			else if (J == NumList.get (I) - 1)	
    				//Reassigning the number to zero.
    				NumList.set (I, 0);
    		}
    	}
    	
    	//Removing all of the non-composite numbers.
    	NumList.removeAll (Arrays.asList(0));
    		
    	//Returning the modified arraylist.
    	return (NumList);
    }
    
    
}