
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/utopian-tree
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 27, 2022 7:09:07 PM
 */
public class UtopianTree {

    public static int utopianTree(int n) {
    	int height = 1;
    	for(int i=0;i<n;i++) {
    		if(i%2==0)
    			height*=2;
    		else {
				height++;
			}
    			
    	}
    	return height;

    }
	public static void main(String[] args) {
		
		System.out.println(utopianTree(5));

	}

}
