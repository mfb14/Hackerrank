
package hackerrank;

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
	public static void main(String[] args) {
		
		int [] result = findTwoSum(new int[] {3, 1, 5, 7, 5, 9 }, 10);
		
		System.out.println(result[0]+","+result[1]);

	}

}
