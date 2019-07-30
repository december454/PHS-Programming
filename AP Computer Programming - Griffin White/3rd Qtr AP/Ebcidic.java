/**
 * @(#)Ebcidic.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/8
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Ebcidic {

    public static void main (String [] Args) throws IOException  
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("ebcdic.txt"));
    	
    	//An array that holds all of the characters for EBCDIC.
    	String [] Characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .,!".split("");
    	
    	//An array that holds all of the hexadecimal values of those characters.
    	String [] CharValues = {"81","82","83","84","85","86","87","88","89","91","92","93","94","95","96","97","98","99","A2","A3","A4","A5","A6","A7","A8","A9",
    	"C1","C2","C3","C4","C5","C6","C7","C8","C9","D1","D2","D3","D4","D5","D6","D7","D8","D9","E2","E3","E4","E5","E6","E7","E8","E9","40","4B","6B","5A"};
		
		//A for loop that will go through each data set in the data file.
		for (int I = DF.nextInt(); I >= 0; I--)
		{
			//A String array that will take in all of the values in the data set.
			String [] CurrentChars = DF.nextLine().split(" ");
			
			//A for loop that will cycle once for each value.
			for (int J = 1; J < CurrentChars.length; J++)
			{
				//An int variable that will find the location of the hexadecimal value's respective character by calling to the "linearSearch" method.
				int Location = linearSearch (CharValues, CurrentChars [J]);
				
				//Printing out the respective charcter.
				System.out.print (Characters [Location]);	
			}
			//Moving to the next line.
			System.out.println();	
		}  	
    }
    
    //A method which will perform a linear search on the "CharValues" array.
    public static int linearSearch (String [] stuff, String item)
	{
		//A for loop that will cycle once for each value in the array.
		for (int i = 0; i < stuff.length; i++)
		{
			//An if statement for when the "item" is found in the array.
			if (stuff[i].compareTo(item)==0)
				//Returning the location it was found in.
				return i;
		}
		//Returning -1 if the value was not found.
		return -1;
	}    
}