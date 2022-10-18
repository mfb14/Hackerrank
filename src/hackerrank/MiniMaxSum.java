package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Write Min and max element of array 
 * */
public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,3,4,9,6,1,2));
				
		Collections.sort(arr);
		
		System.out.println(arr);
		
		int sumMin=0,sumMax=0;
		for (int i = 1; i < arr.size(); i++) {
			sumMax+=arr.get(i);
			
		}
		for (int i = 0; i < arr.size()-1; i++) {
			sumMin+=arr.get(i);
			
		}
		
		System.out.println(sumMin+"\n"+sumMax);
	}

}
