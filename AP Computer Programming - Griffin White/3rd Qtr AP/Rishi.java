/**
 * @(#)Rishi.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/7
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Rishi {
	
	//A private String variable that will hold the line sent over from the driver.
	private String Line = "";

	//The main constructor which will take in the value sent over from the driver.
    public Rishi(String L) 
    {
    	//Assiging that sent over value to its respective private variable.
    	Line = L;
    }
    
    //A method which will either compress or expand a line.
    public String calcLine ()
    {
    	//Splitting the line into a char array.
    	char [] arrLine = Line.toCharArray();
		
		//A String variable that will hold the compressed or expanded version of the line.    	    	    	
    	String Final = "";
    	
    	//An int variable that will count the instances of a letter in an expanded line.
    	int  count = 1;
    	
    	//Reading in the first character from the line.
    	char current = arrLine [0];
    	
    	//An if statement for an expanded line that needs to be compressed.
    	if (Character.isLetter(arrLine[0]))
    	{
    		//A for loop that will cycle until reaching the end of the line.
    		for (int I = 1; I < arrLine.length; I++)
    		{
    			//An if statement for when another instance of the character is found.
    			if (current == arrLine[I])
    				//Tallying that character's count.
    				count++;
    			
    			//An else statement for when the next letter is different.
    			else
    			{
    				//Adding the number of instances and the character to the compressed line.
    				Final += (count + "" + current);
    				
    				//Resetting the count.
    				count = 1;
    				//Moving on to the next character.
    				current = arrLine [I];
    			}	    			
    		}    
    		
    		//Adding the last set of instances and a letter.
    		Final += (count + "" + current);    		
    	}
    	
    	//An else statement for a compressed line that needs to be expanded.
    	else 
    	{
    		//Recording the number of instances for the first character. (Casting a char to an int and subtracting 48 from the ascii value we got.)
    		int times = (int)current - 48;
    		
    		//A for loop that will cycle until reaching the end of the line.
    		for (int I = 1; I < arrLine.length; I++)
    		{
    			//A while loop that will cycle if the next character is a digit.   			    			
    			while (Character.isDigit (arrLine[I]))
    			{
    				//Making it the second digit for the number of instances. 
    				times = (times * 10) + ((int)arrLine [I] - 48);
    				//Moving to the next character.
    				I++;
    			}
    			
    			//Reading in the current character.
    			current = arrLine [I];    			
				
				//A for loop that will print out "times" instances of "current".
				for (int J = 0; J < times; J++)
					//Adding a character to the expanded line.
					Final += current;
    			
    			//An if statement that keeps from calling to an out of bounds index.
    			if (I + 1 < arrLine.length)
    			{
    				//Moving to the next number of instances.
    				I++;
    				//Setting times to the new value.
    				times = (int)arrLine [I] - 48;
    			}    				    			    		
    		}    	
    	}
    	
    	//Returning the expanded or compressed line of characters.
    	return Final;
    }        
}