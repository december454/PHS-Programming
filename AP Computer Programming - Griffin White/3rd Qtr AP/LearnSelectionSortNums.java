/**
 * @(#)LearnSelectionSortNums.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/15
 */
//WOULD HAVE BEEN NICE TO TELL THE PERSON WHAT TO ENTER
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class LearnSelectionSortNums {

    public static void main (String [] args)
    {
    	//Instantiating a Scanner to take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//An int array that will hold all of the values entered by the user.
    	int [] NumList = new int [10];
    	
    	//Asking the user to enter 10 numbers.
    	System.out.println ("Please enter 10 numbers: ");
    	
    	//A for loop that will cycle until the user has entered 10 values.
    	for (int I = 0; I < 10; I ++)   	
    		//Taking in the user's input.
    		NumList [I] = Input.nextInt();
    	
    	System.out.println();
    	
    	//Calling to the "PrintList" method and printing out the original values.
    	PrintList (NumList);
    	
    	//Calling to the "SelectionSort" method and sorting the list.
    	NumList = SelectionSort (NumList);
    	
    	//Calling to the "PrintList" method again and printing out the sorted list.
    	PrintList (NumList);   	
    }
    
    //A method which will print out the list.
    public static void PrintList (int [] Temp)
    {
    	//A for loop that will cycle once for each value.
    	for (int I = 0; I < 10; I ++)
    		//Printing out each value.
    		System.out.print (Temp[I] + (" "));
    	
    	//Moving down a line.	
    	System.out.println ("\n");
    }
    
    //A method that will perform a selection sort on the list.
    public static int [] SelectionSort (int [] Ray)
    {
    	//A for loop that will cycle once for each value in the list.
    	for (int K = 0; K < Ray.length-1; K++)
    	{
    		//An int variable that will hold the minimum value in the list.
    		int Min = K;
    		
    		//An inner for loop that will cycle once for each unsorted value in the list.
    		for (int J = K + 1; J < Ray.length; J++)
    		{
    			//An if statement for when the current value is less than the minimum.
    			if (Ray[J] < Ray[Min])
    				//Making that value the new minimum.
    				Min = J;
    		}
    		
    		//An if statement for when the minimum is not in the current location.
    		if (Min != K)
    		{
    			//A temporary variable that takes in the minumum value.
    			int Temp = Ray[Min];
    			//Swaping the value of the next spot in the list and the minimum value.
    			Ray [Min] = Ray [K];
    			Ray [K] = Temp;
    		}
    	}
    	
    	//Returning the sorted list.
    	return Ray;
    }   
}