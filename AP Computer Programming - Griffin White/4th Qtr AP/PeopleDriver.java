/**
 * @(#)PeopleDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/3
 */

/////////////////////////////////////////////////Complete////////////////////////////
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class PeopleDriver {

    public static void main (String [] args)
    {
    	//Creating a Scanner to take in the user's "input".
    	Scanner input = new Scanner (System.in);
    	
    	//A String variable that will record if the user wants to run the program again.
    	String again = "n";
    	
    	//A do while that will cycle until the the user is finished.
    	do
    	{
    		//A set of String variables to hold optional person info.
    		String status, officeNum, salary, hireDate;   
    		
    		//Creating an "Info" object.
   			Person Info;
    		
    		//Asking the user to enter the person's name and taking in their input.	
    		System.out.println ("\nPlease enter the person's name:");
    		String name = input.nextLine();
    		
    		//Asking the user to enter the person's address and taking in their input.
    		System.out.println ("\nPlease enter the person's address:");
    		String address = input.nextLine();
    		
    		//Asking the user to enter the person's phone number and taking in their input.
    		System.out.println ("\nPlease enter the person's phone number:");
    		String phone = input.nextLine();
    		
    		//Asking the user to enter the person's email address and taking in their input.
    		System.out.println ("\nPlease enter the person's email address:");
    		String email = input.nextLine();
    		
    		System.out.println ("\n----------------------------------------------------");
    		
    		//Asking the user if they are entering a person, student, or employee and taking in their response.
    		System.out.println ("\nAre they a Person (P), Student (S), or Employee (E)?");
    		String title = input.nextLine();
    		
    		//An if statement for when it is a student.    	 	    		
    		if (title.equalsIgnoreCase ("S"))
    		{
    			//Asking them to enter the student's status.
    			System.out.println ("\nPlease enter the student's status:");
    			status = input.nextLine();   
    			//Sending over the student's info to the "Student" class.
    			Info = new Student (name, address, phone, email, status);
    		}
    		
    		//An else if statement for if it is an employee.
    		else if (title.equalsIgnoreCase ("E"))
    		{
    			//Asking the user to enter the employee's office number and recording their input.
    			System.out.println ("\nPlease enter the Employee's office number:");
    			officeNum = input.nextLine();   
    			
    			//Asking the user to enter the employee's salary and recording their input.	
    			System.out.println ("\nPlease enter the Employee's salary:");
    			salary = input.nextLine(); 
    			
    			//Asking the user to enter the employee's date of hire and recording their input.	
    			System.out.println ("\nPlease enter the Employee's date of hire:");
    			hireDate = input.nextLine(); 
    			
    			//Sending over the employee's info to the "Employee" class.	
    			Info = new Employee (name, address, phone, email, officeNum, salary, hireDate); 	  				
    		}
    		
    		//An else for when it is a person.
    		else
    		{
    			//Sending over the person's info to the "Person" class.
    			Info = new Person (name, address, phone, email);
    		}
    		
    		//Calling to the printer method in "Info".    		
    		Info.printer();
    		System.out.println ("\n----------------------------------------------------");
    		
    		//Asking the user if they want to run the program again and taking in their response.
    		System.out.println ("\nDo you want to run the program again? (Y/N)");
    		again = input.nextLine();
    	}
    	
    	//Running the program again if desired.
    	while (again.equalsIgnoreCase ("Y"));
    }        
}