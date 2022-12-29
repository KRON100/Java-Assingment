package Question9;

import java.util.Scanner;

public class surface_area_of_sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        System.out.println("Enter radius of a circle");
			int radius = in.nextInt();
			double pie=3.14285714286;
			double area_sphere=4*pie*(radius*radius);
			System.out.println("Surface area of sphere="+area_sphere);
	}

}
