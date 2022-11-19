package hackerrank;


import java.util.regex.Pattern;

/*
 * Java String Time Conversion Solution
 * 
 * */

public class TimeConversion {

	public static void main(String[] args) {
		
		String s1 = "06:40:03AM";
		if (s1.contains("PM")) {
			Pattern pattern = Pattern.compile("[:,P,M,A]");
			
			String[] parts=pattern.split(s1);
			
			
			
			int i = Integer.valueOf(parts[0]);
			i += 12;
			String st = String.valueOf(i);
			
			
			System.out.println((st+":"+parts[1]+":"+parts[2]));
		}
		else if (s1.contains("AM")) {
			Pattern pattern = Pattern.compile("[:,P,M,A]");
			
			String[] parts=pattern.split(s1);
			
			
			
			int i = Integer.valueOf(parts[0]);
			if(i<12)
				System.out.println(i+":"+parts[1]+":"+parts[2]);
			else if (i>=12) {
				i = Math.abs(i- 12);
				System.out.println("0"+i+":"+parts[1]+":"+parts[2]);
			}
			
			String s = "06:40:03AM";
			 String[] source = s.substring(0, 8).split(":");
			 String type = s.substring(8, 10);
			
			System.out.println(source[0]);
			System.out.println(type);
		}
		
		
	}
	
}
