/**
 * @(#)OnePotatoDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/11/26
 */
 //GRADE = 100
 //Importing everything that I may need.
 import java.io.*;
 import java.util.*;

public class OnePotatoDriver {

    public static void main (String [] args) throws IOException 
    {
    	//Instatiating a Scanner object for the data file.
    	Scanner DF = new Scanner (new File ("onepotato.dat"));
    	
    	//A while loop that will cycle once for each list of names.
    	while (DF.hasNext())
    	{
    		//Instantiating an "ItFinder" object and sending the names over to the "OnePotato" class.
    		OnePotato ItFinder = new OnePotato (DF.nextLine());
    		
    		//Calling to the "ItCalculator" method which will find the final student.
    		ItFinder.ItCalculator();
    		
    		//Calling to the "ItPrinter" method which will print out the student's name.
    		ItFinder.ItPrinter();    		
    	}    	
    }  
}