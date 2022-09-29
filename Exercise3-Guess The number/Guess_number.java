import java.util.Random;
import java.util.Scanner;

class Game {
    int rand;
    int num_of_guess;

    public Game() {
        Random comp = new Random();
        rand = comp.nextInt(100);
    }

    public int user_input() {
        int user;
        Scanner guess = new Scanner(System.in);
        System.out.println("Enter your guess:");
        user = guess.nextInt();
        return user;
    }

    public boolean iscorrectnumber() {
        boolean a = false;
        int user_input = user_input();
        if (rand == user_input) {
            System.out.println("Congrats! You guess correct number");
            a = false;
        } else if (rand < user_input) {
            System.out.println("You guess it wrong");
            System.out.println("Guess a smaller number");
            a = true;
        } else if (rand > user_input) {
            System.out.println("You guess it wrong");
            System.out.println("Guess a bigger number");
            a = true;
        }
        return a;

    }

    public void setNum_of_guess() {
        num_of_guess = num_of_guess + 1;
    }
}

public class Guess_number {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("#############<--Welcome to the random guess game-->#############");
        System.out.println("Enter your name: ");
        String name = n.nextLine();
        Game Guess = new Game();

        boolean win = true;

        while (win == true) {
            System.out.println("Guess a number between 1 to 100");
            win = Guess.iscorrectnumber();

            Guess.setNum_of_guess();
        }
        System.out.printf("%s you guess correct number in %d guesses", name, Guess.num_of_guess);
        System.out.println("Thanks for playing this game:");
    }
}
