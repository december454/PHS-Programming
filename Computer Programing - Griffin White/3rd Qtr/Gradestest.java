/**
 * @(#)Gradestest.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/28
 */
//TEST GRADE = 100
import java.io.*;
import java.util.*;

public class Gradestest {

    public static void main (String [] args) throws IOException
    {
    	Scanner DF = new Scanner (new File ("grades.dat"));
    	
    	int DSNum = DF.nextInt();
    	
    	for (int I = 0; I < DSNum; I++)
    	{
    		int PaperNum = DF.nextInt();
    		
    		String PaperName = DF.next();
    		
    		int ANum = 0;
    		int BNum = 0;
    		int CNum = 0;
    		int DNum = 0;
    		int FNum = 0;
    		
    		for (int J = 0; J < PaperNum; J++)
    		{
    			String Student = DF.next();
    			
    			int Grade = DF.nextInt();
    			
    			if (Grade >= 90 && Grade <= 100)
    				ANum++;
    			else if (Grade >= 80 && Grade < 90)
    				BNum++;
    			else if (Grade >= 75 && Grade < 80)		
    				CNum++;
    			else if (Grade >= 70 && Grade < 75)
    				DNum++;
    			else if (Grade < 70)	
    				FNum++;
    		}

    		System.out.println (PaperName + "\nA " + ANum + "\nB " + BNum + "\nC " + CNum + "\nD " + DNum + "\nF " + FNum);	
    	}
    } 
}