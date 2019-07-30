/**
 * @(#)Three.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/26
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Three extends Two {
	
	public int first, third;

    public Three() 
    {
    	super();
    	first = 10;    	
    	second = 11;    	
    	third = 12;
    	System.out.println ("third: " + super.third);
    	printit();  	
    }
    
    public Three (int f, int s, int t)
    {
    	first = f;
    	second = s;
    	third = t;
    }
    
  	public void printit ()
    {
    	System.out.println ("Three");
    	System.out.println ("First: " + first + " Second: " + second + " Third: " + third);
    }
    
    
}