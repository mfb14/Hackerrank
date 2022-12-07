
package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @link https:https://www.hackerrank.com/challenges/day-of-the-programmer
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since December 7, 2022 7:16:41 AM
 */
public class DayOfProgrammer {
   
   public static String dayOfProgrammer(int year) {
        
        if(year>1918){
            if(year%400==0||year%4==0&&year%100!=0)
                return "12.09."+year;
            return "13.09."+year;
        }
        else if(year==1918)return "26.09."+year;
        
        return year%4==0?"12.09."+year:"13.09."+year;
    }
	public static void main(String[] args) {
	
      System.out.printlin(dayOfProgrammer(1900));
	}

}




