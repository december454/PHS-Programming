/**
 * @(#)Car.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/17
 */


public class Car 
{

    	//instance variables
    	private String make;
    	private String color;
    	private int odom;
    	
    	public Car(String m, String c, int o)
    	{
    		//set values
    		make = m;
    		color = c;
    		odom = o;	
    	}
    	
    	//change the car's color
    	public void setColor (String newcolor)
    	{
    		color = newcolor;
    	}
    	
    	//return the car's color
    	public String getColor()
    	{
    		return color;
    	}
    	
    	//change the make of the car
    	public void setMake (String newMake)
    	{
    		make = newMake;
    	}
    	
    	//return the make of the car
    	public String getMake()
    	{
    		return make;
    	}
    
    
    
}