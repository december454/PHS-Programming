/**
 * @(#)Bird.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/9
 */


public abstract class Bird extends Animal{

    public Bird() 
    {
    	super();
    	setName("Tweety");
    	setNoise ("tweet");
    }
    
    public Bird (String newName, String newNoise)
    {
    	super (newName, newNoise);
    }
    
    public String fly()
    {
    	return getName() + " is soaring above the clouds.";
    }
    
}