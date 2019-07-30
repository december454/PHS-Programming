/**
 * @(#)Students.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/3
 */


public class Students {

	private String fullname;
   	private int studentid;
   	private int studentgrade;
   	
    public Students(String n, int i, int g)
    {
    	fullname = n;
    	studentid = i;
    	studentgrade = g;
    	
    }
    
    //method to return student names    	
    public String getName()
    {
    	return fullname;
    }
    
    //method to return the student id
    public int getid()
    {
    	return studentid;
    }
    
    //method to return the student grade level
    public int getGradeLevel()
    {
    	return studentgrade;
    }
    
}