package Question8;

import java.util.Scanner;

public class perimeter_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter values of edges");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float perimeter;
        perimeter  = 2*(a+b);  
System.out.println("Perimeter of Rectangle is: "+perimeter);  
		
	}

}
