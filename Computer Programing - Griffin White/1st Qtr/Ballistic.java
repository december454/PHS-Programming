/**
 * @(#)Ballistic.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/20
 */
//GRADE = 100
import java.util.*;

public class Ballistic {

    public static void main (String [] args) 
    {	
    	Scanner Input = new Scanner (System.in);
    		
    	//The first prompts that greet the user where they will enter the initial velocity (V) and the launch angle in degrees (W1). Those values are then assigned to their respective double variables. 	
    	System.out.print ("Please enter the initial velocity in meters per second: ");
    		double V = Input.nextDouble();
    	System.out.print ("Please enter the launch angle in degrees: "); 
    		double W1 = Input.nextDouble();
    	
    	//Assigning the value of gravity to a double variable.	
    	double G = 9.80665;
    	//Assigning the value of Pi to a double variable.
    	double Pi = 3.14159265;
    	//Converting the value of the launch angle to radians and then assigning that answer to a new double variable.
    	double W2 = Pi*W1/180;
    	//Using all of the now defined variables to calculate the distance with the equation provided. The answer is then assigned to a double variable.
    	double D = Math.pow(V,2)*Math.sin(2*W2)/G;
    	
    	//Printing the solution rounded to the nearest ten thousandths since that is how the answer was presented on the paper.
    	System.out.println();
    	System.out.printf ("The distance equals: %.4f\n",D);
    	System.out.println();
    }
    
    
}