/**
 * @(#)LineBreaker.java
 * Griffin white
 *
 * @author 
 * @version 1.00 2018/3/23
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class LineBreaker {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Sacnner object for the entire data file.
    	Scanner DF = new Scanner (new File ("linebreaker.txt"));
    	
    	//The main while loop that will cycle until it reaches the end of the data file.
    	while (DF.hasNext())
    	{
    		//Reading in a line from the data file and assigning it to a String variable.
    		String  line = DF.nextLine();
    		//Instantiating another Scanner object that holds the value of the previous String variable.
    		Scanner Line = new Scanner (line);
    		
    		//An int variable that reads in the break number, how many characters each printed line can be.
    		int Break    = DF.nextInt();
    	
    		//An if statement that will advance down to the next line of the Scanner "DF" if there is another line.
    		if (DF.hasNextLine())
    			//Going down to the next line.
    			DF.nextLine();
    		
    		//Printing out the raw line of the data file that will be broken apart.
    		System.out.println (line);
    		
    		//The while loop that will break apart each line of the data file.
    		while (Line.hasNext())
    		{
    			//A string variable that will hold the value of each broken section of the line.
    			String Printed = "";
   				
   				//The for loop that will cycle "Break" times.
    			for (int J = 0; J < Break; J++)	
    				//An if statement that checks to see if there are any characters in the Scanner "Line" before it tries to read from it.
    				if (Line.hasNext())
    					//Assigning a character to the broken up section of the line.
    					Printed += Line.next();
    			
    			//Printing out that section of the line.
    			System.out.println (Printed);
    		}
    		//Spacing out each set of lines.
    		System.out.println("\n");
    		
    	}	
    }
}