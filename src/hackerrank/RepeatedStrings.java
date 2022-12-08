
package hackerrank;



/**
 * @link https://www.hackerrank.com/challenges/repeated-string
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 8, 2022 12:00:45 PM
 */
public class RepeatedStrings {

    public static long repeatedString(String s, long n) {
    	long strSize = s.length();
    	
    	long aCount=0;
    	
    	aCount=s.chars().filter(c->c=='a').count();
    	aCount=aCount*n/strSize;
    	for(int i =0;i<n%strSize;i++) {
    		if(s.charAt(i)=='a')
    			aCount++;
    	}
    	
    	return aCount;
  
    }
	public static void main(String[] args) {
		System.out.println(repeatedString("udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps",872514961806L));

	}

}
