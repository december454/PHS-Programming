/**
 * @(#)Manager.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/28
 */

import java.io.*;
import java.util.*;

public class Manager extends Worker
{
	

    public Manager(String n, double s) 
    {
    	super(n, s);
    }
    
     public void work()
    {
    	System.out.println ("Manager Working");
    }
    
    public String toString()
    {
    	return "Manager " + super.toString();
    }
    
    
    
}