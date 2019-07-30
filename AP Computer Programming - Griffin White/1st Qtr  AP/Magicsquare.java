/**
 * @(#)Magicsquare.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/4
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Magicsquare {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("magicsquare.dat"));
    	
    	//An int variable that reads in how many data sets there are in the data file.
    	int DSNum = DF.nextInt();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//Creating a 4 x 4 two dimensional array that will hold the values in the data set.
    		int [][] MagicSquare = new int [4][4];
    		
    		//A set of for loops that will fill in the array.
    		for (int K = 0; K <= 3; K++)
    			//Filling in the current row.
    			for (int L = 0; L <= 3; L++)
    				//Assiging the current value to the array.
    				MagicSquare [K][L] = DF.nextInt();
    		
    		//An int variable that will record the first diagonal line total of the square.	
    		int Diag1  = 0;
    		//An int variable that will record the second diagonal line total of the square.
    		int Diag2  = 0;
    		//An int variable that will record the current row total.
    		int Row    = 0;
    		//An int variable that will record the current column total.
    		int Collum = 0;
    		
    		//The default results for a proper magic square.
    		String Results = "Is a magic square whose constant is ";
    		
    		//A counter variable that will be used in the next loop.
    		int M = 3;
    		
    		//A for loop that will determine the values of each diagonal line in the square.
    		for (int J = 0; J <= 3; J++)
    		{
    			//Calculating the first diagonal line total.
    			Diag1 += MagicSquare [J][J];
    			//Calculating the second diagonal line total.
    			Diag2 += MagicSquare [J][M];
    			//Decreasing the counter variable "M" by one.
    			M--;
    		}
    		
    		//A set of for loops that will calculate the total for the rows and the columns.
    		for (int Z = 0; Z < 1; Z++)
    		{
    			//An inner for loop that wil cycle once for each row in the data set.	
	    		for (int N = 0; N <= 3; N++)
	    		{
	    			//Resetting the value of the current row total.
	    			Row = 0;
	    			
	    			//A for loop that will cycle once for each value in the current row of the array. 
	    			for (int O = 0; O <= 3; O++)
	    				//Ading the current value to the row total.
	    				Row += MagicSquare [N][O];
	    			
	    			//An if statement for when a magic square is not true because of a row or a diagonal.
	    			if (Row != Diag1 || Row != Diag2)
	    			{
	    				//Setting the results to state that it is not a magic square.
	    				Results = "Is not a magic square.";
	    				//Breaking out of the loop.
	    				break;
	    			}
	    		}
	    		
	    		//An inner for loop that will cycle once for each column in the array.
	    		for (int R= 0; R <= 3; R++)
	    		{
	    			//Resetting the current column total.
	    			Collum = 0;
	    			
	    			//A for loop that will cycle once for each value in the current column.
	    			for (int S = 0; S <= 3; S++)
	    				//Adding the current value to the column total.
	    				Collum += MagicSquare [S][R];
	    			
	    			//An if statement for when an when a magic square is not true because of a row, column, or diagonal. 	
	    			if (Row != Diag1 || Row != Diag2 || Collum != Diag1 || Collum != Diag2)
	    			{
	    				//Setting the results to say that it is not a magic square.
	    				Results = "Is not a magic square.";
	    				//Breaking out of the current loop.
	    				break;
	    			}
	    		}
    		}	
    		
    		//A set of for loops that will print out the current magic square.
    		for (int P = 0; P <= 3; P++)
    		{
    			for (int Q = 0; Q <= 3; Q++)
    				//Printing out the current value.
    				System.out.print (MagicSquare [P][Q] + " ");
    			
    			//Moving down to the next line.
    			System.out.println();	
    		}
    			
    		//An if statement for when the magic square is not true.
    		if (Row != Diag1 || Row != Diag2 || Collum != Diag1 || Collum != Diag2)
    			//Printing out the results.
    			System.out.println (Results);
    		
    		//An else statement for when the magic square is true.	
    		else
    			//Printing out the results and what the constant magic number was.
    			System.out.println (Results + Diag1 + ".");
    			
    		System.out.println();
        		
    	}
    }
}