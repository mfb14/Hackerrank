
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/library-fine
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 23, 2022 2:56:25 PM
 */
public class LibraryFine {
    
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Write your code here
		
	    if (y1>y2) {
	        return 10000;
	    }
	    
	    if (y1==y2 && m1==m2 && d1>d2) {
	        return Math.abs(d2-d1)*15;
	    }
	    
	    if (y1==y2 && m1>m2) {
	        return Math.abs(m2-m1)*500;
	    }
	    
	    return 0;

	    
		

    }
	public static void main(String[] args) {
		System.out.println(libraryFine(14, 7, 2018, 5, 7, 2018));
		
		System.out.println(4%12);
	}

}
