/**
 * @(#)Lisa.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/8
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Lisa {
	
	//A private String variable which will hold the name sent over.
	private String NameLetters;
	
	//The main constructor which will take in the value sent over.
    public Lisa(String NameRaw) 
    {
    	//Assigning the value sent over to the "NameLetters" variable.
    	NameLetters = NameRaw;
    }
    
    //A method which will calculate the values of the name.
    public double [] Calculator()
    {
    	//A double array which will hold all of trhe values for the aray.
    	double Results [] = new double [4];
    	
    	//A for loop which will calculate the raw value of the name.
    	for (int I = 0; I < NameLetters.length(); I++)
    		//Tallying up the value for the raw name.
    		Results [0] += (int)NameLetters.charAt(I);
    	
    	//Making the name all upper case.
    	NameLetters = NameLetters.toUpperCase();
    	
    	//A for loop which will calculate the uppercase value of the name.
    	for (int I = 0; I < NameLetters.length(); I++)
    		//Tallying up the uppercase value.
    		Results [1] += (int)NameLetters.charAt(I);
    	
    	//Setting the name to lower case.
    	NameLetters = NameLetters.toLowerCase();
    	
    	//A for loop which will calculate the lower case value of the name.
    	for (int I = 0; I < NameLetters.length(); I++)
    		//Tallying up the lower case value.
    		Results [2] += (int)NameLetters.charAt(I);
    	
    	//Calculating the name weight and assiging it to the array.
    	Results [3] = ((Results [0] + Results [1] + Results [2])/3)/NameLetters.length();
    	
    	//Returning the "Results" array.
    	return Results;
    	
    }
}