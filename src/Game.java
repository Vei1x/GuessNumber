import java.util.Random;

public class Game {
    public void play() {
        Input input = new Input();

        int min = input.getMin();
        int max = input.getMax();

        while (max < min) {
            System.out.println("error");
            min = input.getMin();
            max = input.getMax();
        }

        Random rand = new Random();
        rand.nextInt();
        int number = (int) (Math.random() * (max - min + 1) + min);

        System.out.print("\nGuess the number: ");
        int guess = -1;
        while (guess != number) {
            guess = input.getGuess();
            if (guess > max || guess < min)
                System.out.print("Number is out of range(" + min + " : " + max + ")\nEnter number: ");
            else if (guess < number)
                System.out.print("Your number is too low\nEnter number: ");
            else if (guess > number)
                System.out.print("Your number is too high\nEnter number: ");
        }

        System.out.println("You win! Random number was " + number);
    }
}