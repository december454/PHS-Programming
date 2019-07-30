/**
 * @(#)CityPop.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/3
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class CityPop {
	
	//A set of private variable which will hold the values that are sent over.
	private String City = "";
	private String State = "";
	private int Population = 0;
	
	//The main constructor that will take in the values sent over from "CityPopDriver".
    public CityPop(String C, String S, int P)
    {
    	//Assigning all of the values that were sent over.
    	City = C;
    	State = S;
    	Population = P;    	
    }
    
    //A methiod that will return the city's name.
    public String CityReturn()
    {
    	return City;
    }
    
    //A methiod that will return the city's state.
    public String StateReturn()
    {
    	return State;
    }
    
    //A methiod that will return the city's population.
    public int PopReturn()
    {
    	return Population;
    }
    
}