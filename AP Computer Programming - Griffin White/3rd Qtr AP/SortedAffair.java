/**
 * @(#)SortedAffair.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/4
 */
 
 //////////////////////////////////////Complete///////////////////////////////////////////

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class SortedAffair {
	
	//A set of private int variables which will hold team numbers and their scores.
	private int Team = 0, Score = 0;

	//The main constructor which will take in a team number and their total score from the driver.
    public SortedAffair(int T, int S)
    {
    	//Assigning the sent over values to their respective private int variables.
    	Team  = T;
    	Score = S;
    }
    
    //A method to return a team number.
    public int getTeam ()
    {
    	//Returning the team number.
    	return Team;
    }
    
    //A method to return a team score.
    public int getScore ()
    {
    	//Returning the score.
    	return Score;
    } 
}