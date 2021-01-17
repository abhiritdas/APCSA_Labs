
public class Triangle {
	public double area (double a, double b, double c) {
		
		double perimeter =  a + b + c;
		double s = perimeter / 2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	
		
}