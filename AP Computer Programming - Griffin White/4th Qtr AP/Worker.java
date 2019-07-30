/**
 * @(#)Worker.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/28
 */

//Importing everything that I may need.
import java.util.*;
import java.io.*;

public class Worker 
{
	private String name;
	private double salary;

    public Worker(String n, double s) 
    {
    	name = n;
    	salary = s;    	
    }
    
    public String getName()
    {
    	return name;
    }
    
    public double getSalary()
    {
    	return salary;
    }
    
    public void raiseSalary (double amt)
    {
    	salary += amt;
    }
    
    public void work()
    {
    	System.out.println ("Worker Working");
    }
    
    public String toString()
    {
    	return name + " has a yearly salary of $" + salary;
    }
}