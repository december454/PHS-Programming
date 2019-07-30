/**
 * @(#)Ximena.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/5/17
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Ximena {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("ximena.dat"));
    	
    	//The main while loop that will cycle until the end of the data file is reached.
    	while (DF.hasNext())
    	{
    		//A string array that will hold each letter of the current word.
    		String [] Word = DF.nextLine().split("");
    		
    		//The if statement for if there are an even number of letters in the word.
    		if (Word.length%2 == 0)
    		{
    			//A for loop that will print the first half of the word in backwards/forwards order.
    			for (int I = Word.length/2 - 1; I >= 0; I--)
    				System.out.print (Word [I]);
    			//A for loop that will print the first half of the word in forwards/backwards order.	
    			for (int J = 0; J < Word.length/2; J++)	
    				System.out.print (Word [J]);
    			
    			//A for loop that will print the second half of the word in forwards/backwards order.	
    			for (int K = Word.length/2; K < Word.length; K++)	
    				System.out.print (Word [K]);
    			//A for loop that will print the second half of the word in backwards/forwards order.	
    			for (int L = Word.length - 1; L >= Word.length/2; L--)
    				System.out.print (Word [L]);
    		}
    		//The else statement for if there are an odd number of letters in the word.
    		else
    		{
    			//A for loop that will print the first half of the word in forwards/backwards order.
    			for (int M = 0; M < Word.length/2; M++)	
    				System.out.print (Word [M]);
    			//A for loop that will print the first half of the word in backwards/forwards order.	
    			for (int N = Word.length/2 - 1; N >= 0; N--)
    				System.out.print (Word [N]);
    		
    			//A for loop that will print the second half of the word in backwards/forwards order.
    			for (int O = Word.length - 1; O >= Word.length/2; O--)
    				System.out.print (Word [O]);
    			//A for loop that will print the second half of the word in forwards/backwards order.		
    			for (int P = Word.length/2; P < Word.length; P++)	
    				System.out.print (Word [P]);
    		}
    		
    		//Moving down to the next line.
    		System.out.println();
    	}
    }
    
    
}