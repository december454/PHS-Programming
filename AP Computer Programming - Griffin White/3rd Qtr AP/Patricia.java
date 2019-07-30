/**
 * @(#)Patricia.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/7
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Patricia {
	
	//A set of private variables for all of the values sent over.
	private int PDraws1 = 0;
	private int Red1    = 0;
	private int Green1  = 0;	
	private String Replace1   = "";
	private String ColorDraw1 = "";

	//The main constructor that takes in all of the values sent over.
    public Patricia(int P, int R, int G, String RP, String C) 
    {
    	//Assigning all of the values to their respective private variables.
     	PDraws1 = P;
	 	Red1    = R;
		Green1  = G;	
		Replace1   = RP;
		ColorDraw1 = C;    
    }
    
    //A method which will calculate the probability and return the answer as a fraction.
    public String ReturnProb () 
    {
    	//A String variable to hold the result.
    	String Results = "";
    	
    	//An if statement for when only one pebble was drawn.
    	if (PDraws1 == 1)
    	{
    		//An if statement for drawing a red pebble.    		
    		if (ColorDraw1.equalsIgnoreCase ("R"))
    			//Calculating the probability and setting that as the result.
    			Results = Red1 + "/" + (Red1 + Green1);
    			
    		//An else statement for when a green pebble is drawn.
    		else
    			//Calculating the probability and setting that as the result.
    			Results = Green1 + "/" + (Red1 + Green1);			
    	}
    	
    	//An else statement for when two pebbles are drawn.
    	else
    	{
    		//An if statement for when the drawn pebble was put back in.
    		if (Replace1.equalsIgnoreCase  ("Y"))
    			//Calculating the probability and setting it as the result.
    			Results = (Red1 * Green1) + "/" + (Red1 + Green1) * (Red1 + Green1);
    		
    		//An else statement for when the drawn pebble was not put back in.
    		else
    		{
    			//An if statment for when the removed pebble was red.
    			if (ColorDraw1.equalsIgnoreCase ("R"))
    				//Calculating the results with one less red pebble and setting that to the result.
    				Results = (Red1 * Green1) + "/" + ((Red1 - 1) + Green1) * (Red1 + Green1);
    			
    			//An else statement for when the removed pebble was green.	
    			else
    				//Calculating the results with one less green pebble and setting that to the result.
    				Results = (Red1 * Green1) + "/" + (Red1 + Green1) * (Red1 + (Green1 - 1));
    		}    		
    	}
    	
    	//Returning the probability result.
    	return Results;	
    }   
}