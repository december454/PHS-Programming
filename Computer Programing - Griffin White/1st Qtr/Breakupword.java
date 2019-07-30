/**
 * @(#)Breakupword.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/10/3
 */
//GRADE = 100

public class Breakupword {

    public static void main (String [] args)
    {
    	//Assigning all of the string variables to be used.
    	String word1 = "hello world";
    	String word2 = "jim bob";
    	String word3 = "sally sue";
    	String word4 = "computer science";
    	String word5= "uil contests";
    	
    	
    	//The first pair of lines that use word1, hopefull everthing will line up better for you, like on the paper, when you run it if you are using a differnt font or something.
    	System.out.println ("first :: " + word1.substring (0,5));
    	System.out.println ("last :: " + word1.substring (6,11)); 
    	
    	//The second pair that uses word2.
    	System.out.println ("\nfirst :: " + word2.substring (0,3));
    	System.out.println ("last :: " + word2.substring (4,7));
    	
    	//The third pair using word3.
    	System.out.println ("\nfirst :: " + word3.substring (0,5));
    	System.out.println ("last :: " + word3.substring (6,9));
    	
    	//The fourth pair using word4.	
    	System.out.println ("\nfirst :: " + word4.substring (0,8));
    	System.out.println ("last :: " + word4.substring (9,16));
    	
    	//The last pair that is using word5.
    	System.out.println ("\nfirst :: " + word5.substring (0,3));
    	System.out.println ("last :: " + word5.substring (4,12));
    	
    	
    	//The second section that uses multiple String variables at once and manipulates them to a greter extent. The seccond line of text was split into two lines of code to make it more manageable. 
    	System.out.println ("\n" + word5.substring (0,3).toUpperCase() + " " + word4 + " " + word5.substring (4,12) + " are out of this " + word1.substring (6,11) + ".");
    	System.out.print   ("\n" + word2.substring (0,1).toUpperCase() + word2.substring (1,3) + " and " + word3.substring (0,1).toUpperCase() + word3.substring (1,5) + " met " + word2.substring (4,5).toUpperCase());
    	System.out.println (word2.substring (5,7) + " and " + word3.substring (6,7).toUpperCase() + word3.substring (7,9 ) + " at the " + word5.substring (0,3).toUpperCase() + " " + word4.substring (9,16) + " competition.\n");

    
    }
    
    
}