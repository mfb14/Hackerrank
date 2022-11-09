package hackerrank;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 9, 2022 8:41:54 AM
 */
public class NumberLineJumps {


	/**
	 * We have to figure out a way to get both kangaroos at the same location at the same time as part of the show. 
	 * If it is possible, return YES, otherwise return NO. 
	 *  
	 * @param x1  first kangoroo's start location
	 * @param v1  first kangoroo's rates of meter per jump
	 * @param x2  second kangoroo's start location
	 * @param v2  second kangoroo's rates of meter per jump
	 * 
	 * */
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    
		if(x2>x1&&v2>v1) {
			return "NO";
		}
		else{
			for(int i=1;i<10000;i++) {
				if(((v1*i)+x1)==((v2*i)+x2))
					return "YES";
				
			}
			return "NO";
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1571 4240 9023 4234
		System.out.println(kangaroo(1571, 4240, 9023, 4234));
	}

}
