/**
 * @(#)Duck.java
 *
 *
 * @author 
 * @version 1.00 2019/4/10
 */


public class Duck extends Bird{

    public Duck() 
    {
    	super();
    	setName ("Daffy");
    	setNoise ("Quack");
    }
    
    public Duck (String newName, String newNoise)
    {
    	super (newName, newNoise);
    }
    
    public String speak ()
    {
    	return getNoise();
    }
    
    public String swim()
    {
    	return getName() + " swims across the lake.";
    }
}