/**
 * @(#)Kostas.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/5/13
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Kostas {
	
	//A String array that will hold each value from the line.
	private String [] line;
	//A String array that holds all of the codes for each letter in the alphabet.
	private String [] codes = {"4","8","[",")","3","|=","6","#","|","]","|<","1",
	"^^","^","0","|o","9","2","5","7","(_)","\\/","vv","><","/","%"};
	
	//The main constructor that will take in the sent over line.
    public Kostas(String temp) 
    {
    	//Breaking up the line and putting it in the array.
    	line = temp.split(" ");
    }
    
    //A method which will encode a line.
    public String getLeet ()
    {       
    	//A String value that will hold the finished encoded line.
    	String encoded = "";
    	
    	//A for each loop that will go through each word in the line.
    	for (String s: line)
    	{
    		//A String array that will hold each letter in the current word.
    		String [] current = s.split("");
    		
    		//A for loop that will go through each letter in the current word.
    		for (int i = 0; i < current.length; i++ )
    		{
    			//An if statement for when the word ends in "ANNED".
    			if ((i == current.length - 5) && s.substring (i).equals ("ANNED"))
    			{
    				//Adding "&" to the end of the encoded line.
    				encoded += "&";
    				//Moving on to the next word.
    				break;
    			}
    			
    			//An else if statement for when the word ends in either "AND" or "ANT".
    			else if ((i == current.length - 3) && (s.substring (i).equals ("AND") || s.substring (i).equals ("ANT") ))
    			{
    				//Adding "&" to the end of the encoded word.
    				encoded += "&";
    				//Moving on to the next word.
    				break;
    			}
    			
    			//An else if statement for when the word ends in "ER".
    			else if ((i == current.length - 2) && s.substring (i).equals ("ER"))
    			{
    				//Adding "XOR" to the end of the encoded line.
    				encoded += "XOR";
    				//Moving on to the next word.
    				break;
    			}
    				
    			//An else if statement for when the word ends in "OR".	
    			else if ((i == current.length - 2) && s.substring (i).equals ("OR"))
    			{	
    				//Adding "ZOR" to the end of the encoded line.
    				encoded += "ZOR";
    				//Moving to the next word.
    				break;
    			}
    			
    			//An else if statement for when the word ends in "ED".
    			else if ((i == current.length - 2) && s.substring (i).equals ("ED"))
    			{	
    				//Adding "*D" to the end of the encoded line.
    				encoded += "*D";
    				//Moving to the next word.
    				break;
    			}
    			
    			//An else if statement for when the current character is a digit.
    			else if ((current[i]).matches("\\d+"))
    				//Leaving the character alone and adding it to the encoded word.
    				encoded += current[i];
    			
    			//An else for any other character in the word.	
    			else
    				//Finding the ASCII value of the character and adding the appropriate "codes" value to the encoded word.
    				encoded += codes [(int)(current[i].charAt(0)) - 65];    			
    		}   
    			 		
    		//Putting a space between each word.
    		encoded += " ";    		
    	}
    	
    	//Returning the finished encoded word.
    	return encoded;
    }        
}