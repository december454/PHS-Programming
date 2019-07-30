/**
 * @(#)Cow.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/9
 */


public class Cow extends Mammal{

    public Cow() 
    {
    	super ("Bessie", "Moo");
    }
    
    public Cow (String newName, String newNoise)
    {
    	super (newName, newNoise);
    }
    
    public String speak()
    {
    	return getNoise();
    }
    
    public String milk()
    {
    	return getName() + " gave two pints of fresh milk.";
    }
    
    
}