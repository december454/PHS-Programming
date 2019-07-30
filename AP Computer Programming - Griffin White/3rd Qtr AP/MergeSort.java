/**
 * @(#)MergeSort.java
 * Griffin White
 *
 * @author 
 * @version 1.00 2019/2/1
 */

/////////////////////////////////////////Complete///////////////////////////////////////

public class MergeSort {

	//The main constructor that takes in the array being sent over.
    public static int [] mergeSort (int [] list)
    {
    	//Sending back the list from the start if it only has one value.
    	if (list.length <= 1)
    		//Returning the list.
    		return list;
    		
    	//Splitting the array in half.
    	//Creating the first half of the array.
    	int [] first  = new int [list.length/2];
    	//Creating the second half of the array.
    	int [] second = new int [list.length - first.length];
    	System.arraycopy (list, 0, first, 0, first.length);
    	System.arraycopy (list, first.length, second, 0, second.length);
    	
    	//Sorting each half of the list.
    	mergeSort (first);
    	mergeSort (second);
    	
    	//Merging the halves together, overwritting the original array.
    	merge (first, second, list);
    	//Returning the sorted list.
    	return list;
    }
    
    private static void merge (int[] first, int [] second, int [] result)
    {
    	//Merging both halves into the result array.
    	//Next element to consider in the second array.
    	int iFirst = 0;
    	//Next element to consider in the first array.
    	int iSecond = 0;
    	
    	//Next open position in the result.
    	int j = 0;
    	//As long as niether iFirst nor iSecond is past the end, move the smaller element into the result.
    	while (iFirst < first.length && iSecond < second.length)
    	{
    		if (first[iFirst] < second[iSecond]){
    			result [j] = first [iFirst];
    			iFirst++;
    		}
    		else{
    			result [j] = second [iSecond];
    			iSecond++;
    		}
    		
    		j++;
    	}
    	//Copying what is left.
    	System.arraycopy(first,iFirst,result,j,first.length - iFirst);
    	System.arraycopy(second,iSecond,result,j,second.length - iSecond);
    }
    
    
}