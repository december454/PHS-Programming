/**
 * @(#)Questoftime.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/5
 */
//I LIKE HOW YOU DID THE SINGLE DIGITS
//GRADE = 100
//Importing everyting that I might need.
import java.io.*;
import java.util.*;

public class Questoftime {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter the minutes after the hour.
    	System.out.println ("Enter the minutes after the hour");
    		//Their input assigned to an int variable.
    		int Min = Input.nextInt();
    		//Calculating what the minutes after the hour would be if we went "Min" minutes backwards instead of forewards from the 12 mark.
    		int Calc = 60 - Min;
    		//Setting up a variable for the hour that will be modified later.
    		int Hour = 0;
    		//Setting up a variable for the leading zero that will remain blank if not needed..
    		String Zero = ""; 
    		
    		//The if statement that determines if the leading zero is needed.
    		if (Min < 10)
    			Zero = "0";
    	
    	//The switch statement that will convert the backwards minute value of "Calc" to its respective hour value on the face of a clock. 	
    	switch (Calc){
    		//The case for 12.
    		case 60: case 1: case 2: case 3: case 4:
    			Hour = 12;
    			break;
    		//The case for 1.
    		case 5: case 6: case 7: case 8: case 9:
    			Hour = 1;
    			break;
    		//The case for 2.	
    		case 10: case 11: case 12: case 13: case 14:
    			Hour = 2;
    			break;
    		//The case for 3.	
    		case 15: case 16: case 17: case 18: case 19:
    			Hour = 3;
    			break;
    		//The case for 4.	
    		case 20: case 21: case 22: case 23: case 24:
    			Hour = 4;
    			break;
    		//The case for 5.
    		case 25: case 26: case 27: case 28: case 29:
    			Hour = 5;
    			break; 
    		//The case for 6.			
    		case 30: case 31: case 32: case 33: case 34:
    			Hour = 6;
    			break;
    		//The case for 7.	
    		case 35: case 36: case 37: case 38: case 39:
    			Hour = 7;
    			break;
    		//The case for 8.	
    		case 40: case 41: case 42: case 43: case 44:
    			Hour = 8;
    			break;
    		//The case for 9.	
    		case 45: case 46: case 47: case 48: case 49:
    			Hour = 9;
    			break;
    		//The case for 10.	
    		case 50: case 51: case 52: case 53: case 54:
    			Hour = 10;
    			break;
    		//The case for 11.	
    		case 55: case 56: case 57: case 58: case 59:
    			Hour = 11;
    			break;}								
    	
    	//Printing the "equidistance from 6" time with the leading zero on the minutes if needed.
    	System.out.println (Hour + ":" + Zero + Min + "\n");	
    }
    
    
}