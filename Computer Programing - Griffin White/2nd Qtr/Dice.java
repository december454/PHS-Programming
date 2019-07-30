/**
 * @(#)Dice.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/1
 */
//I LIKE YOUR PROGRAMMING STYLE
//GRADE = 100
//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Dice {

    public static void main (String [] args)
    {
    	//Instantiating a Scanner.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter 1-6 for the respective side of a die.
    	System.out.println ("Enter the die you want printed (1-6).");
    		//Their input assigned to an int variable.
    		int Number = Input.nextInt();
    		//Setting up a String variable for the die outside of any if statements, but as I type this I realized that I really didn't need to do this since I was using switch statements and you can define variables within them.
    		//BUT IF YOU CREATE THE VARIABLE IN THE SWITCH YOU CAN'T USE IT OUTSIDE OF THE SWITCH
    		String Die = " ";
    	
    	//The switch statement that will assign a given die face to the variable "Die" based on the value of "Number".	
    	switch (Number){
    		//The "1" result.
    		case 1:
    			Die = "-------\n|     |\n|  o  |\n|     |\n-------";
    			break;	
    		//The "2" result.
    		case 2:
    			Die = "-------\n| o   |\n|     |\n|   o |\n-------";
    			break;		
    		//The "3" result.		
    		case 3:
    			Die = "-------\n| o   |\n|  o  |\n|   o |\n-------";
    			break;
    		//The "4" result.	
    		case 4:
    			Die = "-------\n| o o |\n|     |\n| o o |\n-------";
    			break;	
    		//The "5" result.		
    		case 5:
    			Die = "-------\n| o o |\n|  o  |\n| o o |\n-------";
    			break;	
    		//The "6" result.		
    		case 6:
    			Die = "-------\n| o o |\n| o o |\n| o o |\n-------";
    			break;
    		//The default result if the number entered is not 1-6.
    		default:
    			Die = "-------\n|     |\n|  ?  |\n|     |\n-------";}	
    	
    	//Printing the die.
    	System.out.println ("\n" + Die + "\n");		
    }
    
    
}