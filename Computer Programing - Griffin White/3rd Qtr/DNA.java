/**
 * @(#)DNA.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/19
 */
//OUTPUT FOR CGATAGAT AND CCTATCTA SAYS GOOD--SHOULD SAY BAD
//GRADE = 90
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class DNA {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner input.
    	Scanner DataFile = new Scanner (new File ("dna.dat"));
    	
    	//Setting up an int variable for the number of data sets.
    	int DSNum = DataFile.nextInt();
    	
    	//The outer for loop that will run once for each data set.
    	for (int J = 0; J < DSNum; J++)
    	{
    		//The string variable for the first DNA string.
    		String String1 = DataFile.next();
    		//The String variable for the second DNA string.
    		String String2 = DataFile.next();
    		System.out.println(String1 +" "+String2);
    		//Some String variables that will be used later in the program.
    		String Temp1   = "";
    		String Temp2   = "";
    		String GoodBad = "";
    		
    		//Assingning the length of the of the DNA Strings to an int variable.
    		int Length = String1.length();
    		
    		//The inner for loop that will run once for each letter of the DNA strings.
    		for (int K = 0; K < Length; K++)	
    		{
    			//Assigning a single letter of the first DNA string to a String variable.
    			Temp1 = String1.substring (K,K+1);
    			//Assigning a single letter of the second DNA string to a String variable. The two letters hold the same place in their respective DNA strings.
    			Temp2 = String2.substring (K,K+1);
    			
    			//The if statement for an "A-T" or "T-A" relationship between the two letters of the DNA strings. 
    			if (Temp1.equalsIgnoreCase ("A") && Temp2.equalsIgnoreCase("T") || Temp1.equalsIgnoreCase("T") && Temp2.equalsIgnoreCase("A"))
    				//Assiging a "Good" value to the "GoodBad" variable since this is a complementary set of letters.
    				GoodBad = "GOOD";
    			
    			//The else if statement for a "G-C" or "C-G" relationship between the two letters of the DNA strings.	
    			else if (Temp1.equalsIgnoreCase ("G") && Temp2.equalsIgnoreCase("C") || Temp1.equalsIgnoreCase("C") && Temp2.equalsIgnoreCase("G"))
    				//Assigning a "Good" value to the "GoodBad" Variable.
    				GoodBad = "GOOD";
    				
    			//The else statement for any letter pairs that are not proper.
    			else 
    			{
    				//Assigning a "Bad" value to the "GoodBad" variable since these are improper combonations. 
    				GoodBad = "BAD";
    				//Exiting the loop since it can already be determined that the relationship between the DNA strings is bad.
    				continue;
    			}	
    		}
    		
    		//Printing out the results for each pair of DNA strings.
    		System.out.println (GoodBad);
    	}
    }
    
    
}