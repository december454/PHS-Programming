/**
 * @(#)Harmony.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/4/25
 */


public class Harmony 
{
	//A method which will see if the series of numbers is valid.
	public void digitsTester (String line)
	{
		//Splitting up the sent over line into a String array.
		String [] splitLine = line.split("");
		
		//An int array that all of the digits will be transferred into using the "lineBreak" method.
		int    [] digitLine = lineBreak (splitLine);
		
		//A set of int variables that will hold all of the values for checking the digits.
		int oddSum         = 0;
		int evenSum        = 0;
		int highDigitCount = 0;
		int checkSum       = 0;	
		int checkDigit     = 0;		
		
		//A for loop that will calculate the sum of all the odd digits.
		for (int i = 0; i < splitLine.length -1; i = i+2)
			//Adding the current digit to the total.
			oddSum += digitLine [i];
		
		//A for loop that will calculate the sum of all the even digits.
		for (int i = 1; i < splitLine.length -1; i = i+2)
			//Adding the current digit to the total.
			evenSum += digitLine [i];
		
		//A for loop that will tally how many of the odd digits are greater than four.	
		for (int i = 0; i < splitLine.length -1; i = i+2)
			//An if statement for when the value is greater than four.
			if (digitLine [i] > 4)
				//Adding to the tally.
				highDigitCount++;	
		
		//Calculating the "checkSum" using the "findCheckSum" method.
		checkSum = findCheckSum (oddSum, evenSum, highDigitCount); 	
		
		//Calcualting the "checkDigit" using the value of "checkSum".
		checkDigit = 10 - (checkSum % 10);			
		
		//Calling to the "validCheck" method to see if the number is valid and recoring the results.
		String results = validCheck (checkDigit, digitLine [digitLine.length -1]);
		
		//Calling tio the "printer" method and printing out the results.
		printer (results);				
	}
	
	//A method which will take all of the digits in the line and parse them to an int array.
	public int [] lineBreak (String [] line)
	{
		//An int array that will hold all of the digits.
		int [] temp = new int [line.length];
		
		//A for loop that will parse the line into the "temp" array.
		for (int i = 0; i < line.length; i++)		
			//Parsing the current digit into the int array.
			temp [i] = Integer.parseInt (line[i]);
		
		//Returning the int array.
		return temp;			
	}
	
	//A method which will calculate the checksum using the predetermined values.
	public int findCheckSum (int oddSum1, int evenSum1, int highDigitCount1)
	{
		//Returing the checksum.
		return oddSum1 * 3 + evenSum1 + highDigitCount1;
	}
	
	//A method which will use the calculated check digit and the actual check digit to see if the number is valid.
	public String validCheck (int calcCD, int actualCD)
	{
		//An if statement for when the "checkDigit" is incorrect.
		if (calcCD != actualCD)
			//Returning that it is invalid along with the incorrect "checkDigit".
			return "INVALID " + calcCD;	
		
		//Returning that the number was valid.
		return "VALID" ;	
	}
	
	//A method which will print out if the number was valid or not.
	public void printer (String temp)
	{
		//Printing the results of the check.
		System.out.println (temp);
	}		
}