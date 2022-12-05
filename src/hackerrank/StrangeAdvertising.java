
package hackerrank;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 5, 2022 5:30:45 PM
 */
public class StrangeAdvertising {


    public static int viralAdvertising(int n) {
    // Write your code here
        int shared = 5;
        int liked=0;
        int cumulative = 0;
        for(int i=1;i<=n;i++){
            liked = shared/2;
            cumulative+=liked;
            shared=shared/2*3;
        }
        return cumulative;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(viralAdvertising(5));
	}

}
