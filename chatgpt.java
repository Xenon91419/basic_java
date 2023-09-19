import java.util.Random;
import java.util.Scanner;

public class chatgpt {
    public static void main(String[] args) {
        System.out.println("0 for rock, 1 for paper, 2 for scissors");
        System.out.println("Enter your input:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random ra = new Random();
        int b = ra.nextInt(3); // Generate a random number between 0 and 2

        switch (a) {
            case 0 -> System.out.println("You choose rock");
            case 1 -> System.out.println("You choose paper");
            case 2 -> System.out.println("You choose scissors");
        }
        switch (b) {
            case 0 -> System.out.println("Computer chooses rock");
            case 1 -> System.out.println("Computer chooses paper");
            case 2 -> System.out.println("Computer chooses scissors");
        }
        if (a == b) {
            System.out.println("It's a tie");
        } else if ((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
