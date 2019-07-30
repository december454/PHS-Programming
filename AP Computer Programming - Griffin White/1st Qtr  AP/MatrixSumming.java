/**
 * @(#)MatrixSumming.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/13
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class MatrixSumming {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File("matsum.dat"));
    	
    	//The raw values that will be put into the matrix.
    	String MatrixRaw = "1 2 3 4 5 6 7 8 9 0 6 7 1 2 5 6 7 8 9 0 5 4 3 2 1";
    	
    	//Turing the raw matrix data into a Scanner.
    	Scanner RawScan = new Scanner (MatrixRaw);
    	
    	//Creating a two dimensional int array.
    	int [][] Matrix = new int [5][5];
    	
    	//A set of for loops that will fill in the matrix and print it out.
    	for (int I = 0; I < 5; I++)
    	{
    		for (int J = 0; J < 5; J++)
    		{	
    			//Assiging the current value.
    			Matrix [I][J] = RawScan.nextInt();
    			//Printing the current value.
    			System.out.print (Matrix [I][J] + " ");
    		}
    		
    		//Moving down to print on the next line.
    		System.out.println();	
    	}
    		
    	System.out.println();
    	
    	//The main while loop that will cycle until reaching the end of the data file.	
    	while (DF.hasNextInt())
    	{
    		//An int variable that will read in the "Row" coordinates.
    		int Row    = DF.nextInt();
    		//An int variable that will read in the "Column" coordinates.
    		int Column = DF.nextInt();
    		//An int variable that will keep track of the matrix sum.
    		int MatSum = 0;
    		
    		//A set of for loops that will find the matrix sum.
    		for (int K = Row - 1; K <= Row + 1; K++)
    		{
    			//A for loop that will cyle once for each of the surrounding columns.
    			for (int L = Column - 1; L <= Column + 1; L++)
    			{
    				//An if statement that keep the matrix values within bounds.
    				if (K >= 0 && K <= 4 && L >= 0 && L <= 4)
    					//Adding the current matrix value.
    					MatSum += Matrix [K][L];
    			}
    		}
    		
    		//Printing out the results of the matrix sum.
    		System.out.println ("The sum of " + Row + "," + Column + " is " + MatSum + ".");
    
    	}
    	
    	System.out.println();
    }   
}