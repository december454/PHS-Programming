/**
 * @(#)Teacher.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/10
 */
 
 ///////////////////////////////////Complete////////////////////////////////

//Importing everything that I might need.
import java.io.*;
import java.util.*;

public class Teacher {
	
	//A set of private variables for the teacher's information.
	private String TName = "";
    private int TotYears = 0;
    private int PalYears = 0;
    private String TDept = "";
	
	//The main constructor that takes in the values sent over from the driver.
    public Teacher(String TN, int TY, int PY, String TD) 
    {
    	//Assiging the sent over values to the private variables.
    	TName    = TN;
    	TotYears = TY;
    	PalYears = PY;
    	TDept    = TD;    	
    }
    
    //A method that returns the teacher's name.
    public String GetTName ()
    {
    	//Returning their name.
    	return TName;
    }
    
    //A method that returns how long the teacher has been teaching.
    public int GetTotYears ()
    {
    	//Returning how long they have been teaching.
    	return TotYears;
    }
    
    //A method that returns how long the teacher has been working at PISD.
    public int GetPalYears ()
    {
    	//Returning how long the teacher has been at PISD.
    	return PalYears;
    }
    
    //A method that that returns the teacher's department.
    public String GetTDept ()
    {
    	//Returning their department.
    	return TDept;
    }    
}