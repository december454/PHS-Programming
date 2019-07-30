/**
 * @(#)Student1.java
 * Grffin White
 *
 * @author 
 * @version 1.00 2019/4/10
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public abstract class Student1 {
	
	//A set of String variables to hold a student's id num and name.
	private String idNum, lastName;
	//A double variable to hold a student's tuition.
	public double tuition;
	
	//The main constructor that takes in a student's id and name.
	public Student1 (String i, String l)
	{
		//Assiging all of the sent over values to their respective variables.
		idNum = i;
		lastName = l;
	}
	
	//A method that returns a student's id num.
	public String getIdNum ()
	{
		//Returning the id num.
		return idNum;
	}
	
	//A method that returns a student's last name.
	public String getLastName ()
	{
		//Returning the last name.
		return lastName;
	}
	
	//A method that returns a student's tuition.
	public double getTuition ()
	{
		//Returning the tuition.
		return tuition;
	}
	
	//A method that sets a student's id num.
	public void setIdNum (String i)
	{
		//Setting a new value for "idNum".
		idNum = i;
	}
	
	//A method that sets a student's last name.
	public void setLastName (String l)
	{
		//Setting a new value for "lastName".
		lastName = l;
	}
	
	//An abstract method that sets a student's tuition.
	public abstract void setTuition (double h);
	
	//A method which will print all of a student's info.
	public void Printer ()
	{	
		//Printing out their id number and last name.
		System.out.printf("%-15.15s  %-15.15s ", idNum, lastName);	
		//Printing out their tuition in dollar form.
		System.out.printf("$%,.2f%n", tuition);		
	}          
}