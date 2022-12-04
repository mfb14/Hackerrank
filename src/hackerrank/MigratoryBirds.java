
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 4, 2022 7:26:46 PM
 */
public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        
        if(arr.size()==1)
            return arr.get(0);
            
        Map<Integer,Integer> hm = new HashMap<>();
        
        for(Integer x:arr){
            if(!hm.containsKey(x))
                hm.put(x,1);
            else{
                hm.replace(x,hm.get(x)+1);
            }
        }
        
        Map.Entry<Integer,Integer> max=null;
        for(Map.Entry<Integer, Integer> nums:hm.entrySet())
        	if(max==null||nums.getValue().compareTo(max.getValue())>0)
        		max=nums;
      
        return max.getKey();
      
      
    
    }
	public static void main(String[] args) {
		
		System.out.println(migratoryBirds(new ArrayList<>(Arrays.asList(1 ,2, 3, 4, 5, 4, 3, 2, 1, 3, 45,5,5,5))));

	}

}
