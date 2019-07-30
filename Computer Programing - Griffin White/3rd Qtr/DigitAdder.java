/**
 * @(#)DigitAdder.java
 * Griffin white
 *
 * @author 
 * @version 1.00 2018/1/26
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class DigitAdder {

    public static void main (String [] args) 
    {
    	//Setting up the run again answer variable outside of any loops.
    	String Answer = " ";
    	
    	//The do while loop that contains the program.
    	do		
    	{
    		//Instantiating a Scanner input.
    		Scanner Input = new Scanner (System.in);
    		
    		//Asking the user to enter a number.
    		System.out.println ("\nEnter a number:\n");
    			//Assigning their input to an int variable.
    			int Num   = Input.nextInt();
    			//Creating a duplicate of their input that will remain unchanged.
    			int Num1  = Num;
    			//Setting up some variables that will be used in the main loop.
    			int Temp  = 0;
    			int Total = 0;
    			
    		//The main loop that will run once for every digit of the number entered.
    		while (Num != 0)
    		{
    			//Finding the value of the last digit in the number with modulus.
    			Temp = Num%10;
    			//Adding the value of that digit to a total count.
    			Total += Temp;
    			//Dividing the number by ten so that it is one digit shorter on the next run of the loop.
    			Num /= 10;
    		}
    		
    		//Printing the number that was entered in the begining along with the value of all its digits added together.
    		System.out.println ("\nThe sum of digits " + Num1 + " is " + Total +".\n");
    		
    		//Asking the user if they want to run the program again.
    		System.out.println ("Would you like to run this program again? (Y/N)");
    			//Their input assigned to a String variable.
    			Answer = Input.next();	
    	}
    	//The end of the do while loop that will run the program again if the user asked it to be.
    	while (Answer.equalsIgnoreCase("Y"));
    }
    
    
}