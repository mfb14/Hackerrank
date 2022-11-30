
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @link https://www.hackerrank.com/challenges/picking-numbers
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 29, 2022 5:40:44 AM
 */
public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
    	
    	int firstIndex=0;
    	int secondIndex=1;
    	int maxLengthOfSubArray=0;
    	Collections.sort(a);
    	
    	while(secondIndex<a.size()) {
    		int left = a.get(firstIndex);
    		int right = a.get(secondIndex);
    		if(Math.abs(left-right)<=1) {
    			
    		
    			maxLengthOfSubArray=Math.max(maxLengthOfSubArray, secondIndex-firstIndex+1);
    			secondIndex++;
    			continue;
    		}
    		firstIndex++;
    		
    	}
    		return maxLengthOfSubArray; 
		}
	public static void main(String[] args) {
		
		pickingNumbers(new ArrayList<Integer>(Arrays.asList(4,6,5,3,3,1)));
	}

}
