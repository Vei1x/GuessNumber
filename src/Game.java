import java.util.Random;

public class Game {
    public void play() {
        Input input = new Input();
        int max = input.getMax();
        int min = input.getMin();

        Random rand = new Random();
        rand.nextInt();
        int number = (int)(Math.random() * (max - min + 1) + min);

        System.out.print("Guess the number: ");
        int guess = -1;
        while (guess != number) {
            guess = input.getGuess();
            if (guess < number)
                System.out.print("Your number is too low\nEnter number: ");
            else if (guess > number)
                System.out.print("Your number is too high\nEnter number: ");
        }

        System.out.println("You win! Random number was " + number);
    }
}