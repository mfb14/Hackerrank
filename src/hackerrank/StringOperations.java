package hackerrank;

import java.util.Scanner;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 9, 2022 8:38:41 AM
 */
public class StringOperations {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 Scanner sc = new Scanner(System.in);
	        String first = sc.next();
	        String second = sc.next();
	        System.out.println(first.length()+second.length());
	        if(first.compareToIgnoreCase(second)>0)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	            
	        System.out.println(first.substring(0,1).toUpperCase()+first.substring(1)+" "+
	        second.substring(0,1).toUpperCase()+second.substring(1));
	}

}
