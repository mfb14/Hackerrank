
package hackerrank;

/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 20, 2022 5:35:56 AM
 */
public class CatsAndMouse {
	
	/**
	 * 
	 * */
    static String catAndMouse(int x, int y, int z) {
    
    	return Math.abs(x-z)==Math.abs(y-z)?"Mouse C":Math.abs(x-z)<Math.abs(y-z)?"Cat A":"Cat B";

    }
	public static void main(String[] args) {
		
		System.out.println(catAndMouse(2, 5, 4));

	}

}
