/**
 * @(#)Basketball.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/9/26
 */
//GOOD JOB
//GRADE = 100
import java.util.*;

public class Basketball {

    public static void main (String [] args) 
    {
    	//Adding a new Scanner.
    	Scanner Input = new Scanner (System.in);
    	
    	//The first statement to greet user along with the Scanner input.
    	System.out.println ("Enter the number of free throws");
    	int FT = Input.nextInt();
    	
    	//Second statement and Scanner.
    	System.out.println ("\nEnter the number of regular shots");
    	int RS = Input.nextInt();
    	
    	//Third statement and Scanner.
    	System.out.println ("\nEnter the numebr of 3-pointers");
    	int TP = Input.nextInt();
    	
    	//Calculating the total points scored and assigning a varible to that value. 
    	int Total = FT+RS*2+TP*3;
    	
    	//Final statement that shows total points.	
    	System.out.println ("\nYou made " + Total + " points.\n");	
    	
    	
    }
    
    
}