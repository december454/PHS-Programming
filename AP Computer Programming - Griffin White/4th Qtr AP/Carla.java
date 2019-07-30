/**
 * @(#)Carla.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/5/1
 */
 
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Carla {

	//A method that will take in a String array code and decode it.
    public void decoder (String [] code)  
    {
    	//A String variable that will hold the final code.
    	String result = "";
    	
    	//Calling to the "firstChar" method and adding the decoded results to "result".
    	result += firstChar (code [0]);
    	
    	//A for loop that will decode the last three sections of the code.        	
    	for (int i = 1; i < 4; i++)
    		//Calling to the "octalConvert" method and adding the results to the "result".
    		result += octalConvert (Integer.parseInt (code [i]));    		
		
		//Printing out the final decoded "result".    		
    	System.out.println (result);    	
    }
    
    //A method which will decode the first character.
    public String firstChar (String  temp)
    {
    	//An if statement for when it is an "F" for file.
    	if (temp.equalsIgnoreCase ("F"))
    		//Returning the decoded value.
    		return "-";
    	
    	//An if statement for when it is a "D" for directory.
    	if (temp.equalsIgnoreCase ("D"))
    		//Returning the decoded value.
    		return "d";	
    	
    	//A default return for when it is an "L" for link.    	
   		return "l";    	
    }
    
    //A method which will decode a set of permissions.
    public String octalConvert (int num)
    {
    	//A String value to hold the current decoded set.
    	String codeTemp = "";
    	
    	//A string array that will hold the binary eqivalent of the given digit.
    	String [] binTemp = (String.format("%3s", Integer.toBinaryString(num)).replace(' ', '0')).split("");
    	
    	//An if statemnt for when the first spot is marked.
    	if (binTemp [0].equals("1"))
    		//Adding the decoded value to the decoded set.
    		codeTemp += "r";
    	
    	//An else statement for when it was not marked.
    	else 
    		//Blanking out its mark in the current set.
    		codeTemp += "-";	
    	
    	//An if statemnt for when the second spot is marked.	
    	if (binTemp [1].equals("1"))
    		//Adding the decoded value to the decoded set.
    		codeTemp += "w";
    	
    	//An else statement for when it was not marked.	
    	else 
    		//Blanking out its mark in the current set.
    		codeTemp += "-";	
    	
    	//An if statemnt for when the third spot is marked.	
    	if (binTemp [2].equals("1"))
    		//Adding the decoded value to the decoded set.
    		codeTemp += "x";
    	
    	//An else statement for when it was not marked.	
    	else 
    		//Blanking out its mark in the current set.
    		codeTemp += "-";	
    	
    	//Returing the decoded set.
    	return codeTemp;
    }    
}