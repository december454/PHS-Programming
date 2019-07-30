/**
 * @(#)Alarm.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/16
 */
 //GRADE = 100
//Importing everything that I could need. 
import java.util.*;
import java.io.*;

public class Alarm {

    public static void main (String [] args){
    
    //Instantiating a Scanner input.
    Scanner Input = new Scanner (System.in);
    
    //The prompt that asks the user to enter day of the week via its respective number.
    System.out.println ("Enter the day of the week. (0=Sun, 1=Mon, 2=Tue, ...6=Sat)");
    	//Their input as an int variable.
    	int Day = Input.nextInt();
    
    //The prompt that asks the user to enter whether or not they are on vacation with "yes" or "no".
    System.out.println ("Are we on vacation? (yes or no)");
    	//Their input put to a String variable.
    	String Vacation_Raw = Input.next();
    	//Their input made lower case so that capitailization will not throw off the program.
    	String Vacation = Vacation_Raw.toLowerCase();
    	
    //The if statement that prints the 7:00 weekday, no vacation, response.
    if (Day != 0 && Day != 6 && Vacation.equals ("no"))
    	System.out.println ("\n7:00\n");	
    //The else if statement that prints the 10:00 weekend, no vacation, response.		
    else if (Day == 0 || Day == 6 && Vacation.equals ("no"))
    	System.out.println ("\n10:00\n");
    //The else if statement that prints the 10:00 weekday, with vacation, response.
    else if (Day != 0 && Day !=6 && Vacation.equals("yes"))	
    	System.out.println ("\n10:00\n");
    //The else if statement that prints the off weekend, with vacation, response.
    else if (Day == 0 || Day == 6 && Vacation.equals("yes"))
    	System.out.println ("\nOff\n");	
    		
    	
    
    
    }
    
    
    
}