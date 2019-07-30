/**
 * @(#)Mammal.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/9
 */


public abstract class Mammal extends Animal{

    public Mammal() 
    {
    	setName("Fuzzball");
    	setNoise("growl");
    }
    
    public Mammal (String newName, String newNoise)
    {
    	super(newName, newNoise);
    }
    
    public String shed()
    {
    	return getName() + " is shedding.";
    }
    
    
}