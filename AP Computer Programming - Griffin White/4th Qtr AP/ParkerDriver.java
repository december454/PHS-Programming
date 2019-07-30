/**
 * @(#)ParkerDriver.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/10
 */

//////////////////////////////////////Complete//////////////////////////////////////
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class ParkerDriver {

    public static void main (String [] args) 
    {
    	//Creating all of the under graduate objects, sending over id, name, and hours.
    	UnderGradStudent UG0 = new UnderGradStudent ("123", "Hlavaty", 6);
    	UnderGradStudent UG1 = new UnderGradStudent ("125", "Turner", 4);
    	UnderGradStudent UG2 = new UnderGradStudent ("127", "Brisbois", 6);
    	UnderGradStudent UG3 = new UnderGradStudent ("129", "Hutchinson", 3);
    	
    	//Creating all of the graduate objects, sending over id, name, and hours.	
    	GradStudent G0 = new GradStudent ("124", "Popp", 3);
    	GradStudent G1 = new GradStudent ("126", "Page", 9);
    	GradStudent G2 = new GradStudent ("128", "Stancik", 4);
    	GradStudent G3 = new GradStudent ("130", "Crain", 12);
    	 
    	//Printing out a heading for the list using printf.   
    	System.out.printf("%-15.15s  %-15.15s %-15.15s%n", "ID Num", "Name", "Tuition");	
    	//Printing out each student's id num, name, and tuition.
    	UG0.Printer();
    	G0.Printer();
    	UG1.Printer();
    	G1.Printer();
    	UG2.Printer();
    	G2.Printer();
    	UG3.Printer();
    	G3.Printer();
    	
    	//Making the changes to the students' info, updating names and hours.
    	G0.setLastName ("Bures");
    	G0.setTuition (6);    	
    	UG0.setTuition (12);    	
    	UG1.setTuition (3);
    	G2.setLastName ("Muschalek");
    	G1.setTuition (6);
    	UG3.setTuition (6);
    	G3.setLastName ("Simons");
    	G3.setTuition (6);
    	
    	//Printing out all of the updated info.
    	System.out.printf("%n%-15.15s  %-15.15s %-15.15s%n", "ID Num", "Name", "Tuition");	
    	//Printing out each student's id num, name, and tuition.
    	UG0.Printer();
    	G0.Printer();
    	UG1.Printer();
    	G1.Printer();
    	UG2.Printer();
    	G2.Printer();
    	UG3.Printer();
    	G3.Printer();    	    	    	
    }        
}