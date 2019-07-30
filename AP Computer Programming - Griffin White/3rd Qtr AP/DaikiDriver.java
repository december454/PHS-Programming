/**
 * @(#)DaikiDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/28
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class DaikiDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File("daiki.dat"));
    	
    	//Creating an ArrayList of a class to hold all of the info about each toy.
    	ArrayList <Daiki> Toys = new ArrayList <Daiki>();
    	
    	//A while loop that will read in all of the info from the data file.
    	while (DF.hasNext())
    	{
    		//Reading in a line from the data file and splitting it into an array.
    		String [] Line = DF.nextLine().split(",");
    		
    		//Sending over all of the info for the current toy.
    		Toys.add(new Daiki(Line[0],Line[1],Integer.parseInt(Line[2]),Integer.parseInt(Line[3])));    				
    	}
    	
    	//Calling to the "nameSort" method and sorting the list by name.
    	Toys = nameSort (Toys);	
    	//Printing out a heading.
    	System.out.println ("By Name:");
    	//Calling to the "printNames" method and printing the list.
    	printNames (Toys);
    	
    	//Calling to the "weightSort" method and sorting the list by weight.
    	Toys = weightSort (Toys);
    	//Printing out a heading.
    	System.out.println ("\nBy Weight:");
    	//Calling to the "printNames" method and printing the list.
    	printNames (Toys);
    	
    	//Calling to the "colorSort" method and sorting the list by color.
    	Toys = colorSort (Toys);
    	//Printing out a heading.
    	System.out.println ("\nBy Color:");
    	//Calling to the "printNames" method and printing the list.
    	printNames (Toys);
    	
    	//Calling to the "weirdSort" method and sorting the list by weirdness.
    	Toys = weirdSort (Toys);
    	//Printing out a heading.
    	System.out.println ("\nBy Weirdness:");
    	//Calling to the "printNames" method and printing the list.
    	printNames (Toys);
    }
    
    //A method which will print out the list of names.
    public static void printNames (ArrayList <Daiki> Arr)
    {
    	//A for loop that will cycle once for each toy.
    	for (int I = 0; I < Arr.size(); I++ )    	
    		//Printing out a name.
    		System.out.println (Arr.get(I).getName());
    }
    	
    //A method which will perform an insertion sort on the list of toys by name.
    public static ArrayList <Daiki> nameSort (ArrayList <Daiki> Arr)
    {
    	//A set of variables which will hold locations in the arrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the arrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a toy's information from the arrayList.
    		Daiki key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.getName().compareTo (Arr.get(I).getName()) > 0)
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
    	
    //A method which will perform an insertion sort on the list of toys by weight.
    public static ArrayList <Daiki> weightSort (ArrayList <Daiki> Arr)
    {
    	//A set of variables which will hold locations in the arrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the arrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a toy's information from the arrayList.
    		Daiki key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.getWeight() > (Arr.get(I).getWeight()))
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
    
    //A method which will perform an insertion sort on the list of toys by color.
    public static ArrayList <Daiki> colorSort (ArrayList <Daiki> Arr)
    {
    	//A set of variables which will hold locations in the arrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the arrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a toy's information from the arrayList.
    		Daiki key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.getColor().compareTo (Arr.get(I).getColor()) > 0)
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
    	
    //A method which will perform an insertion sort on the list of toys by weirdness.
    public static ArrayList <Daiki> weirdSort (ArrayList <Daiki> Arr)
    {
    	//A set of variables which will hold locations in the arrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the arrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a toy's information from the arrayList.
    		Daiki key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.getWeird() < (Arr.get(I).getWeird()))
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
}