
package hackerrank;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 11, 2022 9:38:29 PM
 */

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int start = 0;
        int end = sortedArray.length-1;
        int mid = 0;
        int count = 0;
        while(start<=end) {
        	mid=(start+end)/2;
        	if(sortedArray[mid]<lessThan)
        		start=sortedArray[mid]+1;
        	if(sortedArray[mid]>lessThan) {
        		count = mid-1;
        		end=sortedArray[mid]-1;
        	}
        	
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}
