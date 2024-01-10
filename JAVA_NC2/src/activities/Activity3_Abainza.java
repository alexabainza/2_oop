package activities;

public class Activity3_Abainza {
	public static void main(String[] args) {
		double length1 = 5.5;
		double width1 = 3.2;
		
		System.out.printf("Area of %.2f and %.2f is %.2f\n",  width1, length1, calculateArea(width1, length1));
		
		double length2 = 23;
		double width2 = 1.8;
	
		System.out.printf("Area of %.2f and %.2f is %.2f", width2,  length2, calculateArea(width2, length2));

	}
		
	public static double calculateArea(double width, double length) {
		return length*width;
	}
	
}
