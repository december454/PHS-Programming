/**
 * @(#)CarlaDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/5/1
 */
//GRADE = 100
//Importing everything that i may need.
import java.io.*;
import java.util.*;

public class CarlaDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner df = new Scanner (new File ("Carla.dat"));
    	
    	//Creating a "unixDecoder" object to decode the codes.
    	Carla unixDecoder = new Carla();
    	
    	//A while loop that will go throught every value in the data file.
    	while (df.hasNext())
    	{
    		//Calling to the "decoder" method in the "Carla" class.
    		unixDecoder.decoder (df.next().split(""));
    	}    	    	
    }        
}