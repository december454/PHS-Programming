/**
 * @(#)Two.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/26
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Two extends One {
	
	public int second;
	public int third;

    public Two() 
    {
    	super(6,8);
    	first = 5;
    	second = 4;
    	third = 5;
    	printit();
    }
    
    public Two (int f, int s, int t)
    {
    	first = f;
    	second = s;
    	third =t;
    }
    
    public void printit ()
    {
    	System.out.println ("Two");
    	System.out.println ("First: " + first + " Second: " + second + " Third: " + third);
    }
    
    
}