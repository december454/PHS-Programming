/**
 * @(#)Momentum.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/23
 */


public class Momentum 
{
	//A set of private double variables that will hold the values of the mass and velocity.
	private double Mass1;
	private double Velocity1;
	
	//The main constructor that will recieve the values from "MomentumDriver".
    public Momentum(double MassA1, double VelocityA1) 
    {
    	//Assigning the values sent over to the "Mass1" and "Velocity1" variables.
    	Mass1 = MassA1;
    	Velocity1 = VelocityA1;
    }
    
    //A method which will calculate the momentum and print it out to the nearest tenth.
    public void PrintMom ()
    {
    	//Printing out the results.
    	System.out.printf ("\nThe object's momentum is %.1f", (Mass1 * Velocity1));
    }   
}