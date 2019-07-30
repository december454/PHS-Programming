/**
 * @(#)Giant.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/9/13
 */


public class Giant {

    public static void main (String [] args) 
    {
    	//asssign values to base and height
    	int base = 45;
    	int height = 38;
    	
    	//find the area of the mask
    	double area = 1.0/2 * base * height;
    	
    	//find the cost of the mask
    	double cost = area * 4;
    	
    	//print the area and the cost of the mask
    	System.out.print ("The area of the mask is ");
    	System.out.println (area);
    	System.out.print ("The cost of the mask is $");
    	System.out.println (cost);
    }
    
    
}