/**
 * @(#)Tribonacci.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/26
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Tribonacci {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("Tribonacci.in"));
    	
    	//An array that will hold the values of the "Tribonacci" sequence up to the 30th value.
    	int TriArray [] = new int [31];
    	
    	//Setting the values of the first three entries in the sequence.
    	TriArray [0] = 0;
    	TriArray [1] = 1;
    	TriArray [2] = 1;
    	
    	//A for loop that will cycle until assgining the 30th value.
    	for (int I = 3; I <= 30; I++)
    		//Finding the current value by adding together the previous three values.
    		TriArray [I] = TriArray [I-1] + TriArray [I-2] + TriArray [I-3];
    	
    	//An int variable that will record the values from the data file.
    	int Selection = 0;
    	
    	//A while loop that will cycle until it reads in "-1".
    	while (Selection >= 0)
    	{	//YOU ARE READING THIS NUMBER FROM AN INPUT FILE
    		//Assinging the next value in the data file to the aforementioned variable.
    		Selection = DF.nextInt();
    		
    		//An if statement that will stop the program from trying to print a value in the location of -1.
    		if (Selection >= 0)
    			//Printing out the number in the user's desired location in the sequence.
    			System.out.println (TriArray[Selection]);
    	}	
    }
}