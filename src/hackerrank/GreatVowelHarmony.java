
package hackerrank;

import java.util.Scanner;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 1, 2022 10:56:48 PM
 */
public class GreatVowelHarmony {

	/**
	 * Gelen String içini döngü ile kontrol ediğ ince ve kalın harfleri 
	 * 
	 * @param s 
	 * */
	public static boolean isItHarmony(String s) {
		int boldVowel = 0;// {'a','ı','o','u'};
		int thinVowel = 0;// {'e','i','ö','ü'};
		
		int i =0;
		
		while(i<s.length()) {
			if(s.charAt(i)=='a'||s.charAt(i)=='ı'||s.charAt(i)=='o'||s.charAt(i)=='u'
               ||s.charAt(i)=='A'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				boldVowel++;
				i++;
				continue;
			}
	
			if(s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='ö'||s.charAt(i)=='ü'
			   ||s.charAt(i)=='E'||s.charAt(i)=='İ'||s.charAt(i)=='Ö'||s.charAt(i)=='Ü') 
				thinVowel++;
			
			i++;
			if(boldVowel>0&&thinVowel>0)
				return false;
		}
		int x=boldVowel;
		return boldVowel==0||thinVowel==0?true:false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(isItHarmony(s));
		
		

		
	}

}
