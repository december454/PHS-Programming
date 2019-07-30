/**
 * @(#)Nultimate.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/30
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Nultimate {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("nultimate.in"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//An int variable that reads in the location of the desired element.
    		int NUElement  = DF.nextInt();
    		
    		//A String array that reads in the rest of the line, seperating each word.
    		String Line [] = DF.nextLine().split(" ");
    		
    		//A String variable that holds the value of the desired element in the array.
    		String Output  = Line [Line.length - NUElement - 1];
    		
    		//An if statement that will print out the "Output", unless it is the closing "$".
    		if (!(Output.equals ("$")))
    			System.out.println (Output);	
    	}
    }
}