import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("0 for rock, 1 for paper, 2 for scissor");
        System.out.println("Enter your input:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random ra = new Random();
        int b = ra.nextInt();
        switch (a) {
            case 0 -> System.out.println("You choose rock");
            case 1 -> System.out.println("You choose paper");
            case 2 -> System.out.println("You choose scissor");
        }
        switch (b) {
            case 0 -> System.out.println("You choose rock");
            case 1 -> System.out.println("You choose paper");
            case 2 -> System.out.println("You choose scissor");
        }
        if (a == 0 && b == 0) {
            System.out.println("tie");
        } else if (a == 1 && b == 0) {
            System.out.println("you won");
        } else if (a == 2 && b == 0) {
            System.out.println("you lose");
        } else if (a == 0 && b == 1) {
            System.out.println("you lose");
        } else if (a == 1 && b == 2) {
            System.out.println("you won");
        }
    }
}

