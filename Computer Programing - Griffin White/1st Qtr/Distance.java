/**
 * @(#)Distance.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/17
 */
//GRADE = 100
import java.util.*;

public class Distance {

    public static void main (String [] args) 
    {
    	Scanner Input = new Scanner (System.in);
    	
    	//The first prompt to greet the user where they will enter the first X value and a double variable that their input is assigned to.
    	System.out.print ("Enter X1 :: ");
    	double X1 = Input.nextDouble();
    	
    	//The second prompt where the first Y value is entered and a double variable assigned to what they entered.
    	System.out.print ("Enter Y1 :: ");
    	double Y1 = Input.nextDouble();
    	
    	//Third prompt where the second x value is entered, double variable assigned to that input.
    	System.out.print ("Enter X2 :: ");
    	double X2 = Input.nextDouble();
    	
    	//Fourth prompt, second Y value, double variable assigned to that value.
    	System.out.print ("Enter Y2 :: ");
    	double Y2 = Input.nextDouble();
    	
    	//Calculating only the portions of the equation that are within parenthesis for simplicity. 
    	double Part1 = Math.pow((X2-X1),2);
    	double Part2 = Math.pow((Y2-Y1),2);
    	
    	//Adding up the two previous values and finding the square root of the sum. The sum is then assigned to a variable. 
    	double Answer = Math.sqrt(Part1+Part2);
    	
    	//The final message that displays the solution.
    	System.out.printf ("distance == %.3f\n", Answer);
    	System.out.println();
    }
    
    
}