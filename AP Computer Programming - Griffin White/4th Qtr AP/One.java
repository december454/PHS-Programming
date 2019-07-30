/**
 * @(#)One.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/26
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class One {
	
	public int first;
	public int second;

    public One() 
    {
    	first = 1;
    	second = 2;
    	printit();
    }
    
    public One (int f, int s)
    {
    	first = f;
    	second = s;
    	printit();
    }
    
    public void printit ()
    {
    	System.out.println ("One");
    	System.out.println ("First: " + first + " Second: " + second);
    }
    
    
}