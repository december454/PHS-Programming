/**
 * @(#)Stringprogtest.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/5
 */

//DID NOT USE THE LENGTH METHOD
//TEST GRADE = 90
public class Stringprogtest {

    public static void main (String [] args)  
    {
    	String line1 = "computer warning";
    	String line2 = "watch for virus signs";
    	String line3 = "crashed websites";
    	String line4 = "user friendly programs";
    	String line5 = "browsing with computers";
    	
    	
    	//I don't know if you wanted us to or not, but I used substrings to create words like "I" and "a" as well as the "With" in "Without".
    	System.out.println (line5.substring (9,10).toUpperCase() + line5.substring (10,13) + "out any " + line1.substring (9,16) + "," + " the " + line1.substring (0,8) + " " + line3.substring (0,7).toUpperCase() + ".");
    	
    	System.out.println ("\n" + line2.substring (0,1).toUpperCase() + line2.substring (1,5) + " out " + line2.substring (6,10) + line2.substring (1,2) + " new " + line1.substring (0,8) + line2.substring (9,15) + ".");
    	
    	System.out.println ("\n" + line1.substring (13,14).toUpperCase() + " spend ages " + line5.substring (0,9) + "differnt " + line3.substring (8,16) + ".");
    	
    	System.out.println ("\n" + "Some " + line5.substring (14,23) + " and " + line4.substring (14,22) + " are more " + line4.substring (0,4).toUpperCase() + "-" + line4.substring (5,13).toUpperCase() + " than others.");
    	
    	System.out.println ("\n" + line4.substring (0,1).toUpperCase() + line4.substring (1) + " contain 22 characters.\n"); 
    }
    
    
}