/**
 * @(#)LearnAndOrNot.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/14
 */

import java.util.*;
import java.util.*;

public class LearnAndOrNot {

    public static void main (String [] args){
    	
    	//Instantiating a Scanner object.
    	Scanner Input = new Scanner (System.in);
    	
    	//enter a grade
    	System.out.println("Enter your test grade");
    	int grade = Input.nextInt();
    	
    	//if grade is 100
    	if (grade == 100){
    		System.out.println ("You aced it!! Way to go!!");}
    		
    	//if the grade is 90-99	
    	else if (grade >= 90 && grade <=99){
    		System.out.println("A! keep it up!");}
    		
    	//if the grade is 80-89
    	else if (grade >= 80 && grade <=89){
    		System.out.println ("B Not bad!");}
    		
    	//if the grade is 70-79
    	else if (grade >= 70 && grade <= 79){
    		System.out.println("C! You need to study more!");}
    		
    	//if the grade is less than 70
    	else{
    		System.out.println("F! you need to go to tutorials");}		
    			
    }
    
    
}