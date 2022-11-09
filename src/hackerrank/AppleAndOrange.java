/**
 * AppleAndOrange.java
 * */
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * HackerRank AppleAndRange problem solution
 * {@link} https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 1, 2022 11:42:19 PM
 */


class Result {

    /**
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s is start point of home
     *  2. INTEGER t is endpoint of home
     *  3. INTEGER a apple tree is at point 
     *  4. INTEGER b orange tree is at point 
     *     INTEGER d negative felt left, positive felt right 
     *  5. INTEGER_ARRAY apples distances at which each apple falls from the tree.
     *  6. INTEGER_ARRAY oranges distances at which each orange falls from the tree.
     */

	/*
	 * m->apples, n->oranges
	 * */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    int HomeStart = s;
    int HomeEnd = t;
    int Apple = a;
    int Orange = b;
    int AppleCount = 0;
    int OrangeCount = 0;
    for (int i = 0; i < apples.size(); i++) {
		if(Apple+apples.get(i)>=HomeStart&&Apple+apples.get(i)<=HomeEnd)
			AppleCount++;
	}
    for (int i = 0; i < oranges.size(); i++) {
		if(Orange+oranges.get(i)>=HomeStart&&Orange+oranges.get(i)<=HomeEnd)
			OrangeCount++;
	}
    System.out.print(AppleCount+"\n"+OrangeCount);

    }

}
public class AppleAndOrange {

	public static void main(String[] args) {
		List<Integer> ap = new ArrayList<Integer>(Arrays.asList(-2,2,1));
		List<Integer> or = new ArrayList<Integer>(Arrays.asList(5,-6));
		Result.countApplesAndOranges(7, 11, 5, 15, ap, or);

	}

}
