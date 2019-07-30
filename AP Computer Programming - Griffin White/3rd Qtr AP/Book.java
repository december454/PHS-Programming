/**
 * @(#)Book.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/10
 */

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Book {
	
	//A set of private variables that will hold each piece of info about the book.
	private String Title    = "";
	private String Author   = "";
	private String FictOrNF = "";
	private double ReadLev  = 0;
	
	//The main constructor that takes in all the book info sent over from the driver.
    public Book(String T, String A, String F, double R) 
    {
    	//Assinging all of the sent over values to the set of private variables.
    	Title    = T;
    	Author   = A;
    	FictOrNF = F;
    	ReadLev  = R;
    }
    
    //A method that will return the title of the book.
    public String getTitle()
    {
    	//Returning the title.
    	return Title;
    }   
    	
    //A method that will return the author of the book.	
    public String getAuthor()
    {
    	//Returning the author.
    	return Author;
    }
    
    //A method that will return whether the book is fiction or nonfiction.
     public String getFictOrNF()
    {
    	//Returning if it was fiction or non-fiction.
    	return FictOrNF;
    }    
}