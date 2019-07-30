/**
 * @(#)Video.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/12/11
 */

import java.io.*;
import java.util.*;

public class Video {
	
	private String Title   = "";
	private String Type    = "";
	private String Rating  = "";
	private String InStore = "";

    public Video(String Ti, String Ty, String Ra, String In) 
    {
    	Title   = Ti;
    	Type    = Ty;
    	Rating  = Ra;
    	InStore = In;   	
    }
    
    public String getTitle()
    {
    	return Title;
    }
    
    public String getType()
    {
    	return Type;
    }
    
    public String getRating()
    {
    	return Rating;
    }
    
    public String getInStore()
    {
    	return InStore;
    }
    
    
}