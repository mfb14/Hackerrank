
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @link https://www.hackerrank.com/challenges/designer-pdf-viewer/
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 6, 2022 6:37:42 PM
 */
public class DesignerPdfViewer {
	
    public static int designerPdfViewer(List<Integer> h, String word) {
    	int length = word.length();
    	Map<Character,Integer> words = new HashMap<>();
    	for(int i=0;i<length;i++) {
    		if(word.charAt(i)!=' ')
    			words.put(word.charAt(i),h.get(word.charAt(i)-97));
    	}
    	
    	int max = Collections.max(words.values());
    	
    	return max*length;
    }
	public static void main(String[] args) {
	
		List<Integer> l = new ArrayList<>(Arrays.asList(1 ,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5));
		
		System.out.println(designerPdfViewer(l, "abc"));
		
		int a = 'a';
		
		
	}
}
