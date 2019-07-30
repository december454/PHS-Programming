/**
 * @(#)Eric.java
 * Griffin Whote
 *
 * @author 
 * @version 1.00 2019/1/10
 */
//GRADE = 100
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Eric {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("eric.dat"));
    	
    	//The main while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNextInt())
    	{
    		//Creating an ArrayList to hold the values in the pattern.
    		ArrayList <Integer> Pattern = new ArrayList <Integer>();
    		
    		//Reading in a pair of values from the data file and putting them in the ArrayList.
    		Pattern.add (DF.nextInt());
    		Pattern.add (DF.nextInt());
    		
    		//An int varaible that will record the final length of the patten.
    		int PatternLength = 0;
    		//An int varaible that keeps track of the position of the last value added to the arraylist.
    		int CurrentValue  = 2;
    		
    		//A while loop that will cycle until finishing the pattern.
    		while (PatternLength == 0)
    		{
    			//Adding together the two latest values from the pattern.
    			int Sum = Pattern.get(CurrentValue - 2) + Pattern.get(CurrentValue - 1);
    			
    			//An if statement for when the sum is one digit.
    			if (Sum < 10)
    				//Adding it to the arraylist.
    				Pattern.add (Sum);
    			
    			//An else statement for two digit sums.	
    			else 
    				//Adding its ones value to the ArrayList.
    				Pattern.add (Sum % 10);
    			
    			//An if statement for when the first two values match the last two.	
    			if (Pattern.get (CurrentValue -1) == Pattern.get (0) && Pattern.get (CurrentValue) == Pattern.get (1))    			
    				//Recording the final length of the pattern.
    				PatternLength = Pattern.size();
    				
    			//Moving to the next value.
    			CurrentValue++;
    		}
    		
    		//Printing out the final length.
    		System.out.println (PatternLength);
    	}
    }
    
    
}