/**
 * @(#)Triangle.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/19
 */
//GRADE = 100
import java.util.*;

public class Triangle {

    public static void main (String [] args) 
    {
    	//Instantiating a Scanner variable. 
    	Scanner Input = new Scanner (System.in);
    	
    	//The three prompts where the user will enter the values of A, B, and C and the double variables that will be assigned to each of those values. 
    	System.out.print ("Enter side A :: ");
    		double A = Input.nextDouble();
    	System.out.print ("Enter side B :: ");
    		double B = Input.nextDouble();
    	System.out.print ("Enter side C :: ");
    		double C = Input.nextDouble();
    		
    	//Adding up the three values entered by the user to calculate the perimiter and then dividing that value by 2 to get the value of S. The S value is then assigned to another double variable. 
    	double S = (A+B+C)/2;
    	
    	//Multiplying the values of S, (S-A), (S-B), and (S-C) together and then finding the square root of the product. The square root is then assigned to a double variable.  
    	double Area = Math.sqrt(S*(S-A)*(S-B)*(S-C));
    	
    	//Displaying the solution to the problem rounded to the nearest hundred thousandths. 
    	System.out.println(); 
    	System.out.printf ("Area == %.5f\n", Area);
    	System.out.println();
    	
    	
    		
    }
    
    
}