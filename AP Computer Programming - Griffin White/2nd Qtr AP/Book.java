/**
 * @(#)Book.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/10
 */

///////////////////////////////////In-Progress////////////////////////////////

//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class Book {
	
	private String Title    = "";
	private String Author   = "";
	private String FictOrNF = "";
	private double ReadLev  = 0;

    public Book(String T, String A, String F, double R) 
    {
    	Title    = T;
    	Author   = A;
    	FictOrNF = F;
    	ReadLev  = R;
    }
    
    public String getTitle()
    {
    	return Title;
    }
    
     public String getAuthor()
    {
    	return Author;
    }
    
     public String getFictOrNF()
    {
    	return FictOrNF;
    }
    
     public double getReadLev()
    {
    	return ReadLev;
    }
    
    
}