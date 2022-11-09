package hackerrank;

import java.util.Arrays;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 2, 2022 10:48:28 PM
 */
public class StringCont {
	public static String [] stringArr(String[] arr) {
		String []  parts = new String[256];
		int index = 0;
		String f = "@gmail.com";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains(f)) {
				parts[index]=arr[i];
				index++;
			}
		}
		return parts;
		
	}
	
	public static void main(String[] args) {
		
		String [] strArr = new String [] {
			"furkan@gmail.com",
			"gmailfurkan@gmail.com",
			"mert@example.com",
			"dockergmail@com"
					};
		for (String string : stringArr(strArr)) {
			System.out.println(string);
		}
		
	}

}
