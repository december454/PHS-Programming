/**
 * @(#)CarDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/17
 */

import java.io.*;
import java.util.*;

public class CarDriver {

    public static void main (String [] args) 
    {
    	//car specs: manufacturer, color, odometer
    	
    	//instantiate a car object
    	Car mycar = new Car ("Volvo", "White", 114000);
    	
    	Car yourcar = new Car ("Toyota", "Blue", 19229);
    	
    	System.out.println ("My car is " + mycar.getColor());
    	System.out.println ("Your car is " + yourcar.getColor());
    	
    	yourcar.setColor("Cream");
    	
    	System.out.println ("My car is " + mycar.getColor());
    	System.out.println ("Your car is " + yourcar.getColor());
    	
    	System.out.println ("My car is a " + mycar.getMake());
    	System.out.println ("Your car is a " + yourcar.getMake());
    	
    	yourcar.getMake ("Mazda");
    	mycar.getMake ("Ford");
    	
    	System.out.println ("My car is a " + mycar.getMake());
    	System.out.println ("Your car is a " + yourcar.getMake());
    	
    }
    
    
}