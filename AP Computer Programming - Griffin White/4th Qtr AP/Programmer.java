/**
 * @(#)Programmer.java
 * Griffin  White
 *
 * @author 
 * @version 1.00 2019/3/28
 */

import java.io.*;
import java.util.*;

public class Programmer extends Worker 
{
	
	public String progLang;
	
    public Programmer(String n, double s, String l) 
    {
    	super(n, s);
    	progLang = l;
    }
    
    public String getLang()
    {
    	return progLang;
    }
    
    public void work()
    {
    	System.out.println ("Programmer Working");
    }
    
    public String toString()
    {
    	return "Programmer "+ super.toString() + " and programs in " + progLang;
    }
}