
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/electronics-shop
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 26, 2022 2:58:33 PM
 */
public class ElectronicShops {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       int max = 0;
       
       for(int i=0;i<keyboards.length;i++) {
    	   for(int j=0;j<drives.length;j++) {
    		   int cost = keyboards[i]+drives[j];
    		   if(cost>max&&cost<=10)
    			   max=cost;
    	   }
       }
       
       return max;

    }
	public static void main(String[] args) {
		System.out.println(getMoneySpent(new int[] {3,1}, new int[] {5,2,8}, 10));
		

	}

}
