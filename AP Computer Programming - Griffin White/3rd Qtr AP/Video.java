/**
 * @(#)Video.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/11
 */

//////////////////////////////////////////////////Complete//////////////////////////////

import java.io.*;
import java.util.*;

public class Video {
	
	//A set of private String variables to hold the info about the movies.
	private String Title   = "";
	private String Type    = "";
	private String Rating  = "";
	private String InStore = "";
	
	//The main constructor that takes in the values sent in from "VideoDriver".
    public Video(String Ti, String Ty, String Ra, String In) 
    {
    	//Assigning the sent over values to their respective private variables.
    	Title   = Ti;
    	Type    = Ty;
    	Rating  = Ra;
    	InStore = In;   	
    }
    
    //A method to return the movie title.
    public String getTitle()
    {
    	return Title;
    }
    
    //A method to return the movie genre.
    public String getType()
    {
    	return Type;
    }
    
    //A method to return the movie rating.
    public String getRating()
    {
    	return Rating;
    }
    
    //A method to return if the movie is in store.
    public String getInStore()
    {
    	return InStore;
    }
    
    
}