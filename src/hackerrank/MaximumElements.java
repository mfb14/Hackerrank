package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @link https://www.hackerrank.com/challenges/maximum-element
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 26, 2022 4:10:58 PM
 */
public class MaximumElements {

    public static List<Integer> getMax(List<String> operations) {
        
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        java.util.Stack<Integer> maxStack = new java.util.Stack<>();
        List<Integer> list = new ArrayList<>();
        Integer max = 0;
        for(int i = 0;i<operations.size();i++){
            if(operations.get(i).charAt(0)=='1'){
                stack.push(Integer.valueOf(operations.get(i).substring(2)));
                max = stack.peek();
                if(maxStack.isEmpty()) {
                	maxStack.push(max);
                	continue;
                }
                if(max>=maxStack.peek()) {
                	maxStack.push(max);
                }      
            }
            else if(operations.get(i).charAt(0)=='2') {
            	max=stack.pop();
            	if (max==maxStack.peek()) {
					maxStack.pop();
				}
            }
            
            else if(operations.get(i).charAt(0)=='3')
            	list.add(maxStack.peek());
        }
        return list;
    }
	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;
		try {
			n = Integer.parseInt(bufferedReader.readLine().trim());
		
		    List<String> ops = IntStream.range(0, n).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .collect(Collectors.toList());
		    System.out.println(getMax(ops));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
	}

	
	

}
