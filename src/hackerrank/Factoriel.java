package hackerrank;

import java.util.Scanner;

public class Factoriel {

	public static int factoriel(int n) {
		if(n>=1)
			return n * factoriel(n-1);
		else
			return 1;
		
	}
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 int number = input.nextInt();
		 
		 System.out.println("Factoriel of the number is:"+ factoriel(number));

	}

}
