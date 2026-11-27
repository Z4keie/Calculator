package util;

import java.util.Scanner;

public class Action {

	public static double readValidDouble (Scanner in) {
		while (!in.hasNextDouble()) {
			String wrongInput = in.nextLine();
			if (!wrongInput.isEmpty()) {
				System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
			}
		}
		double validNumber = in.nextDouble();
		in.nextLine();
		return validNumber;
	}

	public static double addition (double x, double y) {
		return x + y;
	}
	public static double subtraction (double x, double y) {
		return x - y;
	}
	public static double division (double x, double y) {
		return x / y;
	}
	public static double multiplication (double x, double y) {
		return x * y;
	}
	public static double remainderOfDivision (double x, double y) {
		return x % y;
	}
}
