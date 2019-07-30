/**
 * @(#)Kramer.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/18
 */ 
//GRADE = 100
import java.util.*;

public class Kramer {

    public static void main (String [] args) 
    {
    	//Instantiating the Scanner variable.
    	Scanner Input = new Scanner (System.in);
    	
    	//The first prompt to greet the user where they will enter the values of A, B, and C and the double variables those values will be assigned to.
    	System.out.println ("Please enter a value for A, B, and C");
    		double A = Input.nextDouble();
    		double B = Input.nextDouble();
    		double C = Input.nextDouble();
    	
    	//The second prompt to greet the user where they will enter the vlaues of D, E, and F and the double variables those values will be assigned to. 
    	System.out.println ("Please enter a value for D, E, and F");
    		double D = Input.nextDouble();
    		double E = Input.nextDouble();
    		double F = Input.nextDouble();
    	
    	//Using the provided formula to calculate the values of X and Y and then assigneing the answers to their respective variables.	
    	double X = (C*E-B*F)/(A*E-D*B);
    	double Y = (A*F-C*D)/(A*E-D*B);
    	
    	//The final message that states the X and Y values rounded to the nearest tenth. It seems "printf" does not like escape sequences so blank lines were added the old fasioned way.
    	System.out.println();
    	System.out.printf ("X = %.1f\n", X);
    	System.out.printf ("Y = %.1f\n", Y);
    	System.out.println();
    		
    	
    }
    
    
}