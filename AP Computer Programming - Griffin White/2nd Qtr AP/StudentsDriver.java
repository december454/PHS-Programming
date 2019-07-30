/**
 * @(#)StudentsDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/3
 */

import java.io.*;
import java.util.*;

public class StudentsDriver {

    public static void main (String [] args) throws IOException
    {
    	Scanner DF = new Scanner (new File("students.txt"));
    	
    	//student array
    	//Students [] child = new Students [10];
		ArrayList <Students> child = new ArrayList <Students>();
    	
    	//read in student id and grade level
    	for (int k = 0; k<10; k++)
    	{
    		String name = DF.next() + " " + DF.next();
    		int id = DF.nextInt();
    		int grade = DF.nextInt();
    		//child [k] = new Students (name, id, grade);
    		child.add (new Students (name, id, grade));
    	}
    	
    	System.out.println ("All students");
    	for (int k = 0; k < 10; k++)
    	{
    		//System.out.println (child[k].getName() + " " + child[k].getid() + " " + child[k].getGradeLevel());
    		System.out.println(child.get(k).getName() + " " + child.get(k).getid() + " " + child.get(k).getGradeLevel());
    	}
    	
    	System.out.println("\n9th Graders: ");
    	for (int k = 0; k < 10; k++)
    	{
    		//if (child[k].getGradeLevel() == 9)
    			//System.out.println (child[k].getName());
    			
    		if (child.get(k).getGradeLevel() == 9)	
    			System.out.println (child.get(k).getName());
    			
    		
    	}
    	
    	System.out.println("\n10th Graders: ");
    	for (int k = 0; k < 10; k++)
    	{
    		//if (child[k].getGradeLevel() == 10)
    			//System.out.println (child[k].getName());
    			
    		if (child.get(k).getGradeLevel() == 10)	
    			System.out.println (child.get(k).getName());	
    	}
    	
    	System.out.println("\n11th Graders: ");
    	for (int k = 0; k < 10; k++)
    	{
    		//if (child[k].getGradeLevel() == 11)
    			//System.out.println (child[k].getName());
    			
    		if (child.get(k).getGradeLevel() == 11)	
    			System.out.println (child.get(k).getName());	
    	}
    	
    	System.out.println("\n12th Graders: ");
    	for (int k = 0; k < 10; k++)
    	{
    		//if (child[k].getGradeLevel() == 12)
    			//System.out.println (child[k].getName());
    			
    		if (child.get(k).getGradeLevel() == 12)	
    			System.out.println (child.get(k).getName());	
    	}
    }
    
    
}