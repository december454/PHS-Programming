/**
 * @(#)TeacherDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/10
 */

///////////////////////////////////Finished////////////////////////////////

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class TeacherDriver {

    public static void main (String [] args) throws IOException 
    {
    	//A set of Scanners using the data file.
    	Scanner DF  = new Scanner (new File ("teachers.txt"));
    	Scanner DF1 = new Scanner (new File ("teachers.txt"));
    	
    	//An int variable that will record how many data sets there are.
    	int ArrayLength = 0;
    	
    	//A while loop that will calculate the "ArrayLength".
    	while (DF1.hasNextLine())
    	{
    		//Adding one to the length.
    		ArrayLength++;
    		//Going to the next data set.
    		DF1.nextLine();   		
    	}
    	
    	//Instantiating an ArrayList of a class to hold each teacher's info.
    	ArrayList <Teacher> TeacherInfo = new ArrayList <Teacher>();
    	
    	//A while loop that will run through each data set.
    	while (DF.hasNext())
    	{
    		//Reading in all of the teacher's info.
    		String TName = DF.next();
    		int TotYears = DF.nextInt();
    		int PalYears = DF.nextInt();
    		String TDept = DF.next();
    		
    		//Sending over all of the teacher's info to the ArrayList of a class.
    		TeacherInfo.add (new Teacher (TName, TotYears, PalYears, TDept));		
    	}

		//Printing out the teachers that taught more than 15 years.
    	System.out.println ("	Taught More Than 15 Years");
    	//A while loop that will go through each teacher.
    	for (int I = 0; I < ArrayLength; I++)
    		//An if statement for when the teacher has taught more than 15 years.		
    		if (TeacherInfo.get(I).GetTotYears() > 15)
    			//Printing out the teacher's name.
    			System.out.println (TeacherInfo.get(I).GetTName());
    	
    	//Printing out the teacher who only taught at PISD.
	    System.out.println ("\n	Taught The Whole Time At PISD");
	    //A for loop that will go through all of the teachers.
    	for (int I = 0; I < ArrayLength; I++)
    		//An if statement for when all of their years teaching were spent at PISD.
    		if (TeacherInfo.get(I).GetTotYears() == TeacherInfo.get(I).GetPalYears())
    			//Printing out the teacher's name.
    			System.out.println (TeacherInfo.get(I).GetTName());
	    
	    //Printing out the teachers who are in the science department.			
	   System.out.println ("\n	Science Department");
	   //A for loop that will cycle through all of the teachers.
    	for (int I = 0; I < ArrayLength; I++)
    		//An if statement for when the teacher is in the science department.
    		if (TeacherInfo.get(I).GetTDept().equals ("Science"))
    			//Printing out the teacher's name.
    			System.out.println (TeacherInfo.get(I).GetTName());				    			    			    	
    }       
}