/**
 * @(#)Texting.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/3
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Texting {

    public static void main (String [] args) throws IOException
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("texting.in"));
    	
    	//An int variable that reads in the number of data sets.
    	int DSNum = DF.nextInt();
    	
    	//Moving down to the next line of the data file.
    	DF.nextLine();
   
   		//The main for loop that will cycle once for each data file.
    	for (int I = 0; I < DSNum; I++)
    	{
    		//A String variable that reads in a line from the data file.
    		String  line = DF.nextLine();
			
			//A series of statements that replace each desired word with its respective emoticon/abbreviation.
			//Changing "happy" to ":)".
			line = line.replaceAll("\\b(?i)happy\\b",":)");
			//Changing "sad" to ":(".
			line = line.replaceAll("\\b(?i)sad\\b",":(");
			//Changing "angry" to "D:<".
			line = line.replaceAll("\\b(?i)angry\\b","D:<");
			//Changing "laughing" to "XD".
			line = line.replaceAll("\\b(?i)laughing\\b","XD)");
			//Changing "discontented" to "ugh".
			line = line.replaceAll("\\b(?i)discontented\\b","ugh");
			//Changing "laugh out loud" to "lol"
			line = line.replaceAll("\\b(?i)laugh out loud\\b","lol");
			//Changing "talk to you later" to "ttyl".
			line = line.replaceAll("\\b(?i)talk to you later\\b","ttyl");
			//Changing "I don't know" to idk".
			line = line.replaceAll("\\b(?i)I don't know\\b","idk");
			//Changing "cool" to "@)".
			line = line.replaceAll("\\b(?i)cool\\b","@)");
			
			//Moving down to the next line.
			System.out.println (line);
    	
    	}
    }
    
    
}