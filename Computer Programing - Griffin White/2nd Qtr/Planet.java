/**
 * @(#)Planet.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/4
 */
//GRADE = 100
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Planet {

    public static void main (String [] args)
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter their weight.
    	System.out.println ("Please enter your weight on Earth.");
    		//Their input assigned to a double variable.
    		double Weight = Input.nextDouble();
    		//Setting up a variable for their weight on a differnet planet that will be modified later.
    		double New = 0;
    	
    	//The prompt that asks the user to enter which planet they want to see their weight on, using its respective number from the provided list.	
    	System.out.println ("\nWhat planet do you wish to convert your weight to?\n");
    	System.out.println ("1. Earth     2. Jupiter");
    	System.out.println ("3. Mars      4. Mercury");
    	System.out.println ("5. Neptune   6. Pluto");
    	System.out.println ("7. Saturn    8.Pluto");
    	System.out.println ("9. Venus\n");
    		//Their input assigned to an int variable.
    		int Planet = Input.nextInt();
    		//Setting up a String variable for the name of the planet they chose that will be modified later.
    		String Planet2 = " ";
    	
    	//The switch statement for calculating their weight on the selected planet and giving the oppropriate value for "Planet2" (the planet they chose written out).
    	switch (Planet){
    		//The Earth case.
    		case 1:
    			New = Weight;
    			Planet2 = "Earth";
    			break;
    		//The Jupiter case.
    		case 2:	
    			New = Weight * 2.65;
    			Planet2 = "Jupiter";
    			break;
    		//The Mars case.
    		case 3:
    			New = Weight * .39;
    			Planet2 = "Mars";
    			break;
    		//The Mercury case,	
    		case 4:
    			New = Weight * .38;
    			Planet2 = "Mercury";
    			break;
    		//The Neptune case.	
    		case 5: 
    			New = Weight * 1.23;
    			Planet2 = "Neptune";
    			break;
    		//The Pluto case.	
    		case 6:
    			New = Weight * .05;
    			Planet2 = "Pluto";
    			break;
    		//The Saturn case.	
    		case 7:
    			New = Weight * 1.17;
    			Planet2 = "Saturn";
    			break;
    		//The Uranus case.
    		case 8:
    			New = Weight * 1.05;
    			Planet2 = "Uranus";
    			break;
    		//the Venus case.	
    		case 9: 
    			New = Weight * .78;
    			Planet2 = "Venus";
    			break;}
    		
    	//Printing what their weight would be on their choosen planet, rounded to the nearest whole number.
    	System.out.print   ("\nWith an Earth weight of "); 
    	System.out.printf  ("%.0f", Weight);
    	System.out.print   (", your weight on " + Planet2 + " will be ");
    	System.out.printf  ("%.0f", New);
    	System.out.println (".\n");	
    							
    									
    	}
    		
    		
    }
    
    
