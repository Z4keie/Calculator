import java.util.Scanner;

class Program {
    void main () {
        String choice;
        boolean menu = true;
        boolean calculator;
        Scanner in = new Scanner (System.in).useLocale(java.util.Locale.US);
        double firstNumber, secondNumber, result;
//  Start code
while ( menu ) {
        System.out.println ("""
                MENU
                
                1. Start
                2. Exit
                """);
        System.out.print ("Enter: ");
        choice = in.next ();
//  Choice (Menu)
            switch ( choice ) {
                case "1": // Start calculator
                    calculator = true;
                    while ( calculator ) {
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
                        choice = in.next ();
                        switch ( choice ) {
                            case "0":
                                calculator = false;
                                break;
                            case "1":
                                System.out.println ("Enter a number (1): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                firstNumber = in.nextDouble ();

                                System.out.println ("Enter a number (2): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine ();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                secondNumber = in.nextDouble ();

                                result = firstNumber + secondNumber;
                                System.out.println ("Answer: " + result);
                                break;
                            case "2":
                                System.out.println ("Enter a number (1): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                firstNumber = in.nextDouble ();

                                System.out.println ("Enter a number (2): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                secondNumber = in.nextDouble ();

                                result = firstNumber - secondNumber;
                                System.out.println ("Answer: " + result);
                                break;
                            case "3":
                                System.out.println ("Enter a number (1) : ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                firstNumber = in.nextDouble ();

                                System.out.println ("Enter a number (2): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                secondNumber = in.nextDouble ();

                                result = firstNumber / secondNumber;
                                System.out.println ("Answer: " + result);
                                break;
                            case "4":
                                System.out.println ("Enter a number (1): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                firstNumber = in.nextDouble ();

                                System.out.println ("Enter a number (2): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                secondNumber = in.nextDouble ();

                                result = firstNumber * secondNumber;
                                System.out.println ("Answer: " + result);
                                break;
                            case "5":
                                System.out.println ("Enter a number (1): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                firstNumber = in.nextDouble ();

                                System.out.println ("Enter a number (2): ");
                                while (!in.hasNextDouble()) {
                                    String wrongInput = in.nextLine();
                                    if (!wrongInput.isEmpty()) {
                                        System.out.print("Error! '" + wrongInput + "' - is not a number. Enter again: ");
                                    }
                                }
                                secondNumber = in.nextDouble ();

                                result = firstNumber % secondNumber;
                                System.out.println ("Answer: " + result);
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
