package Question5;

import java.util.Scanner;

public class roots_of_quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter values of a, b, c");	    
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
			    double root1, root2;

			    //determinant = (b2 - 4ac)
			    double determinant = b * b - 4 * a * c;
			    
			    if (determinant > 0) {

			      root1 = (-b + sqrt(determinant)) / (2 * a);
			      root2 = (-b - sqrt(determinant)) / (2 * a);

			      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
			    }

			    // if determinant = 0
			    else if (determinant == 0) {
			      root1 = root2 = -b / (2 * a);
			      System.out.format("root1 = root2 = %.2f;", root1);
			    }

			    // if determinant is less than zero
			    else {

			      // roots are complex number and distinct
			      double real = -b / (2 * a);
			      double imaginary = sqrt(-determinant) / (2 * a);
			      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
			    }
			  }

	private static double sqrt(double determinant) {
		// TODO Auto-generated method stub
		return 0;
	}
}		
	

