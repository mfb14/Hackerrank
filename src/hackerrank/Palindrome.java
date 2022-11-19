
package hackerrank;

import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/java-string-reverse/
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 19, 2022 5:40:14 AM
 */
public class Palindrome {


	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char [] pal = A.toCharArray();
        boolean x = false;
        for(int i=0;i<A.length()/2;i++){  
                x=A.charAt(i)==A.charAt(A.length()-1-i)?true:false; 
        }
        System.out.println(x);
        
     
	}

}
