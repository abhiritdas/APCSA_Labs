/* Name: Abhirit Das
  Period: 3
  Lab/Project: DistanceLab*/

public class Distance {
	public double calcDist (double x1, double x2, double y1, double y2) {
				
		double distx = x2 - x1;
		distx = Math.pow(distx, 2);
		double disty = y2 - y1;
		disty = Math.pow(disty, 2);
		
		double distance = Math.sqrt(distx + disty);
		
		return distance;
	}
}