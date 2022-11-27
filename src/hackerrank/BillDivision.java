
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://www.hackerrank.com/challenges/bon-appetit
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 27, 2022 6:25:01 PM
 */
public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    	bill.remove(bill.get(k));
    	int totalAmount=bill.stream().reduce(0,(x,y)->x+y)/2;
    	
    	System.out.println((b-totalAmount)==0?"Bon Appetit":b-totalAmount);
    	
    	

    }
	public static void main(String[] args) {
		List<Integer> bill=new ArrayList<>(Arrays.asList(3,10,2,9));
		
		bonAppetit(bill, 1, 12);

	}

}
