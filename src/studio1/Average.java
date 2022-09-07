package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = scan.nextInt();
		System.out.println("Enter n2");
		int n2 = scan.nextInt();
		double theAverage = (n1+n2)/2.0;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + theAverage);
		// TODO Auto-generated method stub

	}

}
