package Question2;

import java.util.Scanner;

public class multiply_two_floats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter two floating numbers");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float mul;
		mul = (a*b);
		System.out.println("Multiply of two floating numbers " +mul);
		
	}

}
