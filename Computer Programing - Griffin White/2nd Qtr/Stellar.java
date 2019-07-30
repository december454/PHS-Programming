/**
 * @(#)Stellar.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/20
 */
//GRADE = 100
//Importing everything that I could need.
import java.util.*;
import java.io.*;

public class Stellar {

    public static void main (String [] args){
    	
    //Instantiating a Scanner input.	
    Scanner Input = new Scanner (System.in);
    
    //The first prompt to greet the user that asks them to enter the star name.
    System.out.println ("Enter the star name:");
    	//Their input assigned to a String variable.
    	String Name = Input.nextLine();	
    
    //The prompt that asks the user to enter the MB and MV values of the star.		
    System.out.println ("Enter the MB and MV values:");
    	//Their inputs assigned to respective double variables.
    	double MB = Input.nextDouble();
    	double MV = Input.nextDouble();
    	//Finding the B-V Color Index value by subtracting MV from MB and then assigning that value to a double variable.
    	double BV = MB-MV;
    	//Setting up a String variable for the Spectral Class outside of any if statements so that it can be altered within one.
    	String SClass = "error";
    
    //The if statement for a Spectral Class of "O".	
    if (BV >= -.35 &&BV <=-.251)
    	SClass = "O";
    //The else if statement for a Spectral Class of "B".		
    else if (BV >= -.25 && BV <= -.001)
    	SClass = "B";		 
    //The else if statement for a Spectral Class of "A".			
    else if (BV >= 0 && BV <= .249)
    	SClass = "A";
    //The else if statement for a Spectral Class of "F".	
    else if (BV >= .25 && BV <= .499)
    	SClass = "F";
    //The else if statement for a Spectral Class of "G".		
    else if (BV >= .5 && BV <= .999)
    	SClass = "G";
    //The else if statement for a Spectral Class of "K".		
    else if (BV >= 1 && BV <= 1.499)
    	SClass = "K";
    //The else if statement for a Spectral Class of "M".		
    else if (BV >= 1.5 && BV <=2)
    	SClass = "M";
    
    //Printing the star name.	
    System.out.print   ("\n" + Name);
    //Printing the B-V Color Index rounded to the nearest hundredth.
    System.out.printf  (" %.2f", BV);
    //Printing the Spectral Class.
    System.out.println (" " + SClass + "\n");
 		
    }
    
    
}