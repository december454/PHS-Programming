/**
 * @(#)Volsurf.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/23
 */
//GRADE = 100
import java.util.*;

public class Volsurf {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that greets the user where they will enter the radius and the double variable that will be assigned to the value they entered.
    	System.out.println ("Enter the radius.");
    		Double R = Input.nextDouble();
    	
    	//Using the radius entered to calculate the volume and surface area of the sphere with the formulas provided.
    	Double Volume = 4/3.0 * Math.PI * Math.pow (R,3);	
    	Double Surface = 4 * Math.PI * Math.pow (R,2);
    	
    	//The final message that greets the user and displays the answers of the above calculations.
    	System.out.println();
    	System.out.printf ("Volume = %.4f", Volume);
    	System.out.println();
    	System.out.printf ("Surface Area = %.4f\n", Surface);
    	System.out.println();
    		
    }
    
    
}