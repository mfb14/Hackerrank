
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/beautiful-days-at-the-movies
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 22, 2022 5:39:04 AM
 */
public class BeatifulDaysAtTheMovies {

	public static double findReverse(int num) {
		int reverse = 0;
		if(num<10) {
			return Double.valueOf(num);
		}
		while(num!=0) {
			int lastDigit = num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
		}
		return reverse;
	}
    public static int beautifulDays(int i, int j, int k) {
    	int counter = 0;
    	
    	for(int t=i;t<=j;t++) {
    		Double day = Double.valueOf((findReverse(t)-t)/k);
    		if(day%1==0)counter++;
    	}
    	return counter;
    }
	public static void main(String[] args) {
		
		System.out.println(beautifulDays(1, 100, 45684660));
		
		System.out.println(findReverse(100));
	}

}
