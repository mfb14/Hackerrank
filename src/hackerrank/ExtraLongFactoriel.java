
package hackerrank;

import java.math.BigInteger;


/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 20, 2022 6:45:03 AM
 */
public class ExtraLongFactoriel {

    public static void extraLongFactorials(int n) {
    
   
    BigInteger fac = BigInteger.ONE;
    for(int i=1;i<=n;i++)
        fac=fac.multiply(BigInteger.valueOf(i));
    
    System.out.println(fac);
    }
    
	public static void main(String[] args) {
		
		extraLongFactorials(25);
	}

}
