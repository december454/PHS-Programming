/**
 * @(#)Animal.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/9
 */


public abstract class Animal {
	
	private String name;
	private String noise;

    public Animal() 
    {
    	name = "no name";
    	noise = "mute";
    }
    
    public Animal (String  newName, String newNoise)
    {
    	name = newName;
    	noise = newNoise;
    }
    
    public void setName (String newName)
    {
    	name = newName;
    }
    
    public void setNoise (String newNoise)
    {
    	noise = newNoise;
    }
    
    public String getName ()
    {
    	return name;
    }
    
    public String getNoise ()
    {
    	return noise;
    }
    
    public abstract String speak();
    
    	
    
}