/**
 * @(#)LearnInsertionSortNames.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/21
 */
//GRADE = 100
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class LearnInsertionSortNames {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner to take in the user's Input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A String array that will hold all of the names entered.
    	String [] NameList = new String [10];
    	
    	//Asking the user to enter 10 names.
    	System.out.println("Please enter 10 names:");
    	
    	//A for loop that will cycle once for each name.
    	for (int I = 0; I < 10; I++)
    		//Taking in the user's input.
    		NameList [I] = Input.next();
    	
    	//Printing a heading for the original list.
    	System.out.println ("\nOriginal List:");
    	
    	//Calling to the "PrintNames" method and printing out the list.
    	PrintNames (NameList);
    	
    	//Calling to the "InsertionSort" method and sorting the list.
    	NameList = InsertionSort (NameList);
    	
    	//Printing a heading for the sorted list.
    	System.out.println ("Sorted List:");
    	
    	//Calling to the "PrintNames" method and printing out the sorted list.
    	PrintNames (NameList); 	
    }
    
    //A method which will print out the names.
    public static void PrintNames (String [] Temp)
    {
    	//A for loop that will cycle once for each name.
    	for (int I = 0; I < 10; I ++)
    		//Printing out a name.
    		System.out.print (Temp[I] + (" "));
    	
    	//Moving down a line.	
    	System.out.println ("\n");
    }
    
    //A method which will perform an insertion sort on the list of names.
    public static String [] InsertionSort (String [] Arr)
    {
    	//A set of counters to be used in the following loops.
    	int I = 0, J = 0;
    	
    	//A for loop that will cycle once for each value in the list.
    	for (J = 1; J < Arr.length; J++)
    	{
    		//A string variable that will hold the current value from the list.
    		String key = Arr[J];
    		//Assigning a new value to "I";
    		I = J - 1;
    		
    		//A while loop that will cycle until the name is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement for when value is in the proper location.
    			if (key.compareTo (Arr [I]) < 0)
    				//Breaking out of the loop.
    				break;
    				
    			//Moving the value up one location.
    			Arr [I + 1] = Arr [I];
    			//Moving back in the list.
    			I--;
    		}
    		//Placing the current value in its proper place.
    		Arr [I + 1] = key;
    	}
    	
    	//Returning the sorted array.
    	return Arr;
    }
}