
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/save-the-prisoner
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 15, 2022 5:01:50 AM
 */
public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {
    // Write your code here
    	
    		
    	return (s+m-1)%n==0?n:(s+m-1)%n;
        
    	
           
    }
	public static void main(String[] args) {
		
		System.out.println(saveThePrisoner(999999999,999999998,999983945));
		System.out.println(saveThePrisoner(2, 576581, 1));
		System.out.println(saveThePrisoner(46934, 543563655, 46743));
		System.out.println(saveThePrisoner(999999999, 29010, 1	));
		System.out.println(saveThePrisoner(1000000000,999999999, 1000000000));
		System.out.println(saveThePrisoner(49,897910613,48));
	}

}
