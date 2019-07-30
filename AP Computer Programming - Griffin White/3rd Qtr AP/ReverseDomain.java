/**
 * @(#)ReverseDomain.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/28
 */
 //GRADE = 100
 //Importing everything that I may need.
import java.io.*;
import java.util.*;

public class ReverseDomain {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("domains.txt"));
    	
    	//An ArrayList which will hold all of the reversed domains.
    	ArrayList <String> AllDomains = new ArrayList <String>();
    	
    	//Printing out an "Original List" heading.
    	System.out.println ("Original List:");
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Reading in a line from the data file.
    		String Line = DF.nextLine();
    		
    		//Priniting out the current line in its original place.
    		System.out.println ("	" + Line);
    		
    		//Breaking up the current line at the periods and putting the segments in an array.
    		String [] Domain = Line.split("\\.");
    		
 			//Calling to the method that will reverse the domain and assiging the result to a String variable.
    		String Reversed = ReverseList (Domain);
    			
    		//Adding the reversed domain to the "AllDomains" ArrayList.
    		AllDomains.add (Reversed); 	
    	}
    	
    	//Performing an insertion sort on the ArrayList.
    	AllDomains = InsertionSort (AllDomains);
 		
 		//Printing out the sorted list.   
    	System.out.println ("\nSorted List:");
    	//Calling to the "PrintList" method.
    	PrintList (AllDomains);   
    }
    
	//A method which will perform an insertion sort on the domain list.  
    public static ArrayList <String> InsertionSort (ArrayList <String> Arr)
    {
    	//A set of variables which will hold locations in the arrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the arrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a domain from the arrayList.
    		String key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.compareTo (Arr.get(I)) > 0)
    				//Breaking out of the loop if the value is in the proper place.
    				break;
    			
    			//Moving a value back one spot.
    			Arr.set (I + 1, Arr.get(I));
    			
    			//Moving back to the next spot to check.
    			I--;
    		}
    		//Placing the current value in its proper location.
    		Arr.set (I + 1, key);
    	}
    	//Returning the sorted list.
    	return Arr;
    }
    
    //A method which will print out the domains.
    public static void PrintList (ArrayList <String> Domains)       
    {
    	//A for loop that will cycle once for each value in the ArrayList.
    	for (int I = 0; I < Domains.size(); I++)
    		//Printing out the current value.
    		System.out.println ("	" + Domains.get(I));
    }
    
    //A method which will reverse the current domain.
    public static String ReverseList (String [] Arr) 
    {
    	//A String variable to hold the reversed domain.
    	String Reversed = "";
    	
    	//A for loop that will cycle once for each segment.	
    	for (int I = Arr.length - 1; I >= 0; I--)
    	{
    		//Adding the current value to the String.
    		Reversed += Arr [I];
    		
    		//An if statement for every value that isn't the last.
    		if (I != 0)
    			//Seperating each segment with a period.
    			Reversed += ".";
    	}
    	
    	//Returning the reversed domain.
    	return Reversed;
    	
    }    
}