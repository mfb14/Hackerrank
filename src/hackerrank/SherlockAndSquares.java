
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/sherlock-and-squares
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 24, 2022 10:07:57 AM
 */
public class SherlockAndSquares {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a  the lower range boundary
     *  2. INTEGER b  the upper range boundary
     */
    public static int squares(int a, int b) {
    
    	int count = 0;
    	while(a<=b) {
    		if(Math.sqrt(a)%1==0) {
    			count++;
    			a=(int)Math.pow(Math.sqrt(a)+1, 2);
    		}
    		else {
    			a++;
    		}
    	}
    	
    	return count;
    }
	public static void main(String[] args) {
		
		System.out.println(squares(1, 495445964));
		

	}

}
