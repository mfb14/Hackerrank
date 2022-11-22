
package hackerrank;

/**
 * @link https://www.hackerrank.com/challenges/counting-valleys
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 18, 2022 5:46:53 AM
 */
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
 
        int [] movements = new int[steps];
        int m=0;
        int valleyCount=0;
        for(int i=0;i<steps;i++) {
        	 if(path.charAt(i)=='D') {
        		 m--;
        		 movements[i]=m;
        		 if(i>0&&movements[i-1]<0&&movements[i]==0) valleyCount++;
        		 
        	 }
        	 else {
        		 m++;
        		 movements[i]=m;      		
        		 if(i>0&&movements[i-1]<0&&movements[i]==0) valleyCount++;		 
			}
        }
        return valleyCount;
    }
	public static void main(String[] args) {
		System.out.println(countingValleys(100,"DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD"));
		System.out.println(countingValleys(12, "DDUUDDUDUUUD"));

	}

}
