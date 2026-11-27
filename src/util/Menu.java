package util;

public class Menu {

	public static void startMenu() {
		System.out.println ("""
                MENU
                
                1. Start
                2. Exit
                """);
		System.out.print ("Enter: ");
	}

	public static void calculatorMenu() {
		System.out.println ("""
                                CALCULATOR
                                
                                1. Addition
                                2. Subtraction
                                3. Division
                                4. Multiplication
                                5. Remainder Of Division
                                
                                0. Exit
                                """);
		System.out.print ("Enter: ");
	}
}
