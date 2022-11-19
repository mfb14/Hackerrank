
package hackerrank;

import java.util.Iterator;

/**
 * Maximum sum of sub array
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 19, 2022 8:51:18 PM
 */
public class MaxSumArray {

	public static Integer maxSumSubArray(Integer [] arr) {
		int sum = 0;
		int currentSum = 0;
		
		for(int i=0;i<arr.length;i++) {
			currentSum+=arr[i];
			if(sum<currentSum)
				sum=currentSum;
			if(currentSum<0)
				currentSum=0;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		Integer [] ar = new Integer[]{-2,1,-3,4,-1,2,6,-5,4,12,5,-2};
		
		System.out.println(maxSumSubArray(ar));

	}

}
