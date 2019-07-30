/**
 * @(#)HiBye.java
 *
 *
 * @author 
 * @version 1.00 2017/10/2
 */

//GRADE = 100
public class HiBye {

    public static void main (String [] args) 
    {
    	//Assigning string variables.
    	String a = "Hi";
    	String b = "Bye"; 
    	
    	//First set of lines to print using only the String variables.	
    	System.out.println (a+b+b+a);
    	System.out.println (b+a+b+a);
    	System.out.println (a+a+b+b);
    	
    	//Second set of lines to print using both the string variables and other text.
    	System.out.println ("\n" + a + " Mrs. Hlavaty.");
    	System.out.println ("I like to drink " + a + "-C.");
    	System.out.println ("I want to go " + b + "-" + b + ":)\n");
    }
    
    
}