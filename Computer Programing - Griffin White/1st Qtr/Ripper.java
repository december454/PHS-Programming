/**
 * @(#)Ripper.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/4
 */

//GRADE = 100
public class Ripper {

    public static void main (String [] args) 
    {
    	//Assigning all of the String variables.
    	String word1 = "chicken";
    	String word2 = "alligator";
    	String word3 = "COMPUTER SCIENCE IS THE BEST!";
    	String word4 = "I like fried chicken and mashed potatoes!";
    	
    	//The first set of lines to print using word1.
    	System.out.println (word1.substring (3,6));
    	System.out.println (word1);
    	
    	//The second set using word2.
    	System.out.println ("\n" + word2.substring (3,8));
    	System.out.println (word2);
    	
    	//The third, longer, set now using word3.
    	System.out.println ("\n" + word3.substring (9,12));
    	System.out.println (word3.substring (0,12));
    	System.out.println (word3.substring (5,19));
    	System.out.println (word3);
    	
    	//The final, longest, set of lines using word4.
    	System.out.println ("\n" + word4.substring (0,6));
    	System.out.println (word4.substring (7,15));
    	System.out.println (word4.substring (15,26));
    	System.out.println (word4.substring (22,26));
    	System.out.println (word4 + "\n");
    }
    
    
}