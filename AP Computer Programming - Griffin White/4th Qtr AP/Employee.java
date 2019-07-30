/**
 * @(#)Employee.java
 * Grffin White
 *
 * @author 
 * @version 1.00 2019/4/3
 */


public class Employee extends Person{
	
	//A set of String variable that hold info specific to employees.
	String officeNum, salary, hireDate;

	//Taking in all of the info sent over from the driver.
    public Employee(String n, String a, String p, String e, String o, String s, String h) 
    {
    	//Calling to the super class and sending over the person info.
    	super (n,a,p,e);
    	//Recording all of the employee specific info.
    	officeNum = o;
    	salary = s;
    	hireDate = h;    	
    }       
    
    //A method which will return the office number.
    public String getOfficeNum()
    {
    	//Returning the office munber.
    	return officeNum;
    }
    
    //A method which will return the salary.
    public String getSalary()
    {
    	//Returning the salary.
    	return salary;
    }
    
    //A method which will return the date of hire.
    public String getHireDate()
    {
    	//Returning the date of hire.
    	return hireDate;
    }
    
    //A method which will print out the employee's info.
    public void printer ()
    {
    	//Printing out the employee's name, office number, salary, and date of hire.
    	System.out.print   ("\nEmployee  " + name + " is located in office " + officeNum);
    	System.out.println (", makes " + salary + ", and was hired on " + hireDate + ".");
    }
}