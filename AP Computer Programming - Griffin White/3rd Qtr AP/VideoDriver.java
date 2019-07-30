/**
 * @(#)VideoDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/11
 */
//TEST GRADE = 100

//GRADE WITH SORT AND SEARCH = 100
//////////////////////////////////////////////////Complete//////////////////////////////

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class VideoDriver {

    public static void main (String [] args) throws IOException  
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("video.txt"));
    	
    	//Creating an ArrayList of a class to hold all of the movies and their info.
    	ArrayList <Video> MovieInfo = new ArrayList <Video>();
    	
    	//An int variable that will determine how many movies there are.
    	int Counter = 0;
    	
    	//A while loop that will send over all of the movie info and find the number of movies.
    	while (DF.hasNext())
    	{
    		//Sending over the movie info to the class.
    		MovieInfo.add (new Video (DF.nextLine(), DF.nextLine(), DF.nextLine(), DF.nextLine()));
    		
    		//Adding one to the movie counter.	
    		Counter++;
    	}
    	   	
//    	System.out.println ("In Store:");
//    		
//    	for (int I = 0; I < Counter; I++)
//    	{	
//    		if (MovieInfo.get(I).getInStore().equals("yes"))
//    		{    			
//    			System.out.print   (MovieInfo.get(I).getTitle()  + ", ");
//    			System.out.print   (MovieInfo.get(I).getType()   + ", ");
//    			System.out.println (MovieInfo.get(I).getRating());
//    		}   		
//    	}
//    	
//    	System.out.println ("\nNot In Store:");
//    		
//    	for (int I = 0; I < Counter; I++)
//    	{	
//    		if (MovieInfo.get(I).getInStore().equals("no"))
//    		{    			
//    			System.out.print   (MovieInfo.get(I).getTitle()  + ", ");
//    			System.out.print   (MovieInfo.get(I).getType()   + ", ");
//    			System.out.println (MovieInfo.get(I).getRating());
//    		}    		
//    	}
    	
    	//Performing an Insetion Sort on the list of titles.
    	MovieInfo = InsertionSort (MovieInfo);
    	
    	//A for loop that will cycle once for each title.
    	for (int I = 0; I < Counter; I++)
    		//Printing out the sorted list of titles.
    		System.out.println (MovieInfo.get(I).getTitle());
    	
    	//A Scanner that will take in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A String variable that will take in the user's input.
    	String Movie = "";
    	
    	//A while loop that will cycle until the user enters "end".
    	while (!(Movie.equalsIgnoreCase ("End")))
    	{
    		//Asking the user to enter a movie title.
    		System.out.println ("\nPlease enter the title you are looking for:");
    		
    		//Taking in the movie they entered.
    		Movie = Input.nextLine();
    		
    		//An if statement for when the user wants to exit the program.
    		if (Movie.equalsIgnoreCase ("End"))
    			//Breaking out of the loop.
				break;
				
			//Performing a binary search on the list of movies, finding the location of the user's input.
    		int Loc = binarySearch(MovieInfo, Movie);

			//An if statement for if the user's input was not found.
			if (Loc == -1)
			{
				//Asking them to re-type the movie.
				System.out.println ("Plese Re-Type the Title:");
				//Skipping the rest of the loop's code.
				continue;
			}
			
			//An if statement for when the movie is in stock.	
			if (MovieInfo.get(Loc).getInStore().equals ("yes"))
			{
				//Printing out the title, genre, and rating.
				System.out.print   (MovieInfo.get(Loc).getTitle()  + ", ");
    			System.out.print   (MovieInfo.get(Loc).getType()   + ", ");
    			System.out.println (MovieInfo.get(Loc).getRating());		
			}
			
			//An else statement for when the movie is rented out.
			else 
				//Saying that the movie is checked out.
				System.out.println ("Sorry, the video is checked out.");	
    	}    	
    }
    
    //A method which will perform an insertion sort on the list of movies.
    public static ArrayList <Video> InsertionSort (ArrayList <Video> Arr)
    {
    	//A set of variables which will hold locations in the arrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the arrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a movie's information from the arrayList.
    		Video key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.getTitle().compareTo (Arr.get(I).getTitle()) > 0)
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
    
    //A method which will perform a binary search on the list of movie titles.
    public static int binarySearch (ArrayList <Video> stuff, String val)
    {
    	//A set of variables that represent the minimum and maximum values in the ArrayList.
    	int bot = 0, top = stuff.size()-1;
    	
    	//A while loop that will cycle until the value's location is found.
    	while (bot <= top)
    	{
    		//An int variable that calculates the middle of the Arraylist.
    		int middle = (bot + top)/2;
    		
    		//An if statement for when the value is found.
    		if (stuff.get(middle).getTitle().equalsIgnoreCase(val))
    			//Returning the location it was found at.
    			return middle;
    		
    		//An else statement for when the value was not in that location.
    		else
    			//An if statment for when the location should be to the left.
    			if (stuff.get(middle).getTitle().compareTo(val) > 0)	
    				//Moving back a space.
    				top = middle-1;
    			//An else statement for when the location should be to the right.	
    			else 
    				//Moving forward a space.
    				bot = middle+1;	
    	}
    	//Returning -1 if the value was never found.
    	return -1;
    }
}