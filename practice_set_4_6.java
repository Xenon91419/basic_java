import java.util.Scanner;
public class practice_set_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        year = year%4;
        if (year == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("normal year");
        }
    }
}
