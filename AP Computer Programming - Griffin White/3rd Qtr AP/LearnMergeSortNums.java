/**
 * @(#)LearnMergeSortNums.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/1
 */

/////////////////////////////////////////Complete///////////////////////////////////////
//GRADE = 100
//Importing everything that I may need. 
import java.io.*;
import java.util.*;

public class LearnMergeSortNums {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for taking in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//An int array that will hold the ten numbers entered by the user.
    	int NumList [] = new int [10];
    	
    	//Asking the user to enter ten numbers.
    	System.out.println ("Enter 10 Numbers:");
    	
    	//A for loop that will cycle once for each value entered.
    	for (int I = 0; I < NumList.length; I++)
    		//Taking in a value from the user.
    		NumList [I] = Input.nextInt();
    	
    	//Printing the original list.
    	System.out.println ("\nOriginal List:");
    	//Calling to the "PrintList" method and printing out the original list.
    	PrintList (NumList);
    	
    	//Calling to the "MergeSort" class and sorting out the list of numbers.
    	MergeSort Sorter = new MergeSort ();    	
    	NumList = Sorter.mergeSort (NumList);
    	
    	//Printing out the sorted list.
    	System.out.println ("Sorted List:");
    	//Calling to the printlist method and printing out the sorted list.
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
}