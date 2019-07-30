/**
 * @(#)Distance.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/16
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Distance {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner input.
    	Scanner DataFile = new Scanner (new File ("distance.dat"));
    	
    	//Assigning the number of data sets to an int variable.
    	int DSNum = DataFile.nextInt();
    	
    	//Some variables that will be used in the following loop.
    	double KM   = 0;
    	double MI   = 0;
    	String Unit = "";
    	
    	//The for loop that will run once for each data set.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//Assigning the distance in kilometers to a double variable.
    		KM   = DataFile.nextDouble();
    		//Assigining the unit of the distance to a string variable.
    		Unit = DataFile.next();
    		
    		//Assigning the distance in miles to a double variable.
    		MI   = DataFile.nextDouble();
    		//Assigning the unit of the new distance to a string variable.
    		Unit = DataFile.next();
    		
    		//The if statement for when the distance in kilometers is greater than the distance in miles.
    		if ((KM * .62) > MI)
    		{
    			//Printing out the distance.
    			System.out.printf  ("%.1f", KM);
    			//Printing out the units of the distance.
    			System.out.println (" km");
    		} 
    		
    		//The if statement for when the distance in kilometers is less than the distance in miles.
    		if ((KM * .62) < MI)
    		{
    			//Printing out the distance.
    			System.out.printf  ("%.1f", MI);
    			//Printing out the units of the distance.
    			System.out.println (" miles");
    		}	
    	}
    	
    	System.out.println();
    }
    
    
}