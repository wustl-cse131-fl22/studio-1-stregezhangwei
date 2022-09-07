package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Year");
		int year = in.nextInt();
		boolean Criteria_1 = (year%4==0);
		boolean Criteria_2 = (year%100 != 0);
		boolean Criteria_3 = (year%400 == 0);
		boolean FinalCriteria = (Criteria_1 & Criteria_2 || Criteria_3);
		System.out.println(FinalCriteria);
		// TODO Auto-generated method stub

	}

}
