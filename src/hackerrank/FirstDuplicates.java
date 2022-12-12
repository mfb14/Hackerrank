
package hackerrank;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 12, 2022 11:13:10 AM
 */
public class FirstDuplicates {

	public static int findDuplicate(int [] list) {
		
		for(int i=0;i<list.length;i++) {
			if(list[Math.abs(list[i])-1]<0)
				return Math.abs(list[i]);
			list[Math.abs(list[i])-1] = -list[Math.abs(list[i])-1];
		}	
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findDuplicate(new int [] {2,1,3,5,4,3,2}));
	}

}
