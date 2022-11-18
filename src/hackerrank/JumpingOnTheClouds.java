
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://www.hackerrank.com/challenges/jumping-on-the-clouds
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 17, 2022 11:22:01 AM
 */
public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {
    	int jumpCount=0;
    	int i = 0;
    	while(i != c.size()-1) {
    		if((i+2)<c.size()&&c.get(i+2)==0&&i!=c.size()-1) {
    			jumpCount++;
    			i+=2;
    		}
    		else if ((i+1)<c.size()&&c.get(i+1)==0) {
				jumpCount++;
				i++;
			}
    		
    	}
    	
    	return jumpCount;
    }
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0,0,1,0,0,1,0));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0,0, 0, 1, 0, 0));

		System.out.println(jumpingOnClouds(list));
		System.out.println(jumpingOnClouds(list2));
	}

}
