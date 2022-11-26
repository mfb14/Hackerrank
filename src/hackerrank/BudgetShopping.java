
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 25, 2022 3:47:23 PM
 */
public class BudgetShopping {
	/**
	 * @return int max number of notebooks that can be purchased
	 * @param n total amaount of money
	 * @param bundleQuantities number of notebooks in a bundle at shop[i]
	 * @param bundleCosts cost of a bundle notebooks at shop[i] 
	 * */
	public static int budgetShopping(int n, List<Integer> bundleQuantities, List<Integer>bundleCosts) {
		//FIXME If budget is smaller than 'n' look for other optian (Need to be refactor) 
		
		int budget;
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < bundleCosts.size(); i++) {
			budget=n/bundleCosts.get(i);
			l.add(i,budget*bundleQuantities.get(i));
		}
		
		int max = Collections.max(l);
		return max;
	}

	public static void main(String[] args) {
		
		List<Integer> quantitites = new ArrayList<>(Arrays.asList(20,19));
		List<Integer> costs = new ArrayList<>(Arrays.asList(24,20));
		System.out.println(budgetShopping(50, quantitites, costs));

	}

}
