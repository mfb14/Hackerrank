
package hackerrank;

import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/java-string-compare/
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 11, 2022 8:25:59 AM
 */
public class StringCompare {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		
		String smallest = str.substring(0,k);
		String largest = str.substring(0,k);
		
		for(int i=0;i<str.length()-k;i++) {
			String temp = str.substring(i,i+k);
			if(smallest.compareTo(temp)>0)
				smallest=temp;
			if(largest.compareTo(temp)<0)
				largest=temp;
		}
		
		System.out.println(smallest+" / "+largest);
	}

}
