import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new line: ");
        String input = scanner.nextLine();
        double answer = 0;
        while (true) {
            if (input.equals("-")) break;
            input = extractFromBrackets(input);

            System.out.println(input);

            System.out.print("Enter new line: ");
            input = scanner.nextLine();
        }
//        if (isBracketsPresent(input) & isBracketsValid(input)) {
//            answer = evalBrackets(input);
//        } else {
//            answer = eval(input);
//        }
    }

    private static String extractFromBrackets(String input) {
        String pureLine = input;
        if (isBracketsValid(input)) {
            int startEntry = input.indexOf("(");
            int lastEntry = input.lastIndexOf(")")>0?input.lastIndexOf(")"):input.length();
            pureLine = input.substring(startEntry + 1, lastEntry);
        }
        return pureLine;
    }

    private static double eval(String input) {
        return 0;
    }

    private static double evalBrackets(String input) {
        return 0;
    }

    public static boolean isBracketsValid(String input) {
        if (input.contains("(") & input.contains(")")) {
            int startEntry = input.indexOf("(");
            int lastEntry = input.lastIndexOf(")");
            return startEntry + 3 < lastEntry;
        }
        return false;
    }

    public static boolean isBracketsPresent(String input) {
        return input.contains("(") & input.contains(")");
    }


}
