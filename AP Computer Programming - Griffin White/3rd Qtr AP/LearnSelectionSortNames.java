/**
 * @(#)LearnSelectionSortNames.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/16
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class LearnSelectionSortNames {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner to take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A String array that will hold all of the names entered by the user.
    	String [] NameList = new String [10];
    	
    	//Asking the user to enter 10 names.
    	System.out.println ("Please enter 10 names: ");
    	
    	//A for loop that will cycle until the user has entered 10 names.
    	for (int I = 0; I < 10; I ++)   	
    		//Taking in the user's input.
    		NameList [I] = Input.next();
    	
    	System.out.println();
    	
    	//Calling to the "PrintNames" method and printing out the names in the original order.
    	PrintNames (NameList);
    	
    	//Calling to the "SelectionSort" method that sorts the names and prints them.
    	SelectionSort (NameList);
    	  
    	System.out.println();
    }
    
    //A method which will print out the names.
    public static void PrintNames (String [] Temp)
    {
    	//Printing a heading.
    	System.out.println ("Original List");
    	
    	//A for loop that will cycle once for each name.
    	for (int I = 0; I < 10; I ++)
    		//Printing out a name.
    		System.out.print (Temp[I] + (" "));
    	
    	//Moving down a line.	
    	System.out.println ("\n");
    }
    
   //A method which will sort all of the names and print them.
   public static void SelectionSort (String [] Stuff)
   {
   	//A for loop that will cycle until reaching the end of the list.
   	for (int I = 0; I < Stuff.length-1; I++)
   	{
   		//An int variable that will hold the greatest value in the list.
   		int Spot = I;
   		
   		//An inner for loop that will cycle once for each unsorted value in the list.
   		for (int J = I; J < Stuff.length; J++)
   		{
   			//An if statement for when the current value is greater than the "Spot" value.
   			if (Stuff [J].compareTo(Stuff[Spot]) > 0)
   				//Making that the new "Spot" value.
   				Spot = J;
   		}
   		
   		//An if statement for when the "Spot" location is the current location.
   		if (Spot == I)
   			//Skipping the following code.
   			continue;
   		
   		//A String variable that temporarily holds the value in location "I".	
   		String Save = Stuff [I];
   		
   		//Swapping the values in location "I" and "Spot".
   		Stuff [I] = Stuff [Spot];  		
   		Stuff [Spot] = Save;		
   	}
   	
   	//Printing out a heading.
   	System.out.println ("Sorted List");
   	
   	//A for loop that prints the sorted name list.
   	for (int L = 0; L < 10; L ++)
    		//Printing out a name.
    		System.out.print (Stuff[L] + (" "));
   		
   	}
   
  }
    
