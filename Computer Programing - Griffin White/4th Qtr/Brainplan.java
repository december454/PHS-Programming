/**
 * @(#)Brainplan.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/5/8
 */
//GRADE = 100
//Importing all that I may need.
import java.io.*;
import java.util.*;

public class Brainplan {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("brainplan.txt"));
    	
    	//The main while loop that will cycle once for each pair of scans.
    	while (DF.hasNext())
    	{
    		//Reading in the first scan of the pair and assigning it to a String variable.
    		String Line1 = DF.nextLine();
    		//Assiging the value of the previous String variable to a char array, splitting it up into individual characters.
    		char [] Set1 = Line1.toCharArray();
    		
    		//Reading in the second scan of the pair and assiging it to a String variable.
    		String Line2 = DF.nextLine();
    		//Breaking up the prior String variable and assiging each character to another char array.
    		char [] Set2 = Line2.toCharArray();
    		
    		//Creating another char array that will keep track of when the pairs have the same patterns.
    		char [] Pattern = new char [18];
    		
    		//A for loop that will cycle once for each of the characters in the pair needing to be compared.
    		for (int I = 0; I < 18; I++)
    		{
    			//An if statement for whenever the pairs have the same pattern.
    			if (Set1 [I] == Set2 [I])
    				//Assiging the current character to the "Pattern" array.
    				Pattern [I] = Set1 [I];
    			
    			//An else statement for when the pair does not match.
    			else 
    				//Assiging a "*" to the "Pattern" array.
    				Pattern [I] = '*';	
    		}
    		
    		//Printing out the pattern for pair of scans.
    		System.out.println (Pattern);
    	}
    }    
}