/**
 * @(#)Danna.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/3/2
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Danna {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("danna.dat"));
    	
    	//Creating an int variable that will keep track of the number of students surveyed.
    	int Students = 0;
    	
    	//A double variable for the number of underweight students.
    	double UnderTotal  = 0;
    	//A double variable for the number of normal students.
    	double NormalTotal = 0;
    	//A double variable for the number of overweight students.
    	double OverTotal   = 0;
    	//A double variable for the number of obese students.
    	double ObeseTotal  = 0;
    	
    	//The while loop that will cycle until the data file runs out of lines.
    	while (DF.hasNextLine())
    	{
    		//Reading in the student's height in inches and assigning it to an int variable. 
    		int Height = DF.nextInt();
    		//Reading in the student's weight in pounds and assigning it to an int variable.
    		int Weight = DF.nextInt();
    		
    		//Converting the student's height to meters and assigning that value to a double variable.
    		double Height1 = Height * 0.0254;
    		//Converting the student's weight to kilograms and assigning that value to a double variable.
    		double Weight1 = Weight * 0.453592;
    		
    		//Calculating the student's BMI and assigning it to a double variable.
    		double BMI = Weight1 / Math.pow (Height1,2);
    		
    		//Creating a String variable that will hold the results of the student's BMI.
    		String Results = "";
    		
    		//The if statement for a student who's BMI classifies them as underweight.
    		if (BMI < 18.5)
    		{
    			Results = "Underweight";
    			//Adding to the total of underweight students.
    			UnderTotal++;
    		}
    		//The else if statement for a normal student.
    		else if (BMI >= 18.5 && BMI <= 24.9)
    		{
    			Results = "Normal";
    			//Adding to the total of normal students.
    			NormalTotal++;
    		}
    		//The else if statement for an overweight student.
    		else if (BMI >= 25 && BMI <= 29.9)
    		{
    			Results = "Overweight";
    			//Adding to the total of overweight students.
    			OverTotal++;
    		}
    		//The else if statement for an obese student.
    		else if (BMI >= 30)
    		{
    			Results = "Obese";
    			//Adding to the total of obese students.
    			ObeseTotal++;
    		}
    		
    		//Printing out the height of the student in inches and their weight in pounds.
    		System.out.print   (Height + " " + Weight + " ");
    		//Printing out their BMI rounded to the nearest hundredth.
    		System.out.printf  ("%.2f", BMI);
    		//Printing out how the student would be classified given their BMI.
    		System.out.println (" " + Results);
    		
    		//Adding to the total number of students surveyed.
    		Students++;
    	}
    	
    	//Printing out the total number of students surveyed.
    	System.out.println ("\n" + Students + " Total students surveyed\n");
    	
    	//Printing out what percent of the students were underweight.
    	System.out.printf ("%.2f",((UnderTotal/Students) * 100));
    	System.out.println ("% Underweight");
    	
    	//Printing out what percent of the students were normal.
    	System.out.printf ("%.2f",((NormalTotal/Students) * 100));
    	System.out.println ("% Normal");
    	
    	//Printing out what percent of the students were overweight.
    	System.out.printf ("%.2f",((OverTotal/Students) * 100));
    	System.out.println ("% Overweight");
    	
    	//Printing out what percent of the students were obese.
    	System.out.printf ("%.2f",((ObeseTotal/Students) * 100));
    	System.out.println ("% Obese\n");
    	
    	
    }
    
    
}