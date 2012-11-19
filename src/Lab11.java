import java.util.ArrayList;
/**
 * The recursive methods for Lab 11. 
 * 
 * @author (logan mohseni) 
 * @version November 20, 2012
 */

public class Lab11
{
    /**
     * Converts a decimal number to a binary one using recursion.
     * Assume the decimal number is >= 1.
     * 
     * @param       number      the decimal number to convert
     * @return      a String representation of the binary number
     */
    
	//ArrayList<Integer> numbsArr = new ArrayList<Integer>();
    public static String convertToBinary(int number)
    {
    	ArrayList<Integer> numbsArr = new ArrayList<Integer>();
    	
    		
    	return numbsArr.toString();
    }
    
    private static int binDigits (int n){
    	if (n % 2 == 0)
    		return 1;
    	else
    		return 0;
    }
    
    private ArrayList<Integer> recurse(int n){
    	ArrayList<Integer> recursArr = new ArrayList<Integer>();
    	
    	return recursArr;
    	
    }
    
    /**
     * Find the largest item in an array of integers.  
     * Assume the array contains at least one item.
     * 
     * @param       numbers     an array of integers
     * @return      the largest number in the array of intgers
     */
    
    public static int largestArrayItem(int [] numbers)
    {
        return largestArrayItemAuxiliary(numbers, 0);
    }
    
    /**
     * The helper method for largestArrayItem.
     * 
     * @param       numbers     an array of integers
     * @param       index       the current index in the array to examine
     * @return      the largest number in the array of integers
     */
    
    private static int largestArrayItemAuxiliary(int [] numbers, int index)
    {
    	return 0;
    }
}
