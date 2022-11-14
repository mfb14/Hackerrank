
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 14, 2022 5:16:46 AM
 */
public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    int count =0;
    for (int i=0;i<ar.size();i++) {
		for(int j=i+1;j<ar.size();j++) {
			if((ar.get(i)+ar.get(j))%k==0)
				count++;
		}
	}
    return count;

    }
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,2,6,1,2));
		System.out.println(divisibleSumPairs(6, 3, list));

	}

}
