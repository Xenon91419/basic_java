import java.util.Scanner;
public class USER_INPUT {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1");
//        float a = sc.nextFloat();
//        int a = sc.nextInt();
//        System.out.println("enter number 2");
//        float b = sc.nextFloat();
//        float sum = a+ b;
//        int b = sc.nextInt();
//        int sum = a+ b;
//        System.out.println("the sum of these numbers is");
//        System.out.println(sum);
//        String a = sc.nextLine();
//        System.out.println(a);
        boolean a = sc.hasNextFloat();
        System.out.println(a);

    }
}
