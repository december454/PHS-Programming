/**
 * @(#)House.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/13
 */
//GRADE = 100
//Importing everything that I may need to use.
import java.io.*;
import java.util.*;

public class House {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("house.dat"));
    	
    	//Reading in how many data sets are in the data file.
    	int DSNum = DF.nextInt();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int J = 0; J < DSNum; J++)
    	{
    		//Reading in how much each zero will cost in cents and assigning that value to an int variable.
    		int ZeroCost = DF.nextInt();
    		//Reading in how much each one will cost in cents and assigning that value to an int variable.
    		int OneCost  = DF.nextInt();
    		
    		//An int varaible that will keep track of how many zeroes are in the binary address number.
    		int ZeroTotal = 0;
    		//An int variable that will keep track of how many ones are in the binary address number.
    		int OneTotal  = 0;
    		
    		//Reading in the curent address number, converting it to binary, and then assigning that value to a String variable.
    		String BinaryNum = Integer.toBinaryString(DF.nextInt());
    		
    		//An int variable that will keep track of which digit of the address is being analized and tell the following loop when to stop.
    		int DigitCount = 0;
    		
    		//The inner while loop that will cycle once for each digit of the binary address number.
    		while (DigitCount < BinaryNum.length())
    		{	
    			//Creating a String variable that will read in a single digit from the address.
    			String CurrentDigit = BinaryNum.substring(DigitCount,DigitCount + 1);
    			
    			//The if statement for if "CurrentDigit" is a zero.
    			if (CurrentDigit.equals ("0"))
    				//Adding one to the count of the total number of zeroes.
    				ZeroTotal++;
    			//The else if statement for if it is a one.	
    			else if (CurrentDigit.equals ("1"))	
    				//Adding one to the count of the total number of ones.
    				OneTotal++;
    			
    			//Moving on to the next digit.	
    			DigitCount++;	
    		}
    		//Calculating the final cost of buying all the new numbers.
    		double FinalCost = ((ZeroCost * ZeroTotal) + (OneCost * OneTotal)) / 100.0;
    		
    		//Printing out waht the address would be in binary.
    		System.out.print  (BinaryNum + " " + "$");
    		//Printing out the "FinalCost" of all the new numbers.
    		System.out.printf ("%.2f",FinalCost);
    		//Moving down to the next line.
    		System.out.println();
    	
    		
    	}
    }
    
    
}