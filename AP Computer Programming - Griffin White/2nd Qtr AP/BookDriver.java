/**
 * @(#)BookDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/10
 */
 
 ///////////////////////////////////In-Progress////////////////////////////////

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class BookDriver {

    public static void main (String [] args) throws IOException 
    {
    	Scanner DF = new Scanner (new File ("Books.txt"));
    	
    	ArrayList <Book> BookInfo = new ArrayList <Book>();
    	
    	int Length = 0;
    	
    	while (DF.hasNext())
    	{
    		//System.out.println (DF.nextLine() + DF.nextLine() + DF.nextLine() + DF.nextDouble());
    		BookInfo.add (new Book (DF.nextLine(), DF.nextLine(), DF.nextLine(), DF.nextDouble()));
    		Length++;
    		
    		if (DF.hasNextLine())
    			DF.nextLine();
    	}
    	
    	System.out.println ("	Fiction:\n");
    	
    	for (int I = 0; I < Length; I++)    	
    		if (BookInfo.get(I).getFictOrNF().equals ("F"))
    			System.out.println (BookInfo.get(I).getTitle());
    			
    	System.out.println ("\n\n\n	Non-Fiction:\n");
    	
    	for (int I = 0; I < Length; I++)    	
    		if (BookInfo.get(I).getFictOrNF().equals ("NF"))
    			System.out.println (BookInfo.get(I).getTitle());		
    	
    	
    	
    }
    
    
}