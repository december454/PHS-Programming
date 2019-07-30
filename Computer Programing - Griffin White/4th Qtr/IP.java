/**
 * @(#)IP.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/16
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class IP {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("ip.dat"));
    	
    	//Reading in how many data sets are in the data file and assigning that value to an int variable..
    	int DSNum = DF.nextInt();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//Reading in a line from the data file and assigning it to a String variable.
    		String BinaryIP = DF.next();
    		
    		//An int variable that will keep track of which part of the prior line is being analyzed.
    		int Current = 0;
    		
    		//The inner for loop that will cycle once for each of the four octets in the IP address.
    		for (int J = 0; J < 4; J++)
    		{
    			//Reading in the first otet from the line.
	    		String Octet = BinaryIP.substring(Current,Current + 8);
	    			
	    		//Printing out the decimal equivelent of the octet.	
	    		System.out.print (Integer.parseInt(Octet,2));
	    		
	    		//An if statement that will print a period to seperate the octets unless it would be hanging off the end.
	    		if (J < 3)
	    			System.out.print(".");
	    		
	    		//Moving on to the next octet.
	    		Current += 8;
    		}
    	//Moving down to the next line.	
    	System.out.println();	
    	}	
    }   
}