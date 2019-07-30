/**
 * @(#)BookDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/10
 */
 //GRADE = 100
 //GRADE WITH SORT = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class BookDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("Books.txt"));
    	
    	//Instantiating an ArrayList of a class to hold all of the information about the books.
    	ArrayList <Book> BookInfo = new ArrayList <Book>();
    	
    	//An int that will keep track of how many books there are.
    	int Length = 0;
    	
    	//A while loop that will cycle through the data file.
    	while (DF.hasNext())
    	{
    		//Reading in all the info about the book and sending it over to the ArrayList.
    		BookInfo.add (new Book (DF.nextLine(), DF.nextLine(), DF.nextLine(), DF.nextDouble()));
    		//Adding one to the number of books.
    		Length++;
    		
    		//Moving down to the next line of the data file if needed.
    		if (DF.hasNextLine())
    			DF.nextLine();
    	}
    	
    	//Printing out the fiction heading.
    	System.out.println ("	Fiction:\n\n");
    	
    	//A for loop that will go through every book.
    	for (int I = 0; I < Length; I++)
    		//An if statement for when the book is fiction.    	
    		if (BookInfo.get(I).getFictOrNF().equals ("F"))
    			//Printing out the book.
    			System.out.println (BookInfo.get(I).getTitle());
    	
    	//Printing out the non-fiction heading.
    	System.out.println ("\n\n\n	Non-Fiction:\n\n");
    	
    	//A for loop that will cycle through each book.
    	for (int I = 0; I < Length; I++)  
    		//An if statement for when the book is non-fiction.  	
    		if (BookInfo.get(I).getFictOrNF().equals ("NF"))
    			//Printing out the book.
    			System.out.println (BookInfo.get(I).getTitle());
    	
    	//Calling to method that will sort the books and print them out by author's name.		
    	SelectionSort(BookInfo);
    }
    
   //A method which will sort all of the books by author and print them.
   public static void SelectionSort (ArrayList <Book> Stuff)
   {
   	//A for loop that will cycle until reaching the end of the list.
   	for (int I = 0; I < Stuff.size()-1; I++)
   	{
   		//An int variable that will hold the smallest value in the list.
   		int Spot = I;
   		
   		//An inner for loop that will cycle once for each unsorted value in the list.
   		for (int J = I; J < Stuff.size(); J++)
   		{
   			//An if statement for when the current value is less than the "Spot" value.
   			if (Stuff.get(J).getAuthor().compareTo(Stuff.get(Spot).getAuthor()) < 0)
   				//Making that the new "Spot" value.
   				Spot = J;
   		}
   		
   		//An if statement for when the "Spot" location is the current location.
   		if (Spot == I)
   			//Skipping the following code.
   			continue;
   		
   		//A String variable that temporarily holds the value in location "I".	
   		Book Save = Stuff.get(I);
   		
   		//Swapping the values in location "I" and "Spot".
   		Stuff.set(I, Stuff.get(Spot));  		
   		Stuff.set(Spot, Save);		
   	}
   	
   	//Printing out a heading.
   	System.out.println ("\n\n\n	Sorted List:\n\n");
   	
   	//A for loop that prints the sorted books.
   	for (int L = 0; L < Stuff.size(); L ++)
    		//Printing out a book and author.
    		System.out.println (Stuff.get(L).getTitle() + (" by ") + Stuff.get(L).getAuthor());
   		
   	}    
}