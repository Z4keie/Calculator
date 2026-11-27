package main;

import java.util.Scanner;
import util.Action;
import util.Menu;

class Program {
    void main () {
        String choice;
        boolean menu = true;
        boolean calculator;
        Scanner in = new Scanner (System.in).useLocale(java.util.Locale.US);
        double firstNumber, secondNumber;
//  Start code
while ( menu ) {
        Menu.startMenu();
        choice = in.next ();
//  Choice (Menu)
            switch ( choice ) {
                case "1": // Start calculator
                    calculator = true;
                    while ( calculator ) {
                        Menu.calculatorMenu ();
                        choice = in.next ();
                        switch ( choice ) {
                            case "0":
                                calculator = false;
                                break;
                            case "1":
                                System.out.println ("Enter the first number: ");
                                firstNumber = Action.readValidDouble(in);
                                System.out.println ("Enter the second number: ");
                                secondNumber = Action.readValidDouble (in);
                                System.out.println ("Answer: " + Action.addition (firstNumber, secondNumber));
                                break;
                            case "2":
                                System.out.println ("Enter the first number: ");
                                firstNumber = Action.readValidDouble(in);
                                System.out.println ("Enter the second number: ");
                                secondNumber = Action.readValidDouble (in);
                                System.out.println ("Answer: " + Action.subtraction (firstNumber, secondNumber));
                                break;
                            case "3":
                                System.out.println ("Enter the first number: ");
                                firstNumber = Action.readValidDouble(in);
                                System.out.println ("Enter the second number: ");
                                secondNumber = Action.readValidDouble (in);
                                System.out.println ("Answer: " + Action.division (firstNumber, secondNumber));
                                break;
                            case "4":
                                System.out.println ("Enter the first number: ");
                                firstNumber = Action.readValidDouble(in);
                                System.out.println ("Enter the second number: ");
                                secondNumber = Action.readValidDouble (in);
                                System.out.println ("Answer: " + Action.multiplication (firstNumber, secondNumber));
                                break;
                            case "5":
                                System.out.println ("Enter the first number: ");
                                firstNumber = Action.readValidDouble(in);
                                System.out.println ("Enter the second number: ");
                                secondNumber = Action.readValidDouble (in);
                                System.out.println ("Answer: " + Action.remainderOfDivision (firstNumber, secondNumber));
                                break;
                            default:
                                System.out.println ("Invalid input!");
                                break;
                        }
                    }
                break; // End Case "1"
// ------------------------------------
                case "2": // Exit (Menu)
                    System.out.println ("Bye!");
                    menu = false;
                    break;
// ------------------------------------
                default: // Incorrect input
                    System.out.println ("Invalid input!");
                    break;
        }
      }
    }
}
