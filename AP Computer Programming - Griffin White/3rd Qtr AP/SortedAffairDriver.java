/**
 * @(#)SortedAffairDriver.java
 *
 *
 * @author 
 * @version 1.00 2019/2/4
 */

//////////////////////////////////////Complete///////////////////////////////////////////
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class SortedAffairDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("SortedAffair.txt"));
    	
    	//Creating an ArrayList of a class that will hold the final team scores.
    	ArrayList <SortedAffair> TeamScores = new ArrayList <SortedAffair>();
    	
    	//A set of ArrayLists which will hold the raw team numbers and their scores.
    	ArrayList <Integer> Teams  = new ArrayList <Integer>();
    	ArrayList <Integer> Scores = new ArrayList <Integer>();
    	
    	//A while loop which will fill in the raw ArrayLists.
    	while (DF.hasNext())
    	{
    		//Reading in the current team number and their score.
    		int Team = DF.nextInt(), Score = DF.nextInt();
    		
    		//An if statement for when the end of the file is reached, marked with a zero.
    		if (Team == 0 && Score == 0)
    			//Breaking out of the loop.
    			break;
    		
    		//Adding the current team number and score to their respective ArrayLists.
    		Teams.add(Team);
    		Scores.add(Score);    		
    	}
    	
    	//A for loop which will cycle until the lists are compressed.
    	for (int I = 0; I < Teams.size(); I++)
    	{
    		//Finding the last instance of the current team number.
    		int Location = Teams.lastIndexOf (Teams.get(I));
    		
    			//A while loop that will cycle until the current team has been condensed.
    			while (Location != I)
    			{
    				//Adding the final score to the team's total score.
    				Scores.set (I, Scores.get(Location) + Scores.get(I));
    				
    				//Removing the final team entry now that its score has been added to the total.
    				Teams.remove(Location);
    				Scores.remove(Location);
    				
    				//Finding the next final entry.
    				Location = Teams.lastIndexOf (Teams.get(I));
    			}
			
    	}
    	//A for loop which will cycle until reaching the end of the list.
    	for (int I = 0; I < Teams.size(); I++)
    		//Sending the now consolidated raw scores over to the final "TeamScores" ArrayList. 
    		TeamScores.add(new SortedAffair(Teams.get(I), Scores.get(I)));
    	
    	//Performing an insertion sort of the "TeamScores".
    	TeamScores = InsertionSort (TeamScores);

    	//A for loop which will print out the top five highest scoring teams.
    	for (int I = 0; I < 5; I++)	
    		//Printing out a team number and their score.
    		System.out.println (I + 1 + " " + TeamScores.get(I).getTeam() + " " + TeamScores.get(I).getScore());		
    }
    
    //A method which will perform an insertion sort on the list of team scores.
    public static ArrayList <SortedAffair> InsertionSort (ArrayList <SortedAffair> Arr)
    {
    	//A set of variables which will hold locations in the ArrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the ArrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a teacher's information from the ArrayList.
    		SortedAffair key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.getScore() < (Arr.get(I).getScore()))
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