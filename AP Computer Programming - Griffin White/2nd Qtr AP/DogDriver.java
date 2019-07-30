/**
 * @(#)DogDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/15
 */

import java.io.*;
import java.util.*;

public class DogDriver {

    public static void main (String [] args)   
    {
    	//instantiate a dog object
    	//This will automatically call the default constructor
    	Dog puppy = new Dog();
    	
    	//instantiate a Dog object
    	//this will call the constructor
    	Dog bones = new Dog ("Nala");
    	
    	puppy.barking();
    	bones.barking();
    	
    	puppy.hungry();
    	
    	
    }
    
    
}