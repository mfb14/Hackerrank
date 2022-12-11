
package hackerrank;

import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/java-string-tokens
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 11, 2022 9:22:15 AM
 */
public class StringTokens {
	public static void stringToken(String s, int n) {
		String [] str = new String[n];
		
		
	}

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      
      String s = sc.nextLine();
       
       String [] t = s.trim().split("[^A-Za-z]+");
       
       System.out.println(t.length);
       for(int i =0;i<t.length;i++) {
    	   System.out.print(t[i]+"/");
       }
       
       
    		   
	}

}
