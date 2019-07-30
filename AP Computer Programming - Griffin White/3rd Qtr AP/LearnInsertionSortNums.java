/**
 * @(#)LearnInsertionSortNums.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/18
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class LearnInsertionSortNums {

    public static void main (String [] args)
    {
    	//Instantiating a Scanner to take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//An array to hold all of the values entrered by the user.
    	int [] NumList = new int [10];
    	
    	//Asking the user to enter 10 values.
    	System.out.println ("Please enter 10 numbers: ");
    	
    	//A for loop that will cycle once for each of the ten values.
    	for (int I = 0; I < 10; I++)
    		//Taking in the user's input.
    		NumList [I] = Input.nextInt();
    	
    	//Printing out the original list heading.
    	System.out.println ("\nOriginal List: ");
    	//Calling to the "PrintList" method and printing out the values.
    	PrintList (NumList);
    	
    	//Sorting the list by calling to the "NumList" method.
    	NumList = InsertionSort (NumList);
    	
    	//Printing out the sorted list heading.
    	System.out.println ("Sorted List: ");
    	//Calling to the "PrintList" method again and printing the sorted list.
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
    
    //A method which will perform an insertion sort on the list.
    public static int [] InsertionSort (int [] Arr)
    {
    	//Creating a set of int variables to use in the method.
    	int I, J, NewValue;
    	
    	//A for loop that will cycle until reaching the end of the list.
    	for (I = 1; I < Arr.length; I++)
    	{
    		//Recording the value in the current list location.
    		NewValue = Arr [I];
    		//Recording the current location.
    		J = I;
    		
    		//A while loop will cycle until the current value is in the right location.
    		while (J > 0 && Arr [J - 1] > NewValue)
    		{
    			//Moving the value over to the left one space.
    			Arr [J] = Arr [J - 1];
    			//Moving to the next location.
    			J--;
    		}
    		//Taking in a new value from the list.    		
    		Arr [J] = NewValue;
    	}   	
    	//Returnign the sorted list.	
    	return Arr;
    }    
}