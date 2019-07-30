/**
 * @(#)Rotate.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/11
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Rotate {

    public static void main (String [] args) throws IOException  
    {
    	//Instantiating a Scanner for the entire data file.
    	Scanner DF = new Scanner (new File ("rotate.txt"));
    	
    	//An int variable that will record how many data sets are in the data file.
    	int DSNum = DF.nextInt();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//A set of int variables that will read in the dimensions of the array from the data file.
    		int Rows    = DF.nextInt();
    		int Columns = DF.nextInt();
    		
    		//Moving down to the next line of the data file.
    		DF.nextLine();
    		
    		//A set of int arrays that will represent the original and the rotated matricies.
    		int [][] Original = new int [Rows][Columns];
    		int [][] Rotated  = new int [Columns][Rows];
    		
    		//A set of for loops that will fill in the original array.
    		for (int L = 0; L < Rows; L++)
    		{
    			//Reading in a line from the data file.
    			String LineRaw = DF.nextLine();
    			
    			//Instantiating a Scanner with the value of the prior line.
    			Scanner Line = new Scanner (LineRaw);
    			
    			//An inner for loop that will cycle once for each column.
    			for (int M = 0; M < Columns; M++)
    				//Assiging the current value to the array.
    				Original [L][M] = Line.nextInt();
    		}
    		
    		//A set of loops that will assign the values of the rotated array.
    		for (int J = 0; J < Columns; J++)
    		{
    			//An additional counter to be used in these loops.
    			int Counter = 0;
    			
    			//The inner for loop that will cycle once for each column in the rotated array.
    			for (int K = Rows - 1; K >= 0; K--)
    			{
    				//Assiging the current value to the rotated array.
    				Rotated [J][Counter] = Original [K][J];
    				
    				//Adding one to the counter.
    				Counter++;
    			}
    		}
    		
    		//Printing out a title for the original array.
    		System.out.println ("\nOriginal:");
    		
    		//A set of for loops that will print out the original array.
    		for (int N = 0; N < Rows; N++)
    		{
    			for (int O = 0; O < Columns; O++)
    				//Printing out the current value.
    				System.out.print (Original [N][O] + " ");
    			
    			//Moving down to the next line.
    			System.out.println();	
    		}
    		
    		//Printing out the title for the rotated array.
    		System.out.println ("\nRotated 90 degrees:");
    		
    		//A set of for loops that will print the rotated array.
    		for (int P = 0; P < Columns; P++)
    		{
    			for (int Q = 0; Q < Rows; Q++ )
    				//Printing out the current value.
    				System.out.print (Rotated [P][Q] + " ");
    			
    			//Moving down to the next line.
    			System.out.println();		
    		}			
    	}
    	
    	System.out.println();	
    }
}