/**
 * @(#)TeacherDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/10
 */

///////////////////////////////////Complete///////////////////////////////
//JUST FYI:  YOU DO NOT NEED 2 SCANNERS WHEN USING AN ARRAYLIST
//GRADE = 100

//GRADE WITH SORT = 100
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
    	
    	//Calling to the "InsertionSort" method and sorting the teacher list alphabetically.
    	TeacherInfo = InsertionSort (TeacherInfo);

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
    
    //A method which will perform an insertion sort on the list of names.
    public static ArrayList <Teacher> InsertionSort (ArrayList <Teacher> Arr)
    {
    	//A set of variables which will hold locations in the arrayList.
    	int I = 0, J = 0;
    	
    	//The main for loop that will go through each value in the arrayList.
    	for (J = 1; J < Arr.size(); J++)
    	{
    		//Taking in a teacher's information from the arrayList.
    		Teacher key = Arr.get (J);
    		
    		//Setting "I" to the spot before "J".
    		I = J - 1;
    		
    		//A while loop that will cycle until the current value is in the proper location.
    		while (I >= 0)
    		{
    			//An if statement that compares the current value with the one next to it.
    			if (key.GetTName().compareTo (Arr.get(I).GetTName()) > 0)
    				//Breaking out of the loop if the value is in the proper place.
    				break;
    			
    			//Moving a value back one spot.
    			Arr.set (I + 1, Arr.get(I));
    			
    			//Moving back to the next spot to check.
    			I--;
    		}
    		//Placing the current value in its proper location.
    		Arr.set (I + 1, key);
    	}
    	//Returning the sorted list.
    	return Arr;
    }       
}