
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.w3c.dom.css.Counter;

/**
 * @link https://www.hackerrank.com/challenges/the-birthday-bar
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 13, 2022 5:52:05 AM
 */
public class SubArrayDivision {

    /**
     *  @param  INTEGER_ARRAY s the numbers on each of the squares of chocolate
     *  @param  INTEGER d birthday
     *  @param  INTEGER m birh month	
     */
    public static int birthday(List<Integer> s, int d, int m) {
    
    	if(s.size()==1&&d*m==s.get(0)) {
    		return 1;
    	}
		int counter=0;
		
		for(int i=0;i<=s.size()-m;i++) {
			int sum =0;
			
			for(int j=i;j<i+m;j++) {
				sum+=s.get(j);
			}
			if(sum==d) {
				counter++;
			}
			
		}
		return counter;
    }
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,1,3,2));
		System.out.println(birthday(list, 3, 2));
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1));
		System.out.println(birthday(list1, 3, 2));

		List<Integer> listOne = new ArrayList<Integer>(Arrays.asList(4));
		System.out.println(birthday(listOne, 4, 1));
		
		List<Integer> lists = new ArrayList<Integer>(Arrays.asList(3,5,4,1,2,5,3,4,3,2,1,1,2,4,2,3,4,5,3,1,2,5,4,5,4,1,1,5,3,1,4,5,2,3,2,5,2,5,2,2,1,5,3,2,5,1,2,4,3,1,5,1,3,3,5));
		System.out.println(birthday(lists, 18, 6));
		
		
		
	}

}
