/**
 * @(#)MarathonDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/5
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class MarathonDriver {

    public static void main (String [] args) throws IOException 
    {
    	//A set of acanners which will all use the data file.
    	Scanner DF  = new Scanner (new File ("Marathon.txt"));
    	Scanner DF1 = new Scanner (new File ("Marathon.txt"));
    	Scanner DF2 = new Scanner (new File ("Marathon.txt"));
    	
    	//An int variable which will hold how many data sets there are.
    	int Length = 0;
    	
    	//A while loop that will cycle through the data file and find out how many data sets are in it.
    	while (DF.hasNextLine())
    	{
    		//Adding one to the length.
    		Length++;
    		//Moving to the next line.
    		DF.nextLine();
    	}
    	
    	//Creating a new array of a class.
    	Marathon [] Runners = new Marathon [Length];
    	
    	//An int variable that will act as a counter in the next loop.
    	int Counter = 0;
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF1.hasNext())
    	{
    		//Moving through the String section of the data set.
    		DF1.next();
    		DF1.next();
    		DF1.next();
    		
    		//Taking in the age.
    		int Age = DF1.nextInt();
    		
    		//Moving past the other String section.
    		DF1.next();    	
    		
    		//Taking in the entire data set using a different Scanner.
    		String RunnerInfo = DF2.nextLine();
    		
    		//Sending the age and the entire data set over to the array of a class.
    		Runners [Counter] = new Marathon (Age, RunnerInfo);
    		
    		//Adding one to the counter.
    		Counter++;    	
    	}
    	
    	
    	//Printing out the runners under 21.
    	System.out.println ("Under 21:");
    	//A for loop that will run through the entire list.
    	for (int I = 0; I < Length; I++)
    		//An if statement for when the age is under 21.
    		if (Runners[I].ReturnAge() < 21)
    			//Printing out the entire data set for the runner.
    			System.out.println (Runners[I].ReturnStats());
    	
    	//Printing out the runners from 21 to 28.		
    	System.out.println ("\n21-28:");
    	//A for loop that will run through the entire list.
    	for (int I = 0; I < Length; I++)
    		//An if statement for when the age is in range.
    		if (Runners[I].ReturnAge() >= 21 && Runners[I].ReturnAge() <= 28)
    			//Printing out the entire data set for the runner.
    			System.out.println (Runners[I].ReturnStats());	
    	
    	//Printing out the runners from 29 to 38.			
    	System.out.println ("\n29-38:");
    	//A for loop that will run through the entire list.
    	for (int I = 0; I < Length; I++)
    		//An if statement for when the age is in range.
    		if (Runners[I].ReturnAge() >= 29 && Runners[I].ReturnAge() <= 38)
    			//Printing out the entire data set for the runner.
    			System.out.println (Runners[I].ReturnStats());	
    	
    	//Printing out the runners from 39 to 50.			
    	System.out.println ("\n39-50:");
    	//A for loop that will run through the entire list.
    	for (int I = 0; I < Length; I++)
    		//An if statement for when the age is in range.
    		if (Runners[I].ReturnAge() >= 39 && Runners[I].ReturnAge() <= 50)
    			//Printing out the entire data set for the runner.
    			System.out.println (Runners[I].ReturnStats());	
    	
    	//Printing out the runners over 50.			
    	System.out.println ("\nOver 50");
    	//A for loop that will run through the entire list.
    	for (int I = 0; I < Length; I++)
    		//An if statement for when the age is over 50.
    		if (Runners[I].ReturnAge() > 50)
    			//Printing out the entire data set for the runner.
    			System.out.println (Runners[I].ReturnStats());								
    }
    
    
}