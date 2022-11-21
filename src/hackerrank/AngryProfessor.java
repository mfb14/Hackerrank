
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 21, 2022 5:42:19 AM
 */
public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        int studentCounter = 0;
        for(Integer s:a){
            studentCounter= s<=0?studentCounter+1:studentCounter;
            System.out.println(studentCounter);
        }
        return studentCounter>=k?"YES":"NO";
    }
	public static void main(String[] args) {
		
		List<Integer> sList = new ArrayList<>(Arrays.asList(0,-1,-2,2,1));
		
		System.out.println(angryProfessor(3, sList));

	}

}
