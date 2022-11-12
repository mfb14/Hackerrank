
package hackerrank;

/**
 * @link  https://www.hackerrank.com/challenges/chocolate-feast
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 12, 2022 5:35:06 AM
 */

public class ChocolateFeast {
	/**
	 * 3       t = 3 (test cases)
	 * 10 2 5  n = 10, c = 2, m = 5 (first test case)
	 * 12 4 4  n = 12, c = 4, m = 4 (second test case)
	 * 6 2 2   n = 6,  c = 2, m = 2 (third test case)
	 * int n: Bobby's initial amount of money
	 * int c: the cost of a chocolate bar
     * int m: the number of wrappers he can turn in for a free bar
	 * */
    public static int chocolateFeast(int n, int c, int m) {

		int chocolateCount=n/c;
		int wrapperCount=n/c;

    	int eated = 0;
    	while (wrapperCount>=m) {
			
    		eated=wrapperCount/m;
    		
    		
    		wrapperCount=wrapperCount-(m*eated)+eated;
    		chocolateCount+=eated;
    		
    		
	
		}
    	return chocolateCount;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(chocolateFeast(15, 3, 2));
		
		
	
	}

}
