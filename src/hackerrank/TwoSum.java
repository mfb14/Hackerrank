
package hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 11, 2022 11:21:44 AM
 */
public class TwoSum {

	public static int[] findTwoSum(int list[],int target) {
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]+list[j]==target)
					return new int[] {i,j};
			}
		}
		
		throw new IllegalArgumentException();
		
	}
	
	public static int[] twoSum(int list[],int target) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i= 0;i<list.length;i++) {
			
			int temp = target-list[i];
			if(map.containsKey(temp))
				return new int[] {map.get(temp),i};
			
			map.put(list[i], i);
		}
		throw new IllegalArgumentException();
	}
	public static void main(String[] args) {
		
		int [] result = twoSum(new int[] {3, 1, 5, 7, 5, 9 }, 10);
		
		System.out.println(result[0]+","+result[1]);

	}

}
