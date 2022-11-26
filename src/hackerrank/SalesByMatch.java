
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * @link https://www.hackerrank.com/challenges/sock-merchant
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 26, 2022 1:35:20 PM
 */
public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
     int count = 0;
    HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(Integer x:ar){
            if(!hm.containsKey(x))
                hm.put(x,1);
            else{
                hm.put(x,hm.get(x)+1);
            }
        }
        for(Integer x:hm.values()) {
        	count+=x/2;
        }
    	  
     return count;

    }
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
		System.out.println(sockMerchant(9, list));
	}

}
