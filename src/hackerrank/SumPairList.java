
package hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * Find which element pairs sum is equal to given sum
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 26, 2022 2:35:37 PM
 */
public class SumPairList {

	public static void calculate(int sum, int[]arr) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++)
			hm.put(arr[i], i);
		for (int i = 0; i < arr.length; i++) {
			Integer key = sum-arr[i];
			Integer value = hm.get(key);
			
			if(hm.containsKey(key)&&i<value)
				System.out.println(i+"-"+value);
		}
	}
	public static void main(String[] args) {
		
		int arr [] = new int[] {1,2,3,5,9,8,6};
		calculate(11, arr);
		
	}

}
