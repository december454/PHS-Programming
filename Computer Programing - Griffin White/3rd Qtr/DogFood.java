/**
 * @(#)DogFood.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2018/2/21
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class DogFood {

    public static void main (String [] args) throws IOException 
    {
    	//Instantiating a Scanner input.
    	Scanner DataFile = new Scanner (new File ("dogfood.txt"));
    	
    	//The outer loop that will keep cycling until the data file runs out of lines. 
    	while (DataFile.hasNextLine())
    	{
    		//Creating a double variable for the total amount dog food needed.
    		double Total = 0;
    		
    		//The inner loop that will run once for each of the six values in the data set.	
    		for (int I = 0; I < 6; I++)
    		{
    			//Reading in the dog's weight and assigning that value to an int variable.
    			int Weight  = DataFile.nextInt();
    			//Creating a variable for the amount of food needed during each 8 day period.
    			double Food = 0;
    			
    			//The if statements for how much food the dog will need each day, given its weight.
    			//The if statement for .5 cups of food.
    			if (Weight >= 2 && Weight <= 4)
    				Food = .5;
    			//The else if statement for 1 cup of food.	
    			else if (Weight >= 5 && Weight <= 7)
    				Food = 1;
    			//The else if statement for 1.5 cups of food.	
    			else if (Weight >= 8 && Weight <= 9)		
    				Food = 1.5;
    			//The else if statement for 2 cups of food.	
    			else if (Weight >= 10 && Weight <= 19)	
    				Food = 2;
    			//The else if statement for 3.5 cups of food.	
    			else if (Weight >= 20 && Weight <= 39)	
    				Food = 3.5;
    			//The else if statement for 4.5 cups of food.		
    			else if (Weight >= 40 && Weight <= 59)	
    				Food = 4.5;
    			//The else if statement for 6 cups of food.	
    			else if (Weight >= 60 && Weight <= 79)	
    				Food = 6;
    			//The else if statement for 7.5 cups of food.	
    			else if (Weight >= 80)	
    				Food = 7.5;
    			
    			//Figuring out how much food will be needed for that week and adding it to the total.
    			Total += (7 * Food);	
    		}
    		
    		//Calculating how many bags of dog food will be needed, using "Math.ceil" since you are not allowed to buy any less than one bag.
    		int Bags = (int)(Math.ceil(Total/60));
    		
    		//Printing out how many bags will be needed. 
    		System.out.println (Bags + " - 10 POUND BAGS\n");
    	
    	}
    	
    }
    
    
}