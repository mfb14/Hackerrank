package hackerrank;

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
    	double determ = Math.sqrt((b*b)-4*a*c);
    	double x1,x2;
    	if(determ>0) {
            x1 = (-b-determ)/(2*a);
            x2 = (-b+determ)/(2*a);
            return new Roots(x2, x1);            
    	}
    	
    		x1=x2=-b/(2*a);
    		return new Roots(x1, x2);
    	
    	
    	
        
    }
    
    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}