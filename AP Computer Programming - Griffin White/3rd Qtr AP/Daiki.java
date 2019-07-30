/**
 * @(#)Daiki.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/28
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Daiki {
	
	//A set of private variables that will hold all of the info for a toy.
	private String name   = "";
	private String color  = "";
	private int    weight = 0;
	private int    weird  = 0;

	//The main constructor to take in the values sent over from main.
    public Daiki(String n, String c, int w, int wf) 
    {
    	//Assiging the sent over values to their respective private variables.
    	name   = n;
		color  = c;
		weight = w;
		weird  = wf;
    }
    
    //A method to return the name.
    public String getName()
    {
    	//Returning the name.
    	return name;
    }
    
    //A method to return the color.
    public String getColor()
    {
    	//Returning the color.
    	return color;
    }
    
    //A method to return the weight.
    public int getWeight()
    {
    	//Returning the weight.
    	return weight;
    }
    
    //A method to return the weirdness.
    public int getWeird()
    {
    	//Returning the weirdness.
    	return weird;
    }
}