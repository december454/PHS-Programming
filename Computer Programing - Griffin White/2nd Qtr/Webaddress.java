/**
 * @(#)Webaddress.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2017/11/13
 */
//GRADE = 100
//Importing everything that I might need.
import java.util.*;
import java.io.*;

public class Webaddress {

    public static void main (String [] args) {
    	
    	//Instantiating a Scanner input.
    	Scanner Input = new Scanner (System.in);
    	
    	//The prompt that asks the user to enter their address and their input assigned to a String variable.
    	System.out.println ("Please enter a web address.");
    		String Address = Input.nextLine();
    		
    	//Taking off the prefix and suffix of the address to leave only the domain and assigning the domain to a String variable.	
    	String Domain = Address.substring(4,(Address.length())-4);
    	//Finding the the last three characters, the suffix, and assigning them to a String variable.
    	String Suffix = Address.substring((Address.length())-3);
    	
    	//Printing the domain message.
    	System.out.println ("\nDomain: " + Domain);
    	//Printing the first part of the website type message.
    	System.out.print   ("Website Type: ");
    	
    	//The if statement that will print the "Educational" response if the suffix is "edu".
    	if (Suffix.equals ("edu")){
    		System.out.println ("Educational\n");}
    		
    	//The else if statement thet will print the "Community" response if the suffix is "com".
    	else if (Suffix.equals ("com")){
    		System.out.println ("Community\n");}
    	
    	//The else if statement that will print the "Government" response if the suffix is "gov".	
    	else if (Suffix.equals ("gov")){
    		System.out.println ("Government\n");}
    		
    	//The else if statement that will print the "Organization" response if the suuffix is "org".
    	else if (Suffix.equals ("org")){
    		System.out.println ("Organization\n");}
 			
 		//The else statement that will print the "other" response if the suffix none of the above four.
 		else 
 			System.out.println ("Other\n");	   		
    		  	 	
   	}	
    	
    	
    		
    }
    
    
