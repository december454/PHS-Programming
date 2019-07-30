/**
 * @(#)Zeller.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/27
 */
//GOOD JOB
//GRADE = 100
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Zeller {

    public static void main (String [] args)
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The first prompt that asks the user to enter the year.
    	System.out.print ("Enter the year: ");
    		//Their input assigned to an int value.
    		int Year = Input.nextInt();
    	//The second prompt that asks the user to enter the number of the month.	
    	System.out.print ("Enter the month in numbers: ");
    		//Their input assigned to an int value.
    		int M = Input.nextInt();
    	//The final prompt that asks the user to enter the day of the month.	
    	System.out.print ("Enter the day of the month in numbers: ");
    		//Their input assigned to an int value.
    		int Q = Input.nextInt();
    
    	//The if statement that will give an "M" value of 1 (January) a value of 13 and set the value of the year back 1.
    	if (M==1){
    		M = 13;
    		Year = Year-1;}	
    	//The if statement that will give an "M" value of 2 (Febuary) a value of 14 and set the value of the year back 1.
    	if (M==2){
    		M = 14;
    		Year = Year-1;}		
    	
    	//Calculating the value of K (the year of the century) using the value of "Year" that was modified if needed.
    	int K = Year%100;
    	//Calculating the value of J (the year divided by 100) using the value of "Year" that was modified if needed.
    	int J = Year/100;
    	//Setting up a string variable for the day of the week outside of any if statements.
    	String Day = " ";
    	
    	//Using the provided formula to calculate the value of "H".
    	int H = (Q + (26*(M+1)/10) + K + (K/4) + (J/4) + (5*J))%7;
    	
    	//The if/else if statements that will assign the proper day of the week to the variable "Day" given the respective value of "H".
    	if (H==0)
    		Day = "Saturday";
    	else if (H==1)
    		Day = "Sunday";
    	else if (H==2)		
    		Day = "Monday";
    	else if (H==3)
    		Day = "Tuesday";
    	else if (H==4)
    		Day = "Wednesday";
    	else if (H==5)
    		Day = "Thursday";
    	else if (H==6)
    		Day = "Friday";
    	
    	//Printing the result of the calculations, the day of the week.	
    	System.out.println ("\nDay of the week is " + Day + "\n");					
    	
    
    		
   		
    			
    }
    
    
}