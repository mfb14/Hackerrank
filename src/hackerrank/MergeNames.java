
package hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * Merge two different Strings without duplicate
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 7, 2022 8:40:33 PM
 */
public class MergeNames {


	    
public static String[] uniqueNames(String[] names1, String[] names2) {
           
        Set<String> s = new HashSet<>();
        for(int i=0;i<names1.length;i++){
          s.add(names1[i]);
          s.add(names2[i]);
        }
        String [] newStr = new String [s.size()];
        int j=0;
      	for(String x:s) {
    	  newStr[j++]=x;
      	}
      	return newStr;
      	
}    
public static void main(String[] args) {
	    String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
	    String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
	    System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	    }
	



}
