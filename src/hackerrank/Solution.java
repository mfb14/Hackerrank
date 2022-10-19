package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> outputList = new ArrayList<>();
	        Scanner input = new Scanner(System.in);
	        int t = input.nextInt();
	        for(int x=0;x<t;t++){        
	            int a = input.nextInt();
	            int b = input.nextInt();
	            int n = input.nextInt();
	        
	        int sum=0;
	        int result=0;
	        int output = 0;
	        int powSum=0;
	        
	        for(int j=0;j<n;j++) {
	            
	            for(int i=0;i<=j;i++) {
	                
	                result = (int) Math.pow(2, i);
	                powSum= powSum+result*b;
	                sum = powSum;
	                
	                
	            }
	            sum = powSum;
	            output = a+sum;
	            outputList.add(output);
	            output = 0;
	            result = 0;
	            powSum=0;
	            sum=0;
	        }
	        
	      
	      outputList.forEach(num -> System.out.print(num));
	        
	    }
	       
	    

}
}
