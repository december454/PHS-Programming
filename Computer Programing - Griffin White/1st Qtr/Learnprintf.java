/**
 * @(#)Learnprintf.java
 *
 *
 * @author 
 * @version 1.00 2017/10/16
 */

import java.util.*;
public class Learnprintf {

    public static void main (String [] args) 
    {
    	Scanner Input = new Scanner (System.in);
    	
    	System.out.println("Please enter the diameter");
    	double diameter = Input.nextDouble();
    	
    	double radius = diameter /2;
    		
    	double area = Math.PI * Math.pow(radius, 2);
    	
    	double circumference = 2 * Math.PI * radius;
    	
    	System.out.printf("The area is %.1f.\n", area);
    	System.out.printf("The circumference is %.1f.\n", circumference); 
    		
    	String name = "Palacios";
    	System.out.printf("We live in %20s.\n", name);
    	
    	
    }
    
    
}