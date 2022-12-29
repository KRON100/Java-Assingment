package Question_10;

import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Principle, Rate, Time(in years)");
		double Principle = in.nextDouble();
		double Rate = in.nextDouble();
		double Time = in.nextDouble();
		double compound_interest = Principle * (Math.pow((1 + Rate / 100), Time)) - Principle;
	      System.out.println("The Compound Interest is : " + compound_interest);
	}

}
