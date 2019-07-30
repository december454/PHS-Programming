/**
 * @(#)Person.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/3
 */


public class Person 
{
	//A set of String variables that will hold info required for every "Person".
	String name, address, phone, email;
	
	//Taking in the info sent over from the driver.
	public Person (String n, String a, String p, String e)
	{
		//Assiging valus to all of the info variables.
		name    = n;
		address = a;
		phone   = p;
		email   = e;
	}
	
	//A method to return the person's name.
    public String getName()
    {
    	//Returning the name.
    	return name;
    }
    
    //A method to return the person's address.
    public String getAddress()
    {
    	//Returning the address.
    	return address;
    }
    
    //A method to return the person's phone number.
    public String getPhone()
    {
    	//Returning the phone number.
    	return phone;
    }
    
    //A method to return the person's email.
    public String getEmail()
    {
    	//Returning the email.
    	return email;
    }
	
	//A method which will print out a person's information.
    public void printer ()
    {
    	//Printing out their name.
    	System.out.println ("\nPerson " + name + ".");
    }
}