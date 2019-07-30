/**
 * @(#)FirendList.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/13
 */

//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class FirendList 
{
    public static void main (String [] args)  
    {
    	//An int variable which will hold the user's menu choice.
    	int MenuChoice = 0;
    	
    	//Instantiating a Scanner to take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//Creating an arraylist which will hold all of the friends in the friends list.
    	ArrayList <String> ListOfFriends = new ArrayList <String>();
    	
    	//A do while loop which surrounds the main program.
    	do 
    	{
    		//Printing out the main menu.
    		System.out.println ("\nMain Menu\n1. Add a friend\n2. Delete a friend\n3. Show list\n4. Exit");
    		
    		//Taking in the user's choice.
    		MenuChoice = Input.nextInt(); 
    			
    		Input.nextLine();
    		 
    		//A series of switch statements for each menu option.  	
    		switch (MenuChoice)
    		{
    			//The case for option 1.
    			case 1:
    			//Asking the user to enter the firend's name.
    			System.out.println ("\nPlease enter new friend's name:");    		
    			//Adding it to the arraylist.
    			ListOfFriends.add (Input.nextLine());
    			break;
    			
    			//The case for option 2.
    			case 2:
    			//Asking the user to enter the friend's name.
    			System.out.println ("\nPlease enter the friend's name to be deleted:");   			
    			//Removing the desired entry.	
    			ListOfFriends.remove (Input.nextLine());
    			break;
    			
    			//The case for option 3.
    			case 3:
    			//Printing out that this is the friend list.	
    			System.out.println("\nFriend List:");
    			//A for each loop that will print out the list.
    			for (String CurrentName: ListOfFriends)	
    				//Printing out the current name.
    				System.out.print (CurrentName + " ");
    			System.out.println();	
    			break;	
    		}
    	}
    	//Quiting the program when the user desires.
    	while (MenuChoice != 4);
    }
}