/**
 * @(#)Dog.java
 *
 *
 * @author 
 * @version 1.00 2018/10/15
 */


public class Dog 
{

	//instance variables
	private String name = "Juno";
	
	//Default constructor
    public Dog() 
    {
    	System.out.println ("My name is Brodie");
    }
    
    //constructor
    public Dog (String name)
    {
    	System.out.println ("My name that is sent over is " + name);
    	System.out.println ("My name is " + this.name);
    }
    
    //method to make dog sound
    public void barking()
    {
    	System.out.println ("Woof Woof");
    }
    
    //method to say I'm hungry.
    public void hungry()
    {
    	System.out.println("I'm hungry!! Feed me!!");
    	barking();
    }
}