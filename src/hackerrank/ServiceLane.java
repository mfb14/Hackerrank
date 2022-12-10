
package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * @link https://www.hackerrank.com/challenges/service-lane/problem
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 8, 2022 9:31:39 PM
 */
public class ServiceLane {

	public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
		  List<Integer> result = new ArrayList<>();  
		  
		  for(int i = 0;i<cases.size();i++) {
			  int firstIndex = cases.get(i).get(0);
			  int secondIndex = cases.get(i).get(1);
			 int min = Collections.min(width.subList(firstIndex, secondIndex+1));
			 result.add(min);
		  }
		  
		  return result;

	}
	public static void main(String[] args) throws IOException {
		
	     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	       

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(firstMultipleInput[0]);

	        int t = Integer.parseInt(firstMultipleInput[1]);

	        List<Integer> width = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());

	        List<List<Integer>> cases = new ArrayList<>();

	        IntStream.range(0, t).forEach(i -> {
	            try {
	                cases.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(Collectors.toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        List<Integer> result =  serviceLane(n, cases,width);

	       result.stream().forEach(r->System.out.print(r+" "));

	        bufferedReader.close();
	       
	}

}
