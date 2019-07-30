/**
 * @(#)Driverslicense.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/4/23
 */
//GRADE = 100
//Importing everything that I could need.
import java.io.*;
import java.util.*;

public class Driverslicense {

    public static void main (String [] args)
    {
    	//A String variable that will record the user's response for whether or not they want to run the program again.
    	String RunAgain = "";
    	
    	//A do while loop that encompasses the entirety of the program and lets it be run again.
    	do
    	{
    		//An array that holds the correct answers to the test.
	    	String [] AnswerKey = "BDAACABACDBCDADCCBDA".split("");
	    	//An array that will hold the user's responses to the test.
	    	String [] Responses  = new String [20];
	    	
	    	//A String variable that will hold the values of which questions the user got wrong.
	    	String IncorrectAnswers = "";
	    	//A String variable that will hold the results of the user, whether they passed or failed.
	    	String Result = "Pass";
	    	
	    	//Instantiating a Scanner input.
	    	Scanner Input = new Scanner (System.in);
	    	
	    	//An int variable that will keep track of how many answers the user got correct.
	    	int Correct = 0;
	    	//An int variable that will keep track of how many answers the user got incorrect.
	    	int Incorrect = 0;
	    	
	    	//An int variable that will keep track of whether or not the user entered an invalid answer.
	    	int TrueFalse;
	    	
	    	//The main for loop that will cycle once for every question of the test.
	    	for (int I = 0; I < 20; I++)
	    	{
	    		//Asking the user to enter their letter answer for the current question.
	    		System.out.println ("Please enter your answer to question " + (I + 1));
	    		
	    		//A do while loop that will keep asking the user to enter an answer if their response is invalid.
	    		do
	    		{
				//A String variable that will read in the user's current answer choice.
	    		String Answer = Input.next();
	    		
	    		//An if statement that checks to see if their answer is valid.
	    		if (Answer.equalsIgnoreCase ("A") || Answer.equalsIgnoreCase ("B") || Answer.equalsIgnoreCase ("C") || Answer.equalsIgnoreCase ("D"))
	    		{
	    			//Assigning the user's input to the array "Responses".
	    			Responses [I] = Answer;
	    			//Making sure the user's reponse is classified as valid.
	    			TrueFalse = 1;
	    		}	
	    			
	    		//An else statement for if the user enters an invalid answer.	
	    		else 
	    		{
	    			//Telling the user to enter a valid answer.
	    			System.out.println ("Invalid answer. Please enter \"A\", \"B\", \"C\", or \"D\".");
	    			//Marking their current answer as invalid.
	    			TrueFalse = 0;	
	    		}
	    		}
	    		//Letting the loop cycle again if the user needs to enter another answer.
	    		while (TrueFalse == 0);
	    	}
	    	
	    	//A for loop that will grade the user's test.
	    	for (int J = 0; J< 20; J++)
	    	{
	    		//A String variable that will read in the current answer choice from the array "Responses".
	    		String CurrentResponse = Responses [J];
	    		//A string variable that will read in the current correct answer from the array "AnswerKey".
	    		String CurrentCorrect  = AnswerKey [J];
	    		
	    		//An if statement that will check to see if the user's answer was correct.
	    		if (CurrentResponse.equalsIgnoreCase(CurrentCorrect))
	    			//Adding one to the total number of correct answers.
	    			Correct++;
	    		
	    		//An else statement for when the user chose the incorrect answer.	
	    		else
	    		{
	    			//Adding one to the total number of incorrect answers.
	    			Incorrect++;
	    			//Assing the number of the question that they missed to a String variable.
	    			IncorrectAnswers += (J + 1) + " ";
	    		}		
	    	}
	    	
	    	//An if statement that will record that the user failed the test if they got less than 15 questions correct.
	    	if (Correct < 15)
	    		//Assigning the results to a String variable.
	    		Result = "Fail";
	    	
	    	//Printing out if the user passed the test, how many questions they got correct, and how many they got incorrect.
	    	System.out.println ("\nTest Results: " + Result + "\n\nNumber Correct:   " + Correct + "\nNumber Incorrect: " + Incorrect);
	    	
	    	//An if statement that will print out what questions the user missed if they got any wrong.
	    	if (Incorrect > 0)
	    		//Prining out what questions were wrong.
	    		System.out.println ("\nMissed Questions: " + IncorrectAnswers);
	    	
	    	//Asking the user if they would like to take the test again.	
	    	System.out.println ("\nWould you like to take the test again? (Y/N)");	
	    		//Assigning their response to a String variable.
	    		RunAgain = Input.next();
    	}
    	//Running the program again if the user desired.
    	while (RunAgain.equalsIgnoreCase ("Y"));
    }
    
    
}