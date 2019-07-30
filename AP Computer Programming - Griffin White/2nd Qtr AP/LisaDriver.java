/**
 * @(#)LisaDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/8
 */

//FIRST LINE OF OUTPUT IS OFF
//GRADE = 95
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class LisaDriver {

    public static void main (String [] args) throws IOException 
    {
    	//A scanner for the data file.
    	Scanner DF = new Scanner (new File ("lisa.dat"));
    	
    	//A string array which will hold the value of each name.
    	String [] NameSet = new String [100];
    	
    	//An int variable which will keep track of the number of names.
    	int NameCounter = 0;
    	
    	//A two dimensional double array which will hold all of the results.
    	double [][] SentResults = new double [100][4];
    	
    	//A while loop which will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//A string variable which will read in the current name.
    		String CurrentName = DF.nextLine();
    		
    		//Sending the name over to the "Lisa" class.
    		Lisa NameSums = new Lisa (CurrentName);
    		
    		//Calling to the "Claculator" method in the "Lisa" class and assigning the value returned to an array. 
    		SentResults [NameCounter] = NameSums.Calculator();
    		
    		//Putting the current name into the name array.
    		NameSet [NameCounter] = CurrentName;
    		
    		//Adding one to the "NameCounter" variable.
    		NameCounter++;
    		
    	}
    	
    	//A for loop that will cycle once for each name.
    	for (int I = 0; I < NameCounter; I++)
    	{
    	
    		//Printing out the current name.
    		System.out.print (NameSet [I] + "		 ");
    		
    		//A for loop that will print out the first three values.
    		for (int J = 0; J < 3; J++)
    			System.out.print ((int)SentResults [I][J] + " ");
    			
    		//Printing out the name weight average rounded to the nearest hundredth.
    		System.out.printf ("%.2f", SentResults [I][3]);
    		
    		//Moving to the next line.
    		System.out.println();		
    	}    	
    } 
}