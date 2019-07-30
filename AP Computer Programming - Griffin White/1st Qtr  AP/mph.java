/**
 * @(#)mph.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/8
 */
//TEST GRADE = 100
import java.io.*;
import java.util.*;

public class mph {

    public static void main (String [] args) throws IOException
    {
    	Scanner DF = new Scanner (new File ("mph.txt"));
    	
    	while (DF.hasNext())
    	{
    		int Miles   = DF.nextInt();
    		int Hours   = DF.nextInt();
    		int Minutes = DF.nextInt();
    		
    		System.out.println (Miles + " miles in " + Hours + " hour and " + Minutes + " minutes = " + MPHMethod (Miles, Hours, Minutes) + " MPH.\n");
    	}
    }
    
    public static int MPHMethod (int Miles1, int Hours1, int Minutes1)
    {
    	double TotalTime = (Hours1 * 60 + Minutes1) / 60.0;
    	
    	int Speed = (int)(Math.round (Miles1 / TotalTime));
    	
    	return Speed;
    }
    
    
}