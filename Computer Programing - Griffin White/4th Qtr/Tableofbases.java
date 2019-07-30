/**
 * @(#)Tableofbases.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/6
 */
 //GRADE = 100
 //Importing everything that I may need.
 import java.io.*;
 import java.util.*;


public class Tableofbases {

    public static void main (String [] args)
    {
    	//Printing out the heading of the chart.
    	System.out.println ("Decimal		Binary		Octal		Hex		Character");
    		
    	//The for loop that will cycle once for every number between 65 and 90.	
    	for (int Num = 65; Num <= 90; Num++)
    	{
    		//Printing out the decimal value of the number.
    		System.out.print (Num + "		");
    		//Printing out the Binary value of the number.
    		System.out.print (Integer.toString(Num,2) + "		");
    		//Printing out the Octal value of the number.
    		System.out.print (Integer.toString(Num,8) + "		");
    		//Printing out the Hexidecimal value of the number.
    		System.out.print (Integer.toString(Num,16) + "		");
    		//Printing out the ASCII value of the number.
    		System.out.print ((char)Num);
    		//Moving to the next line.
    		System.out.println();
    	}	
    }
    
    
}