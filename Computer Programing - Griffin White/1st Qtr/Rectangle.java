/**
 * @(#)Rectangle.java
 * Griffin White 
 * 
 * @author 
 * @version 1.00 2017/9/15
 */

//GRADE = 100
public class Rectangle {

    public static void main (String [] args) 
    {
    	int Length = 8; //int used since we aren't dealing with decimals.
    	int Width = 4;
    	int Perimeter = 2*Width+2*Length;
    	int Area = Width*Length;
//----------------------------------------------------------------------------------------------------------------
		System.out.print ("The perimeter of the rectangle is ");
		System.out.print (Perimeter);
		System.out.println (" inches.");
		System.out.println (); //I believe that you wanted the two statements seperated, so here is a blank line.
		System.out.print ("The area of the rectangle is ");
		System.out.print (Area);
		System.out.println (" inches squared.");
		System.out.println ();
		
		
    	
    	
    }
    
    
}