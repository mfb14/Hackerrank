
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * In this problem I noticed all values is ordered. 
 * I just wanted to find correct divisor between last element of a and first element of b. 
 * 
 * 
 * @link https://www.hackerrank.com/challenges/between-two-sets/
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 10, 2022 10:43:06 AM
 */
public class BetweenTwoSets {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    
        int divisor=1;
        //This condition controls list a is big list b return 0
        if(a.get(a.size()-1)>b.get(0))
        	return 0;
        //If size of a is bigger than one this will find least common factor of a and equate to divisor
        if(a.size()>1){
            for(Integer each:a) {
            	divisor=ekok(divisor, each);
            }
        }
        //If a.size equals 1 divisor is first element
        else
            divisor=a.get(0);
        /*
         * count number of common divisor of b
         * */
        int count =0;
        
        for(int i=divisor;i<=b.get(0);i+=divisor) {
            //bCount  To check whether b has divided all the elements.
        	int bCount=0;
            for(Integer num:b) {
                
                if(num%i==0)
                    bCount++;
            }
            //This condition if bCount equals b.size so divisor is divided all the elements
            if(bCount==b.size())
                count++;
        }
    return count;  
        
    }
	/**
	 * Find Least common factor of two elements 
	 * */
    public  static int  ekok(int p,int o) {
        int y = 0;
        for(int i=o*p;i>0;i--) {
            if(i%p==0&&i%o==0)
                y=i;
        }
        return y;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> first = new ArrayList<>(Arrays.asList(2,4,6));
		//List<Integer> second = new ArrayList<>(Arrays.asList(24,48));
		
		//List<Integer> first = new ArrayList<>(Arrays.asList(2,6));
		//List<Integer> second = new ArrayList<>(Arrays.asList(24,36));
		
		
		/*
		 * 	100 99 98 97 96 95 94 93 92 91
    	 *	1 2 3 4 5 6 7 8 9 10
		 * */
		
		List<Integer> first = new ArrayList<>(Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91));
		List<Integer> second = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(getTotalX(first, second));
		
		
		
		
		
	}

}
