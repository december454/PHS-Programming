/**
 * @(#)Dog.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/9
 */


public class Dog extends Mammal {
	
	public Dog()
	{
		super("Fido", "Woof");
	}

    public Dog(String newName, String newNoise) 
    {
    	super (newName, newNoise);
    }
    
    public String speak ()
    {
    	return getNoise();
    }
    
    public String Fetch()
    {
    	return getName() + " get the stick!";
    }
    
    
}