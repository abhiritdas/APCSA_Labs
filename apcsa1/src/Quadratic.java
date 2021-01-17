/* Name:	
Period: 3
Lab/Project: QuadraticLab*/

public class Quadratic {
	public double calcQuad (double a, double b, double c) {
		
		double determinant = b * b - 4* a * c;
		double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
		
		return root1;
	}
	
	public double calcQuad2 (double a, double b, double c) {
		
		double determinant = b * b - 4* a * c;
		double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
		
		return root2;
	}
}
