/**
 * @(#)LetterBox.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/10/19
 */


public class LetterBox 
{
	
	//A set of private variables that will hold the letter to be printed and how many times to print it.
	private String Letter;
    private int NumTimes;
	
	//The default constructor that takes in the values form "LetterBoxDriver".
    public LetterBox(String Letter1, int NumTimes1) 
    {
    	//Assiging the values sent over from "LetterBoxDriver" to the "Letter" and "NumTimes" variables.
    	Letter = Letter1;
    	NumTimes = NumTimes1;    	
    }
    
    //A method that will print out the letter box.
    public void PrintLetters ()
    {
    	//An outer for loop that will cycle once for each row in the box.
    	for (int I = 0; I < NumTimes; I++)
    	{
    		//An inner for loop that will cycle once for each column in the box.
    		for (int J = 0; J < NumTimes; J++)
    			//Printing out the letter.
    			System.out.print (Letter);
    		
    		//Moving to the next line.
    		System.out.println();
    	}
    	
    	//Putting a space between each data set.
    	System.out.println();  		
    }   
}