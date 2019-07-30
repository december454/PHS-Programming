/**
 * @(#)Student.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/3
 */


public class Student extends Person
{
	//A String variable to hold a student's "status".
	String status;

	//Taking in the info sent over from the driver.
    public Student(String n, String a, String p, String e, String s) 
    {
    	//Calling to the super class and sending over the person info.
    	super (n,a,p,e);
    	//Recording the person's status.
    	status = s;
    }
    
    //A method to return the student's status.
    public String getStatus()
    {
    	//Returning the status.
    	return status;
    }
    
    //A method for printing out the student's info.
    public void printer()
    {
    	//Printing out their name and status.
    	System.out.println ("\nStudent " + name + " is a " + status + ".");
    }        
}