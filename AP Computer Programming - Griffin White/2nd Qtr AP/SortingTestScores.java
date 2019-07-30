/**
 * @(#)SortingTestScores.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/5
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class SortingTestScores {

    public static void main (String [] args)
    {
    	//Instantiation a Scanner object that will read in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A string variable that will record whether or not the user wants to run the program again.
    	String Response = "";
    	
    	//A do while loop that encompasses the program.
    	do
    	{
    		//An int array which will hold the entered scores.
    		int [] ScoreArray = new int [10];
    		//An int variable which will hold the average of the scores.
    		int Average     = 0;
    		//An int variable which will hold the location of a searched value.
    		int ValueSearch = 0;
    		
    		//Asking the user to enter 10 scores.
    		System.out.println ("\nEnter 10 scores");
    		
    		//A for loop which will cycle 10 times and fill in the array.
    		for (int I = 0; I < 10; I++)
    			//Taking in the currently entered score.
    			ScoreArray [I] = Input.nextInt();
    		
    		//Printing out the original list of score.
    		System.out.print ("\nOriginal List: ");
    		for (int I = 0; I < 10; I++)
    			System.out.print (ScoreArray [I] + " ");
    		
    		//Sorting the array from least to greatest.
    		Arrays.sort (ScoreArray);
    		//Printing out the array which is now sorted.
    		System.out.print ("\nLow to High  : ");
    		for (int I = 0; I < 10; I++)
    			System.out.print (ScoreArray [I] + " ");
    		
    		//Printing out the array from greatest to least.	
    		System.out.print ("\nHigh to Low  : ");
    		for (int I = 9; I >= 0; I--)
    			System.out.print (ScoreArray [I] + " ");
    		
    		//Printing out the highest score.	
    		System.out.println ("\nHighest Score: " + ScoreArray [9]);
    		
    		//Printing out the lowest score.
    		System.out.println ("Lowest Score : " + ScoreArray [0]);
    		
    		//Calculating the average score and printing it out.
    		System.out.print ("Average Score: ");
    		for (int I = 9; I >= 0; I--)
    			Average += ScoreArray [I];
    		//Printing out the average score roundd to the nearest tenth.	
    		System.out.printf ("%.1f", Average / 10.0);
    		
    		//Asking the user to enter a value to search for.
    		System.out.println ("\n\nEnter a value to search for");
    		
    		//Assigning the location of the value they entered to the "ValueSearch" varaible.
    		ValueSearch = Arrays.binarySearch (ScoreArray, Input.nextInt());
    		
    		//The if statement for when the location is negative and the value was not found.
    		if (ValueSearch < 0)
    			//Printing out that the number was not in the list.	
    			System.out.println ("The value you entered is not in the list.");
    		
    		//The else statement for when the value is found.	
    		else 
    			//Printing out its location in the sorted array.
    			System.out.println ("The value you entered is in spot " + ValueSearch + ".");
    		
    		//Asking the user if they would like to run the program again.	
    		System.out.println ("\nWould you like to run the program again? (Y/N)");
    		//Recording their response.
    		Response = Input.next();
    	}
    	//Running the program again if they desired.
    	while (Response.equalsIgnoreCase ("Y"));
    }
    
    
}