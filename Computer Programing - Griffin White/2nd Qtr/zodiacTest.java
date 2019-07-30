/**
 * @(#)zodiacTest.java
 * Griffin white
 *
 * @author 
 * @version 1.00 2017/11/29
 */
//TEST GRADE = 100
import java.util.*;
import java.io.*;

public class zodiacTest {

    public static void main (String [] args) 
    {
    	Scanner Input = new Scanner (System.in);
    	
    	System.out.println ("Enter the month (in numbers) and day you were born.");
    		int Month = Input.nextInt();
    		int Day   = Input.nextInt();
    		String Zodiac = " ";
    	
    	if ((Month == 12 && Day >= 22)||(Month == 1 && Day <= 19))
    		Zodiac = "Capricorn";
    	else if ((Month == 1 && Day >= 20)||(Month == 2 && Day <= 18))
    		Zodiac = "Aquarius";
    	else if ((Month == 2 && Day >= 19)||(Month == 3 && Day <= 19))
    		Zodiac = "Pisces";
    	else if ((Month == 3 && Day >= 20)||(Month == 4 && Day <= 19))
    		Zodiac = "Aries";
    	else if ((Month == 4 && Day >= 20)||(Month == 5 && Day <= 20))
    		Zodiac = "Taurus";
    	else if ((Month == 5 && Day >= 21)||(Month == 6 && Day <= 21))
    		Zodiac = "Gemini";
    	else if ((Month == 6 && Day >= 22)||(Month == 7 && Day <= 22))
    		Zodiac = "Cancer";					
    	else if ((Month == 7 && Day >= 23)||(Month == 8 && Day <= 22))
    		Zodiac = "Leo";			
    	else if ((Month == 8 && Day >= 23)||(Month == 9 && Day <= 22))
    		Zodiac = "Virgo";
    	else if ((Month == 9 && Day >= 23)||(Month == 10 && Day <= 22))
    		Zodiac = "Libra";
    	else if ((Month == 10 && Day >= 23)||(Month == 11 && Day <= 21))
    		Zodiac = "Scorpio";	
    	else if ((Month == 11 && Day >= 22)||(Month == 12 && Day <= 21))
    		Zodiac = "Sagittarius";	
    	else
    		Zodiac = "ERROR";
    		
    	System.out.println ("You are a(n) " + Zodiac + ".\n");
    		
    	
    }
    
    
}