/**
 * @(#)Names.java
 * Griffn White
 *
 * @author 
 * @version 1.00 2018/11/29
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Names {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("Names.txt"));
    	//Instantiating a Scanner object to take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A while loop which will run through each list of names.
    	while (DF.hasNext())
    	{
    		//Assigning the list of names to an ArrayList.
    		ArrayList <String> NameList = new ArrayList <String> (Arrays.asList(DF.nextLine().split(" ")));
    		
    		//Printing out the original list.
    		System.out.println ("Original List: " + NameList);
    		
    		//Sorting the list.
    		Collections.sort (NameList);	
    		//Printing out the sorted list.
    		System.out.println ("\nSorted List: " + NameList);
    		//Asking the user who to search for in the sorted list.
    		System.out.println ("\nWho would you like to search for?");
    		//Taking in their input.
    		String NameSearch = Input.nextLine();
    		//Finding the location of the name they entered with "indexOf".
    		int Location = (NameList.indexOf (NameSearch));
    		
    		//An if statment for when the name they entered is found in the list.
    		if (Location >= 0)
    			//Printing out the name and where it is located in the list.
    			System.out.println (NameSearch + " is in position " + Location);
    		//An else statement for when the name is not found.	
    		else
    			//Printing out that the name is not in the list.
    			System.out.println (NameSearch + " is not in the list");
    		
    		//Reversing the ArrayList.
    		Collections.reverse (NameList);
    		//Printing out the reversed list.
    		System.out.println ("\nList Reversed: " + NameList);
    		//Asking who the user wants to search for.
    		System.out.println ("\nWho would you like to search for?");
    		//Taking in their input.
    		NameSearch = Input.nextLine();   		
    		//Using ".contains" to see if the name is in the list and assigning the results to a boolean variable.
    		boolean Contains = NameList.contains (NameSearch);
    		
    		//An if statement for if the name is found in the list.
    		if (Contains == true)
    			//Printing out the name and saying that it was found.
    			System.out.println (NameSearch + " is in the list");
    		//An else statement for when the name is not found.
    		else
    			//Printing out that it was not found.
    			System.out.println (NameSearch + " is not in the list");
    		
    		//Reversing the list back to normal.	
    		Collections.reverse (NameList);
    		//Asking the user who they want to search for.
    		System.out.println ("\nWho would you like to search for?");	
    		//Taking in their input.
    		NameSearch = Input.nextLine();
    		//Finding the location of the name with ".binarySearch".
    		Location = Collections.binarySearch (NameList, NameSearch);
    		
    		//An if statement for when the name is found.
    		if (Location >= 0)
    			//Printing out the name and saying that it was found.
    			System.out.println (NameSearch + " is in position " + Location);
    		//An else statement for when the name is not found.
    		else
    			//Printing out the name and saying that it was not found.
    			System.out.println (NameSearch + " is not in the list");
    		
    		//Filling the ArrayList with "Sharks".
    		Collections.fill (NameList, "Sharks");
    		//Rpinting out the new list.
    		System.out.println ("\nNew List: " + NameList + "\n");   				
    	}    	
    }        
}