
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 11, 2022 6:01:38 AM
 */
public class BreakingBestAndWorstRecords {
	/***/
    public static List<Integer> breakingRecords(List<Integer> scores) {
    
    	int highest = scores.get(0);
    	int lowest = scores.get(0);
    	int highestCount = 0;
    	int lowestCount = 0;
    	List<Integer> result = new ArrayList<Integer>();
    	for(int i=1;i<scores.size();i++) {
    		if (highest<scores.get(i)) {
				highest=scores.get(i);
    			highestCount++;
				
			}
    		if (lowest>scores.get(i)) {
				lowest=scores.get(i);
    			lowestCount++;
			}
    	}
    	result.add(highestCount);
    	result.add(lowestCount);
    	
    	return result;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> sc = new ArrayList<Integer>(Arrays.asList(3 ,4, 21, 36, 10, 28, 35, 5, 24, 42));
		List<Integer> sc = new ArrayList<Integer>(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));
		
		System.out.println(breakingRecords(sc));
	}

}
