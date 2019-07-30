/**
 * @(#)Sparrow.java
 *
 *
 * @author 
 * @version 1.00 2019/4/10
 */


public class Sparrow extends Bird{

    public Sparrow() 
    {
    	super();
    	setName ("Sporty");
    	setNoise("Worble");
    }
    
    public Sparrow (String newName, String newNoise)
    {
    	super (newName, newNoise);
    }
    
    public String speak ()
    {
    	return getNoise();
    }
    
    public String sing()
    {
    	return getNoise() + " " + getNoise() + " " + getNoise();
    }
}