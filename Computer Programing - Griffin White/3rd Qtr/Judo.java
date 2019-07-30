/**
 * @(#)Judo.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/27
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Judo {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("judo.dat"));
    	
    	//Assigning the number of data files to an int variable.
    	int DFNum = DF.nextInt();
    	
    	//The outer for loop that will cycle until "H" is greater than "DFNum".
    	for (int H = 0; H <= DFNum; H++)
    	{
    		//Assigning the value of one line of the data file to a String variable.
    		String Line    = DF.nextLine();
    		//Creating a new (chopper) Scanner object that holds the value of the previously mentioned line.
    		Scanner DFLine = new Scanner (Line);
    		
    		//The inner loop that will cycle until each name in "DFLine" has been read in.
    		while (DFLine.hasNext())
    		{
    			//Reading in the competitor's name and assigning it to a String variable.
    			String CompName = DFLine.next();
    			
    			//Reading in the first letter of the competitor's name, capitailizing it, and assigning it to a String variable.
    			String FirstLetter = (CompName.substring (0,1)).toUpperCase();
    			//Taking the rest of their name, minus the first letter, and assigning it to a String variable.
    			String RestOfName  = CompName.substring(1);
    			
    			//Printing out the capitailized first letter of the competitor's name and then the rest of their name.
    			System.out.print (FirstLetter + RestOfName + " ");
    		}
    		
    		//Moving down to the next line before starting on the next competitor.
    		System.out.println();
    	}
    	
    	System.out.println();
    }
    
    
}