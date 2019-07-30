/**
 * @(#)Shirts.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/9/22
 */
//GOOD JOB
//GRADE = 100
//Importing Scanner
import java.util.*;

public class Shirts {

    public static void main (String [] args)
    {
    	//Setting up the scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//Line asking for input.
    	System.out.print ("Enter the number of shirts sold today: ");
    	
    	//Defining and assigning variables for shirts sold and profit.
    	int Shirts = Input.nextInt();
    	int Profit = 8*Shirts-95;
    	
    	//Output line stating profits. 
    	System.out.println("\n" + "You made a profit of $" + Profit + "." + "\n");
    	
    }
    
    
}