
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @link https://www.hackerrank.com/challenges/minimum-distances
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 28, 2022 5:39:22 AM
 */
public class MinimumDistances {


    public static int minimumDistances(List<Integer> a) {
    
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a.size();i++){
                if(!hashmap.containsKey(a.get(i)))
                	hashmap.put(a.get(i), i);
                else {
                	list.add(i-hashmap.get(a.get(i)));
                	hashmap.put(a.get(i), hashmap.get(a.get(i))+1);
					
				}
        }
       return list.stream().mapToInt(z->z).min().orElse(-1);
    }

	public static void main(String[] args) {
		System.out.println(minimumDistances(new ArrayList<Integer>(Arrays.asList(7,1, 3, 4, 1, 7 ))));

	}

}
