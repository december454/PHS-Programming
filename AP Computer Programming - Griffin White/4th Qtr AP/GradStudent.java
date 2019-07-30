/**
 * @(#)GradStudent.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/10
 */


public class GradStudent extends Student1 {
	
	//The main constuctor that will take in a student's id num, last name, and course hours.
    public GradStudent(String i, String l, double h) 
    {
    	//Sending the id number and name over to the super class's constructor.
    	super (i,l);    	
    	//Calling to the "setTuition" method with the number of course hours.
    	setTuition (h);
    }
    
    //A method that will set the tuition for a graduate student.
    public void setTuition (double h)
    {
    	//Calculating the "tuition".
    	tuition = h*1200;
    }
}