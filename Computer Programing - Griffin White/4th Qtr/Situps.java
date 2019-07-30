/**
 * @(#)Situps.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/25
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Situps {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File("situps.in"));
    	
    	//A set of arrays that will record each student and their results.
    	String [] Students = new String [50]; 
    	int [] StudentResults = new int [50];
    	
    	//An int variable that will keep track of the current student being looked at.
    	int Current = 0;
    	
    	//A set of String variables that will record which stidents fell into each category.
    	String NMH = "";
    	String BA  = "";
    	String A   = "";
    	String O   = "";	
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//Assigning each student's name and their results to the appropriate arrays.
    		Students [Current] = DF.next();
    		StudentResults [Current] = DF.nextInt();
    		
    		//Moving on to the next student.
    		Current ++;
    	}
    	
    	//Another int variable that will keep track of what student is being looked at.
    	int Current1 = 0;
    	
    	//A while loop that will assign each student to the proper category.
    	while (Current1 < Current)
    	{
    		//The if statement for if a student that "Needs More Help".
    		if (StudentResults [Current1] >= 0 && StudentResults [Current1] <= 11)
    			NMH += Students [Current1] + "\n";
    		//The else if statement for if a student is "Below Average".	
    		else if (StudentResults [Current1] >= 12 && StudentResults [Current1] <= 20)
    			BA += Students [Current1] + "\n";
    		//The else if statement for if a student is "Average".	
    		else if (StudentResults [Current1] >= 21 && StudentResults [Current1] <= 36)
    			A += Students [Current1] + "\n";
    		//The else if statement for if a stident is "Outstanding".	
    		else if (StudentResults [Current1] >= 37)
    			O += Students [Current1] + "\n";
    		
    		//Moving on to the next student.	
    		Current1++;		
    	}
    	
    	//Printing out the categories and where each student fell.
    	System.out.println ("Needs More Help\n" + NMH + "\nBelow Average\n" + BA + "\nAverage\n" + A + "\nOutstanding\n" + O);
    	
    }
}