/**
 * The recursive methods for Lab 11. 
 * 
 * @author (logan mohseni) 
 * @version November 20, 2012
 */
import java.util.ArrayList;
public class Lab11
{
    /**
     * Converts a decimal number to a binary one using recursion.
     * Assume the decimal number is >= 1.
     * 
     * @param       number      the decimal number to convert
     * @return      a String representation of the binary number
     */
	
	private static ArrayList<Integer> logsArr = new ArrayList<Integer>();
	
    public static String convertToBinary(int number)
    {
    	return logsArr.toString();
    }
   	
    public static void recurse(int n)
    {
    	if (n == 0)
    		return;
    	else{
    		logsArr.add(0, (n % 2));
    		recurse(n/2);
    		
    	}
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
