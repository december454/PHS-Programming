/**
 * @(#)Beautiful.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/14
 */
//MONEY SHOULD ALWAYS HAVE 2 DECIMAL PLACES
//GRADE = 95
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Beautiful {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object.
    	Scanner DataFile = new Scanner (new File ("beautiful.dat"));
    	
    	//Assiging the number of data sets to an int variable.
    	int DSNum     = DataFile.nextInt();
    	//Some varibles that will be used in the following loop.
    	double Temp   = 0;
    	double Total  = 0;
    	String Person = "";
    	
    	//A for loop that will run once for each of the data sets.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//Assigning the person's name to a String variable so that the value of their donations is ready to be accessed.
    		Person = DataFile.next();
    		//Assiging the value of the person's donations to an int variable.
    		Temp   = DataFile.nextDouble();
    		
    		//Adding the current person's donations to the total.
    		Total += Temp;
    	}
    	
    	//Printing out the total amount raised by all of the donations.
    	System.out.println ("$" + Total);
    }
    
    
}