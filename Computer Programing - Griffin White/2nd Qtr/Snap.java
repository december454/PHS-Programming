/**
 * @(#)Snap.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/12/14
 */

//LEFT OFF SNAPCRACKLEPOP
//GRADE = 92
//Nothing was needed to be imported.

public class Snap {

    public static void main (String [] args) 
    {
    	//The for loop that will print every interger from 1 to 100.
    	for (int K = 1;K <= 100; K++)
    	{
    		//The if statement for the divisible by 2 but not 3 or 5 message.
    		if ((K%2 == 0) && (K%3 != 0) && (K%5 != 0))
    			System.out.println ("SNAP");
    		//The else if statement for the divisable by 3 but not 2 or 5 message.
    		else if ((K%3 == 0) && (K%2 != 0) && (K%5 != 0))
    			System.out.println ("CRACKLE");	
    		//The else if statement for the divisable by 5 but not 2 or 3 message.
    		else if ((K%5 == 0) && (K%2 != 0) && (K%3 != 0))
    			System.out.println ("POP");
    		//The else if statement for the divisable by 2 and 3 but not 5 message.
    		else if ((K%2 == 0) && (K%3 == 0) && (K%5 != 0))
    			System.out.println ("SNAPCRACKLE");
    		//The else if statement for the divisable by 2 and 5 but not 3 message.
    		else if ((K%2 == 0) && (K%5 == 0) && (K%3 != 0))
    			System.out.println ("SNAPPOP");
    		//The else if statement for the divisable by 3 and 5 but not 2 message.
    		else if ((K%3 == 0) && (K%5 == 0) && (K%2 != 0))
    			System.out.println ("CRACKLEPOP");
    		//The else if statement for the divisable by 2, 3, and 5 message.
    		else if ((K%2 == 0) && (K%3 == 0) && (K%5 == 0))
    			System.out.println ("CRACKLE");	
    		//The else statement for the default message if it doesn't meet any of the previous criteria.
    		else 
    			System.out.println (K);															
    	}
    	System.out.println ();
    }
    
    
}