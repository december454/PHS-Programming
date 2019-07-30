/**
 * @(#)WorkerDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/3/28
 */

import java.io.*;
import java.util.*;

public class WorkerDriver {

    public static void main (String [] args) 
    {
    	//Create a worker object.
    	Worker bob = new Worker ("Bob", 10000);
    	
    	//Create a programmer object.
    	Programmer hlavaty = new Programmer ("Cindy", 50000, "Java");
    		
    	//Create a manager object.
    	Manager omar = new Manager ("Omar", 55000);
    	
    	bob.work();
    	hlavaty.work();
    	omar.work();
    	
    	System.out.println (hlavaty.getLang());
    	
    	bob.raiseSalary (1000);
    	
    	System.out.println (bob.toString());
    	
    	System.out.println (hlavaty.progLang);
    	
    	hlavaty.raiseSalary (20000);
    	
    	omar.raiseSalary (10);
    	
    	System.out.println (hlavaty.toString());
    	
    	System.out.println (omar.toString());
    }
    
    
}