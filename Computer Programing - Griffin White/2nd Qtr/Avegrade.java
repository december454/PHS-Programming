/**
 * @(#)Avegrade.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/14
 */
//GOOD JOB
//GRADE = 100

//Importing everything that I might need.
import java.util.*;
import java.io.*;

public class Avegrade {

    public static void main (String [] args){
    	
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter the student's name and their input assigned to a String variable.
    	System.out.print ("Enter the student's name: ");
    		String Name = Input.nextLine();
    	//The prompt that asks the user to enter the student's 5 test grades and a double variable for each grade.	
    	System.out.print ("Enter the 5 test grades: ");
    		double A = Input.nextDouble();
    		double B = Input.nextDouble();
    		double C = Input.nextDouble();
    		double D = Input.nextDouble();
    		double E = Input.nextDouble();
    		//Variables for the overall average, test grade dropped, and letter grade defined and assigned initially outside of an if statement.
    		double Average = 0;
    		double Dropped = 0;
    		String Letter = "A";
    	
    	//The if statement that will drop grade "A" if it is the lowest or tied for lowest.		
    	if (A<=B && A<=C && A<=D && A<=E){
    		Average = (B+C+D+E)/4;
    		Dropped = A;}
    	//The else if statement that will drop grade "B" if it is the lowest or tied for lowest.
    	else if (B<=A && B<=C && B<=D && B<=E){
    		Average = (A+C+D+E)/4;
    		Dropped = B;}
    	//The else if statement that will drop grade "C" if it is the lowest or tied for lowest.
    	else if (C<=A && C<=B && C<=D && C<=E){
    		Average = (A+B+D+E)/4;
    		Dropped = C;}
    	//The else if statement that will drop grade "D" if it is the lowest or tied for lowest.
    	else if (D<=A && D<=B && D<=C && D<=E){
    		Average = (A+B+C+E)/4;
    		Dropped = D;}
    	//The else if statement that will drop grade "E" if it is the lowest or tied for lowest.
    	else if (E<=A && E<=B && E<=C && E<=D){
    		Average = (A+B+C+D)/4;		
    		Dropped = E;}
    	
    	//The series of if statements that will use the numerical average to determine the letter grade average.	
    	if (Average >= 90)
    		Letter = "A";
    	else if (Average >= 80 && Average <= 89)
    		Letter = "B";		
    	else if (Average >=70 && Average <= 79)
    		Letter = "C";
    	else 
    		Letter = "F";					
    	
    	//The first set of messages that will list off the title, class, student name, and teacher.	
    	System.out.println ("\n	Progress Report\n");
    	System.out.println ("Class:    Computer Science");
    	System.out.println ("Student:  " + Name);
    	System.out.println ("Teacher:  Mr. Lae Z. Programmer\n");
    	
    	//The second set of messages that will list off all of the grades, the grade dropped, the test average, and the letter grade. 
    	System.out.println ("Test Scores:    " + A + " " + B + " " + C + " " + D + " " + E);
    	System.out.println ("Test Dropped:   " + Dropped);
    	System.out.printf  ("Test Average:   %.1f", Average);
    	System.out.println ("\nFinal Grade:    " + Letter + "\n");
    	
    }
    
    
}