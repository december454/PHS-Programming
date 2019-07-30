/**
 * @(#)Fizz.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/23
 */
//GRADE = 100
//Importing everything that I could need.
import java.io.*;
import java.util.*;

public class Fizz {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner input.
    	Scanner DataFile = new Scanner (new File ("fizz.dat"));
    	
    	//Assigning the number of data sets to an int variable.
    	int DSNum = DataFile.nextInt();
    	
    	//The outer for loop that will run once for each data set.
    	for (int I = 1; I <= DSNum; I++)
    	{
    		//Assiging the first number in the data set to an int variable.
    		int Num1 = DataFile.nextInt();
    		//Assiging the second number in the data set to an int variable.
    		int Num2 = DataFile.nextInt();
    		
    		//Printing out a title for the data set results.
    		System.out.println ("Data Set " + I);
    		
    		//The inner for loop that will run until the value of "Num1" is equal to "Num2".
    		for (int NumTemp = Num1; NumTemp <= Num2; NumTemp++)
    		{
    			//Creating a String variable for the results.
    			String Result = "";
    			
    			//The series of if statements that will determine the results of each number.
    			//The if statement for a "FizzBang" number divisable by 3 and 5.
    			if ((NumTemp % 3 == 0) && (NumTemp % 5 == 0))
    				Result = "FizzBang";
    			//The else if statement for a "Fizz" number divisable by 3.	
    			else if (NumTemp % 3 == 0)
    				Result = "Fizz";
    			//The else if statement for a "Bang" number divisable by 5.	
    			else if (NumTemp % 5 == 0)
    				Result = "Bang";
    			//The else statement for a number who's result is itself, divisable by neither 3 or 5.	
    			else 
    				Result += NumTemp;
    			
    			//Printing out the result for that number.
    			System.out.println (Result);
    		}
    	}
    }
}