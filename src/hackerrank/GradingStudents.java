package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Grading Student problem
 * */
public class GradingStudents {

	public static void main(String[] args) {
		
		List<Integer> grade = new ArrayList<Integer>(Arrays.asList(73,67,38,33));
		
		List<Integer> grades = new ArrayList<>();
		for (Integer g : grade) {
			if (g<38) {
				grades.add(g);
			}
			else {
				if(g%5>2) {
					//This provides to round to the nearest power of 5 
					g = (g+4)/5*5;
					grades.add(g);
				}
				else {
					grades.add(g);
				}
			}
		}
		for (Integer integer : grades) {
			System.out.println(integer);
		}

	}

}
