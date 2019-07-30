/**
 * @(#)Samantha.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/5/14
 */
//2 INCORRECT ANSWERS
//GRADE = 96
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Samantha {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("samantha.dat"));
    	
    	//The main while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Reading in the "X" value from the data file and assigning it to an int variable.
    		int X = DF.nextInt();
    		//Reading in the number of integers, the "N" value, and assigning it to an int variable.
    		int N = DF.nextInt();
    		
    		//An int variable that will hold the sum of all of the integers in each line.
    		int Total = 0;
    		
    		//An int variable, "LS", that will hold the value of the low sum.
    		int LS = 0;
    		//An int variable, "HS", that will hold the value of the high sum.
    		int HS = 0;
    		
    		//An int array that will hold the value of each integer in the line. 
    		int [] Integers = new int [N];
    		
    		//A for loop that will read in every integer in the line.
    		for (int I = 0; I < N; I++)
    		{
    			//Assiging the current integer to the "Integers" array.
    			Integers [I] = DF.nextInt();
    			//Adding the current integer to the sum of all the integers, "Total".
    			Total += Integers [I];
    		}
    		
    		//A for loop that will determine the values for "LS" and "HS".
    		for (int J = 0; J < N; J++)
    		{
    			//An if statement for if the current integer being examined is less than the mean of all of the integers.
    			if (Integers [J] < Total / N)
    				//Adding the current integer to "LS".
    				LS += Integers [J];
    			
    			//An else if statement for if it is greater than or equal to the mean of all of the integers.
    			else if (Integers [J] >= Total / N)	
    				//Adding the current integer to "HS".
    				HS += Integers [J];
    		}
    		
    		//An int variable that will hold the value calculated by the given formula.
    		int Unclear = (int)(((.06 + X * .07) * LS) + (4 * X * .0789 * HS));
    			
    		//Printing out the mean of the integers.	
    		System.out.print (Total / N + " ");
    		
    		//An if statement for if there is an odd number of integers.
    		if (N%2 != 0)
    			//Printing out the median number.
    			System.out.print (Integers [N/2] + " ");
    		//An else if statement for if there is an even number of integers.	
    		else if (N%2 == 0)	
    			//Calculating the median given the two numbers in the middle of the line of integers and printing it out.
    			System.out.print ((Integers [N/2] + Integers [N/2-1]) / 2 + " ");
    		
    		//Printing out the value of "Unclear".
    		System.out.println (Unclear);   		
    	}
    }   
}