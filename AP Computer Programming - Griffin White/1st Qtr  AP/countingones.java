/**
 * @(#)countingones.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/1
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class countingones {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the data file.
    	Scanner DF = new Scanner (new File ("countingones.dat"));
    	
    	//An int variable that will record the current number being looked at.
    	int CurrentNum;
    	
    	//The main do while loop that will run until reaching the "-1" that marks the end of the data file.
    	do
    	{
    		//Reading in the current value of "CurrentNum".
    		CurrentNum = DF.nextInt();
    		
    		//An if stament that will break out of the loop upon reaching the "-1" marker.
    		if (CurrentNum == -1)
    			break;
    		
    		//Calling to the method which calculates and prints out the number of ones.
    		OneCountMethod (CurrentNum);
    	}
    	while (CurrentNum != -1);
    }
    
    //The method which will calculate the number of ones and print out that value.
    public static void OneCountMethod (int CurrentNum1)
    {
    	//A String variable that will hold the raw value of all of the numbers.
    	String AllNums = "";
    	
    	//An int variable that will record how many ones there are.
    	int OneCount = 0;
    	
    	//A for loop that will cycle "CurrentNum1" times.
    	for (int I = 1; I <= CurrentNum1; I++)
    		//Adding the current value to the "AllNums" variable.
    		AllNums += I;
    	
    	//A String array that will hold all of the individual digits from "AllNums"
    	String [] ANArray = AllNums.split ("");
    	
    	//A for loop that will count all of the ones.
    	for (int J = 0; J < ANArray.length; J++)
    		//An if statement for when the current digit is a one.
    		if (ANArray [J].equals ("1"))
    			//Adding to the "OneCount".
    			OneCount++;
    	
    	//Printing out the number of ones.
    	System.out.println (OneCount);	
    }
}