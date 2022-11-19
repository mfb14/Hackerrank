
package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @link https://www.hackerrank.com/challenges/java-anagrams
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 19, 2022 6:16:41 AM
 */
public class Anagrams {

	static boolean isAnagram(String s1,String s2) {
		HashMap<Character, Integer> hash1 = new HashMap<>();
		HashMap<Character, Integer> hash2 = new HashMap<>();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length()) return false;
		
		for(int i=0;i<s1.length();i++) {
			hash1.compute(s1.charAt(i), (k,v)->v==null?1:++v);
			hash2.compute(s2.charAt(i), (k,v)->v==null?1:++v);
		}
		
		return hash1.equals(hash2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String first = sc.next();
		String second = sc.next();
		
		String s = isAnagram(first,second)?"Anagrams":"Not Anagrams";
		System.out.println(s);
	}

}
