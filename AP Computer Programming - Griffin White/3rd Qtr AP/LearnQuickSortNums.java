/**
 * @(#)LearnQuickSortNums.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/1/25
 */
//GRADE = 100
//Importing everything that I may need.
import java.io.*;
import java.util.*;

public class LearnQuickSortNums {

    public static void main (String [] args) throws IOException 
    {
    	//A set of duplicate Scanner objects, each using the data file.
    	Scanner DF = new Scanner (new File ("quicksort.txt"));
    	Scanner DFDuplicate = new Scanner (new File ("quicksort.txt"));

		//A while loop that will cycle until reaching the end of the data file.
    	while (DF.hasNext())
    	{
    		//A Scanner which takes in a line from the data file.
    		Scanner DFTemp = new Scanner (DF.nextLine());
    		
    		//An int variable that will take in a data set from the data file.
    		int ArraySize = 0;
    		
    		//A while loop that will cycle once for each value in the current data set.
    		while (DFTemp.hasNextInt())
    		{
    			//Adding one to the length.
    			ArraySize++;
    			//Moving to the next value.
    			DFTemp.nextInt();
    		}
    		
    		//Creating an int array to take in all the values from the data set.
    		int [] NumList = new int [ArraySize];
    		
    		//A for loop that will fill in the array.
    		for (int I = 0; I < ArraySize; I ++)
    			//Assigning the current value to the array.
    			NumList [I] = DFDuplicate.nextInt();
    		
    		//Printing out the original list.
    		System.out.println ("\nOriginal List:");
    		//Using "Arrays.toString" to print out the list.
    		System.out.println (Arrays.toString (NumList));
    		
    		//Calling to the "QuickSort" method and sorting the list of numbers.
    		NumList = QuickSort (NumList, 0, ArraySize - 1);
    		
    		//Printing out the sorted list.
    		System.out.println ("\nSorted List:");
    		//Using "Arrays.toString" to print out the list.
    		System.out.println (Arrays.toString (NumList));
    	}
    }
    
    //A method which will perform a quick sort on the list.
    public static int [] QuickSort (int [] Arr, int Low, int High)
    {
		//An if statement for when the array is empty or has a length of 0.
    	if (Arr == null || Arr.length == 0)
    		//Returnign null.
    		return null;
    	//An if statement for when the "Low" value is greater than the "High" value.
    	if (Low >= High)	
    		//Returning null.
    		return null;
    	
    	//Picking the pivot.
    	int Middle = Low + (High - Low) / 2;
    	int Pivot  = Arr [Middle];
    	//Make left < pivot and right > privot.
    	int I = Low, J = High;
    	
    	//A while loop that will cycle until "I" is greater than "J".
    	while (I <= J)
    	{
    		//A while loop that will cycle until the current value is greater than the pivot.
    		while (Arr [I] < Pivot)
    			//Moving to the next value.
    			I++;
    		
    		//A while loop that will cycle until "J" is less than the pivot.
    		while (Arr [J] > Pivot)
    			//Moving back a value.
    			J--;
    		
    		//An if statement for when "I" is less than or equal to "J".
    		if (I <= J)	
    		{
    			//Assigning the current value to a temporary variable.
    			int Temp = Arr [I];
    			//Swaping the values in location "I" and "J".
    			Arr [I] = Arr [J];
    			Arr [J] = Temp;
    			//Moving "I" and "J" to their next values.
    			I++;
    			J--;
    		}
    		
    	}
    	//Recursively sort two sub parts.
    	if (Low < J)
    		//Using the "QuickSort" method on the left sub part.
    		QuickSort (Arr, Low, J);
    		
    	if (High > I)
    		//Using the "QuickSort" method on the left sub part.	
    		QuickSort (Arr, I, High);
    	
    	//Returning the sorted array.		
    	return Arr;
    }   

}