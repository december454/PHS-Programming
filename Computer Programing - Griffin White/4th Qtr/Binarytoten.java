/**
 * @(#)Binarytoten.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/9
 */
//GRADE = 100
//Importing all that I may need.
import java.io.*;
import java.util.*;

public class Binarytoten {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner object for the entire data file.
    	Scanner DF = new Scanner (new File ("binarytoten.dat"));
    	
    	//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//A String variable that reads in the binary number from the data file.
    		String BinaryNum =  DF.next();
   
   			//An int varible that holds the decimal value of the previous binary number.
    		int DecimalNum = Integer.parseInt(BinaryNum,2);
    		
    		//Printing out the binary number and its decimal equivelent.
    		System.out.println (BinaryNum + " = " + DecimalNum + "\n");
    	}
    }
    
    
}