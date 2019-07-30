/**
 * @(#)Discount.java
 * Griffin White
 * 
 * @author 
 * @version 1.00 2017/11/3
 */
//GRADE = 100
//Importing everything that I may need.
import java.util.*;
import java.io.*;

public class Discount {

    public static void main (String [] args)
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that greets the user to enter the bill value and a double variable that will represent their input.
    	System.out.print ("Enter the original bill amount :: ");
    		Double Bill = Input.nextDouble();
    	
    	//The if statement that will print their discounted bill if it was over 2000 and the else statemet that will print their original bill if it was less than or equal to 2000.
    	if (Bill > 2000)
    		System.out.printf ("Bill after discount :: %.2f", (Bill*.85));
    	else 
    		System.out.printf ("Bill after discount :: %.2f", Bill);
    		
    		
    	System.out.println("\n");			
    }
    
    
}