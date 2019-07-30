/**
 * @(#)Sum.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/22
 */


public class Sum 
{
	
	//A pair of private double variables that will hold the numbers to be added together.
	private double NumA;
	private double NumB;
	
	//The main constructor that will take in the two values from "Sumdriver".
    public Sum(double NumA1, double NumB1) 
    {
    	//Assiging the values sent over to the "NumA" and "NumB" variables. 
    	NumA = NumA1;
    	NumB = NumB1;
    }
    
    //A method that will print out the sum.
    public void PrintSum()
    {
    	//Printing out the numbers being added.
    	System.out.print ("\n" + NumA + " + " + NumB + " == ");
    	
    	//Printing out the result rounded to the nearest hundredth.
    	System.out.printf ("%.2f", NumA + NumB);
    	
    }
    
    
}