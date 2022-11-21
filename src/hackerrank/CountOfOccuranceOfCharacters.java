
package hackerrank;

import java.util.HashMap;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 21, 2022 9:38:45 AM
 */
public class CountOfOccuranceOfCharacters {

	public static HashMap<Character, Integer> findOccuranceOfCharacters(String str){
		int count;
		char ch;
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for(int i = 0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch==' ') continue;
			if(hashMap.containsKey(ch)) {
				count = hashMap.get(ch);
				count++;
				hashMap.replace(ch, count);
			}else {
				hashMap.put(ch, 1);
			}
		}
		
		return hashMap;
	}
	public static void main(String[] args) {
		
		System.out.println(findOccuranceOfCharacters("Merhabalar efenim"));

	}

}
