/**
 * @(#)tictactoe.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/9/7
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class tictactoe {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner for the entire data file.
    	Scanner DF = new Scanner (new File("tictactoe.txt"));
    	
    	//An int variable that reads in how many data sets will be in the data file.
    	int DSNum = DF.nextInt();
    	
    	//Moving down to the next line of the data file.
    	DF.nextLine();	
    	
    	//The main for loop that will cycle once for each data set.
    	for (int I = 0; I < DSNum; I++)	
    	{
    		//A two dimensional String array that will hold the values of the tic-tac-toe board.
    		String Board [][] = new String [3][3];
    		
    		//A string variable that reads in the raw values for the game board.
    		String Line = DF.nextLine();
    		
    		//An int variable that will be used as an additional counter in the next loop.
    		int Counter = 0;
    		
    		//A set of String arrays that will hold the value of two winning lines on the board.
    		String [] Win  = new String [3];
    		String [] Win1 = new String [3];
    		
    		//A String variable that will hold the results of the game, defaulting to cat's game.
    		String Results = "cat's game - no winner!";
    		
    		//A set of for loops that will fill in the "Board" array.
    		for (int J = 0; J < 3; J++)
    			for (int K = 0; K < 3; K++)
    			{
    				//Assiging the current value in the array.
    				Board [J][K] = Line.substring(Counter, Counter + 1);
    				
    				//Adding one to the counter variable.
    				Counter++;
    			}
    		
    		//A set of for loops that will print out the current game board.	
    		for (int Q = 0; Q < 3; Q++)	
    		{
    			for (int R = 0; R < 3; R++ )	
    				//Printing out the current value on the board.
    				System.out.print (Board [Q][R]);
    			
    			//Moving to the next line on the board.
    			System.out.println();		
    		}
   
   			//A for loop that will record a diagonal line from the board.
    		for (int L = 0; L < 3; L++)
    			//Assigning the current diagonal value.
    			Win [L] = Board [L][L];
    		
    		//An if statement that checks for diagonal victory.
    		if (Win [0].equals (Win [1]) && Win [0].equals (Win [2]))
    			//Setting the results to a diagonal victory.
    			Results = Win [0] + " wins diagonally!";
    		
    		//An additional counter variable for the next for loop.	
    		int N = 2;	
    			
    		//A for loop that will record the next diagonal line from the board.
    		for (int M = 0; M < 3; M++)
    		{
    			//Assiging the current diagonal value.
    			Win [M] = Board [N][M];	
    			//Decreasing the counter.
    			N--;
    		}
    		
    		//An if statement that checks for diagonal victory in this line.
    		if (Win [0].equals (Win [1]) && Win [0].equals (Win [2]))
    			//Setting the results to a diagonal victory.
    			Results = Win [0] + " wins diagonally!";
    			
    		//A for loop that will check for horizontal and vertical victory.	
    		for (int O = 0; O < 3; O++)	
    		{
    			for (int P = 0; P < 3; P++ )
    			{
    				//Assigning the current horizontal value.
    				Win  [P] = Board [O][P];
    				//Assigning the current vertical value.
    				Win1 [P] = Board [P][O];
    			}
 
 				//An if statement that checks for horizontal victory.   				
				if (Win [0].equals (Win [1]) && Win [0].equals (Win [2]))
				{
					//Setting the results to horizontal victory.
					Results = Win [0] + " wins horizontally!";	
					//Breaking out of the current loop.
					break;
				}
					
				//An if statement that checks for vertical victory.
				if (Win1 [0].equals (Win1 [1]) && Win1 [0].equals (Win1 [2]))
				{
					//Setting the results to vertical victory.
					Results = Win1 [0] + " wins vertically!";
					//Breaking out of the current loop.
					break;	
    			}
    		}
    		
    		//Printing out the results.
    		System.out.println (Results + "\n");
    	}
    }
}