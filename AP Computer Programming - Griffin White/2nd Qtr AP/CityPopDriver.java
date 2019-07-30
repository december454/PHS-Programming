/**
 * @(#)CityPopDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/3
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class CityPopDriver {

    public static void main (String [] args) throws IOException  
    {
    	//A set of Scanners for the data file.
    	Scanner DF = new Scanner (new File ("citypop.txt"));
    	Scanner DFLength = new Scanner (new File ("citypop.txt"));
    	
    	//An int variable which will keep track of how many data sets there are.
    	int Length = 0;
    	
    	//A while loop that will count up the data sets.
    	while (DFLength.hasNextLine())
    	{
    		//Moving to the next line.
    		DFLength.next();
    		//Adding one to the length.
    		Length ++;
    	}    	
    	
    	//Creating a new Array of a Class to hold all of the city info.
    	CityPop [] CityStats = new CityPop [Length / 3];
    	
    	//Printing out the heading for output, all centered and spaced out.
    	System.out.printf("%-15.15s  %-15.15s %-15.15s%n%n", "City", "State", "Population");
    	
    	//A counter that will be used in the folowing loop.
    	int Counter = 0;
        	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//An if statement that will move to the next line of the Scanner, except for the first run.
	   		if (Counter > 0)
	    		DF.nextLine();		
	    	
	    	//A set of variables which will read in each line of the data set.
    		String City  = DF.nextLine();
    		String State = DF.nextLine();
    		int Pop      = DF.nextInt();
    		   
    		//Sending over the values to the "CityPop" class.
    		CityStats [Counter] = new CityPop (City, State, Pop);
    		    		
			//An if statement for when the population is over 100000.    		
    		if (CityStats[Counter].PopReturn() > 100000)
    			//Printing out the city's name, state, and population.
    			System.out.printf("%-15.15s  %-15.15s %-15.15s%n", CityStats[Counter].CityReturn(), CityStats[Counter].StateReturn(), CityStats[Counter].PopReturn());
			
			//Adding to the counter.
    		Counter++;	
    	}    	
    }    
}