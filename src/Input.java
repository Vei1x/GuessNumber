import java.util.Scanner;

public class Input {
    private final Scanner sc = new Scanner(System.in);

    public int getMax() {
        System.out.print("Enter max value: ");
        return getGuess();
    }

    public int getMin() {
        System.out.print("Enter min value: ");
        return getGuess();
    }

    public int getGuess() {

        while (true) {
            if (!sc.hasNextInt()) {
                System.out.print("Value has wrong type of symbol" +
                        "\n(value is not a number)" +
                        "\nEnter max value:");
                sc.next();
            } else {
                return sc.nextInt();
            }
        }
    }
}