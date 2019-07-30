/**
 * @(#)MomentumDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/23
 */
//INSTRUCTIONS STATE THE MOMENTUM SHOULD BE RETURNED -15
//GRADE = 85

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class MomentumDriver {

    public static void main (String [] args) 
    {
    	//Instantiting a Scanner object that will read in the user's input.
    	Scanner Input = new Scanner (System.in);
    	
    	//A String variable that will record whether or not the user wants to run the program again.
    	String Response = "y";
    	
    	//A do while loop that encompasses the main program.
    	do
    	{
    		//Asking the user to enter the mass.
    		System.out.println ("\nEnter the object's mass");
    		//Recording their response.
    		double Mass = Input.nextDouble();
    		
    		//Asking the user to enter the velocity.
    		System.out.println ("\nEnter the object's velocity");
    		//Recording their response.
    		double Velocity = Input.nextDouble();
    		
    		//Instantiating a "CalcAndPrint" object that sends the values to "Momentum".
    		Momentum CalcAndPrint = new Momentum (Mass, Velocity);
    		
    		//Calling the "PrintMom" method in the "Momentum" class.
    		CalcAndPrint.PrintMom();
    		
    		//Asking the user if they would like to run the program again.
    		System.out.println ("\n\nWould you like to run the program again? (Y/N)");
    		//Recording their response.
    		Response = Input.next();
    	}
    	//Running the program again if desired.
    	while (Response.equalsIgnoreCase("Y"));
    }
}