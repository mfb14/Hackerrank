package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * How many of the largest number are in the array? 
 * */
public class BirthdayCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> candles = new ArrayList<Integer>(Arrays.asList(1,3,4,9,6,1,2));
		
		Collections.sort(candles);
		int max = candles.get(candles.size()-1);
		int count = 0;
		for (Integer x : candles) {
			if(max==x) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	  	
}
