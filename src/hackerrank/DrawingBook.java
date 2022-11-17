
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/drawing-book
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 16, 2022 5:51:06 AM
 */
public class DrawingBook {

    public static int pageCount(int n, int p) {
        if(p==1||p==n)
            return 0;
        int switchPage = 0;
        if(p<=n/2||(p+1)<=n/2) {
        	int page = 1;
        	while(page<=p) {
        		switchPage++;
        		page+=2;	
        	}
        }
        else if (p>n/2||(p+1)>n/2) {
			int pages = n;
			while(pages>=p) {
				switchPage++;
				pages-=2;
			}
			return (n-p)/2;
		}
  
        return p%2==0?switchPage:switchPage-1;
    }
    /**
     * Solution of the same problem but this is O(n) time complexity
     * */
    public static int bestPageCount(int n,int p) {
    	return 1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pageCount(8, 4));
		System.out.println(pageCount(6, 2));
		System.out.println(pageCount(83246,78132));
		System.out.println(pageCount(8, 6));
		System.out.println(pageCount(25, 9));
		System.out.println(pageCount(25,11));
		System.out.println(pageCount(7, 3));
		System.out.println(pageCount(2, 2));
		
		double x = Math.pow(1.1, 365);
		
		System.out.println(x);
	}

}
