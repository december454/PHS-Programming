/**
 * @(#)Mirror.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/21
 */
//TEST GRADE = 100
import java.io.*;
import java.util.*;

public class Mirror {

    public static void main (String [] args) throws IOException 
    { 
    	Scanner DF = new Scanner (new File ("mirror.dat."));
    	
    	while (DF.hasNext())
    	{
    		String Title = DF.next();
    		
    		if (Title.equals("END"))
    			break;
    			
    		int C = DF.nextInt();
    		int R = DF.nextInt();
    		
    		String InvRev = DF.next();
    		
    		String [][] Original = new String [R][C];
    		
    		for (int I = 0; I < R; I++)
    		{
    			String [] Line = DF.next().split("");
    
    			for (int J = 0; J < C; J++)
    				Original [I][J] = Line [J];
    		}
    		
    		System.out.println (Title);
    		
    		if (InvRev.equals ("R"))
    		{
    			for (int K = 0; K < R; K++)
    			{
    				for (int L = C - 1; L >= 0; L--)
    					System.out.print (Original [K][L]);
    					
    				System.out.println();
    			}
    			
    		}
    		
    		if (InvRev.equals ("I"))
    		{
    			for (int M = R - 1; M >= 0; M--)
    			{
    				for (int N = 0; N < C; N++)
    					System.out.print (Original [M][N]);
    					
    				System.out.println();
    			}

    		}
    		
    		if (InvRev.equals ("IR"))
    		{
    			for (int O = R - 1; O >= 0; O--)
    			{
    				for (int P = C - 1; P >= 0; P--)
    					System.out.print (Original [O][P]);
    					
    				System.out.println();
    			}

    		}
    		
    		System.out.println();			
    	}
    }
}