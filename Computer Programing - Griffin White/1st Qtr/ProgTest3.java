/**
 * @(#)ProgTest3.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/25
 */
 //TEST GRADE = 100
import java.util.*;

public class ProgTest3 {

    public static void main (String [] args) 
    {
    	Scanner Input = new Scanner (System.in);
    	
    	System.out.print ("Enter a :: ");
    		double a = Input.nextDouble();
    	System.out.print ("Enter b :: ");
    		double b = Input.nextDouble();
    	System.out.print ("Enter c :: ");		
    		double c = Input.nextDouble();
    		
    	double rootone = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
    	double roottwo = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);	
    		
    	System.out.println();
    	System.out.printf ("rootone :: %.2f", rootone);	
    	System.out.println();
    	System.out.printf ("roottwo :: %.2f", roottwo);
    	System.out.println("\n");
    }
    
    
    
}