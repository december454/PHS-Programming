/**
 * @(#)Average.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/2
 */
//TEST GRADE = 100
import java.util.*;
import java.io.*;

public class Average {

    public static void main (String [] args) throws IOException 
    {
    	Scanner DF = new Scanner (new File ("average.dat"));
    	
    	int DSNum = DF.nextInt();
    	
    	DF.nextLine();
    	
    	for (int I = 0; I < DSNum; I++)
    	{
    		String  line = DF.nextLine();
    		Scanner Line = new Scanner (line);
    		
    		double Total = 0;
    		
    		int Count = 0;
    		
    		while (Line.hasNext())
    		{
    			Total += Math.pow(Line.nextDouble(),2);
    			
    			Count++;	
    		}
    		
    		System.out.printf ("%.3f", Math.sqrt(Total/Count));
    		System.out.println();
    	}
    }
    
    
}