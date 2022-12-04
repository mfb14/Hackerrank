
package hackerrank;


/**
 * @linknk https://www.hackerrank.com/challenges/find-digits
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 3, 2022 6:47:39 AM
 */
public class FindDigits {

    public static int findDigits(int n) {
    	
    	int digitCounter = 0;
    	int digit;
    	int number = n;
    	while(n>0) {
    		digit=n%10;
    		if(digit!=0&&number%digit==0)
    			digitCounter++;
    		n=n/10;
    	}
    	return digitCounter;
    }
	public static void main(String[] args) {
		System.out.println(findDigits(124));
	}

}
