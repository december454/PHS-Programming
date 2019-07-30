/**
 * @(#)Marathon.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/5
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Marathon {
	
	//A private int variable that will hold the runner's age.
	private int RunnerAge = 0;
	//A private String variable that will hold all of the runner's info.
	private String RunnerStats = "";
	
	//The main constructor that will take in the age and the runner's info.
    public Marathon(int RA, String RS) 
    {
    	//Taking in the values that were sent over from "MarathonDriver".
    	RunnerAge = RA;
    	RunnerStats = RS;
    }
    
    //A method which will return the runner's age.
    public int ReturnAge()
    {
    	//Returning the age.
    	return RunnerAge;
    }
    
    //A method which will return all of the runner's info.
    public String ReturnStats ()
    {
    	//Returning the info.
    	return RunnerStats;
    }
    
    
}