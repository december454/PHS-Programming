/**
 * @(#)ScoresDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/30
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class ScoresDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("scores.dat"));
    	
    	//An int variable that reads in how many data sets there are.
    	int DSNum = DF.nextInt();
    	
    	//Moving down to the next line.
    	DF.nextLine();
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//A set of variables that will read in the team names and score codes for each team.
    		String Team1      = DF.nextLine();
    		String Team1Score = DF.nextLine();
    		String Team2      = DF.nextLine();
    		String Team2Score = DF.nextLine();
    		
    		//Sending the scores of the first team over to the "Scores" class.
    		Scores ScoreCalc1 = new Scores (Team1Score);
    		
    		//An int varibale that will call to the "CalcScores" method in the "Scores" class and recieve the first score.
    		int Team1TotScore = ScoreCalc1.CalcScores();
    		
    		//Printing out the first team's name and their score.	
    		System.out.print	(Team1 + " " + Team1TotScore + " ");
    		
    		//Sending the scores of the second team over to the "Scores" class.
    		Scores ScoreCalc2 = new Scores (Team2Score);
    		
    		//An int varibale that will call to the "CalcScores" method in the "Scores" class and recieve the second score.
    		int Team2TotScore = ScoreCalc2.CalcScores();
    		
    		//Printing out the second team's name and their score.	
    		System.out.print (Team2 + " " + Team2TotScore + " ");
    		
    		//Sending the two team's scores over to the "Winner" method in the "Scores" class and determining the winner.			
    		Scores Winner = new Scores (Team1TotScore, Team2TotScore) ;
    		
    		//The if statement for when the first team wins.			
    		if (Winner.WinningTeam() == true)
    			//Printing out the first team's name and saying that they won.
    			System.out.println (Team1 + " Wins!");
    		//The else statement for when the second team wins.	
    		else 
    			//Printing out the second team's name and saying that they won.
    			System.out.println (Team2 + " Wins!");
    	}
    }
    
    
}