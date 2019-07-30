/**
 * @(#)VideoDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/11
 */

import java.io.*;
import java.util.*;

public class VideoDriver {

    public static void main (String [] args) throws IOException  
    {
    	Scanner DF = new Scanner (new File ("video.txt"));
    	
    	ArrayList <Video> MovieInfo = new ArrayList <Video>();
    	
    	int Counter = 0;
    	
    	while (DF.hasNext())
    	{
    		MovieInfo.add (new Video (DF.nextLine(), DF.nextLine(), DF.nextLine(), DF.nextLine()));
    			
    		Counter++;
    	}
    	   	
    	System.out.println ("In Store:");
    		
    	for (int I = 0; I < Counter; I++)
    	{	
    		if (MovieInfo.get(I).getInStore().equals("yes"))
    		{    			
    			System.out.print   (MovieInfo.get(I).getTitle()  + ", ");
    			System.out.print   (MovieInfo.get(I).getType()   + ", ");
    			System.out.println (MovieInfo.get(I).getRating());
    		}   		
    	}
    	
    	System.out.println ("\nNot In Store:");
    		
    	for (int I = 0; I < Counter; I++)
    	{	
    		if (MovieInfo.get(I).getInStore().equals("no"))
    		{    			
    			System.out.print   (MovieInfo.get(I).getTitle()  + ", ");
    			System.out.print   (MovieInfo.get(I).getType()   + ", ");
    			System.out.println (MovieInfo.get(I).getRating());
    		}    		
    	}  	
    }    
}