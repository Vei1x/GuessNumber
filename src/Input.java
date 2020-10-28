import java.util.Scanner;

public class Input {
    private final Scanner sc = new Scanner(System.in);

    public int getMin() {
        System.out.print("\nEnter min value: ");
        return getGuess();
    }

    public int getMax() {
        System.out.print("Enter max value: ");
        return getGuess();
    }

    public int getGuess() {
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("\nValue has wrong type of symbol" +
                        "\n(value is not a number)" +
                        "\nRe-enter value:");
                sc.next();
            } else {
                return sc.nextInt();
            }
        }
    }
}