package Validate;
import java.util.Scanner;

public class Validate {
    private final static Scanner in = new Scanner(System.in);
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public static String checkInputFlag() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("optional")
                    || result.equalsIgnoreCase("mandatory")) {
                return result;
            }
            System.err.println("There are only two flag: Optional, mandatory");
            System.out.print("Enter again: ");
        }
    }
}
