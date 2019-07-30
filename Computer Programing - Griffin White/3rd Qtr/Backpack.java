/**
 * @(#)Backpack.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/13
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Backpack {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DataFile = new Scanner (new File ("backpack.dat"));
    	
    	//Creating a variable for the number of data sets in the file.
    	int DSNum = DataFile.nextInt();
    	
    	//A for loop that will run once for each data set.
    	for (int J = 0; J < DSNum; J ++)
    	{
    		//Reading in the person's weight from the data file and assigning that value to an int variable.
    		int Weight = DataFile.nextInt();
    		
    		//Printing out one third of the person's weight, the maximum weight of their backpack.
    		System.out.println (Weight/3);
    	}
    }
    
    
}