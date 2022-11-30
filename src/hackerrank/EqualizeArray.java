
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 30, 2022 5:33:13 AM
 */
public class EqualizeArray {

    public static int equalizeArray(List<Integer> arr) {
   
        Map<Integer, Integer> hm = new HashMap<>();
    	
        for(Integer x:arr) {
        	if(!hm.containsKey(x))
        		hm.put(x,1);
        	else {
				hm.replace(x, hm.get(x)+1);
			}
        }
        int count=0;
       for(Integer x:hm.values())
    	   if (x<2)
    		   count++;	   
      int a = Collections.max(hm.values());
      
      return arr.size()-a;
    
    }
	public static void main(String[] args) {
		
		List<Integer> ar = new ArrayList<>(Arrays.asList(1 ,2, 3, 1, 2, 3, 3, 3));
		System.out.println(equalizeArray(ar));

	}

}
