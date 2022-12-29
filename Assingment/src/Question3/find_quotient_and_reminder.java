package Question3;

import java.util.Scanner;

public class find_quotient_and_reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double dividend = in.nextDouble();
		double divisor = in.nextDouble();
		double quotient;
		quotient = dividend / divisor;
		double reminder;
		reminder = dividend % divisor;
		System.out.println("Quotient is "+quotient);
		System.out.println("Reminder is "+reminder);

	}

}
