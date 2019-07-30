/**
 * @(#)Uilscore.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/15
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Uilscore {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner input.
    	Scanner DataFile = new Scanner (new File ("uilscore.dat"));
    	
    	//Assigning the number of data sets to an int variable.
    	int DSNum     = DataFile.nextInt();
    	//Some variables that will be used later in the program.
    	int Correct   = 0;
    	int Incorrect = 0;
    	String Title  = "";
    	
    	//A for loop that will run once for each of the data sets.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//Assigning the the value's title to a String variable. 
    		Title     = DataFile.next();
    		//Assiging the number of correct answers to an int variable.
    		Correct   = DataFile.nextInt();
    		
    		//Reassiging the value's title to that of the next value.
    		Title     = DataFile.next();
    		//Assiging the number of questions missed to an int variable.
    		Incorrect = 40 - (DataFile.nextInt() + Correct);
    		
    		//Calculating the tester's total score and printing out the results.
    		System.out.println (Correct * 6 - Incorrect * 2);
    	}
    	
    	System.out.println();
    }
    
    
}