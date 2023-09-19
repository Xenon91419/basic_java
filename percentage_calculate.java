import java.util.Scanner;
public class percentage_calculate {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mathematics number out of 20");
        int a = sc.nextInt();
        System.out.println("enter science number out of 20");
        int b = sc.nextInt();
        System.out.println("enter social number out of 20");
        int c = sc.nextInt();
        System.out.println("enter english number out of 20");
        int d = sc.nextInt();
        System.out.println("enter hindi number out of 20");
        int e = sc.nextInt();
        int total = a+ b + c + d + e;
        int percentage = (total*100)/100;
        System.out.println(total);
        System.out.println("total percentage obtained");
        System.out.println(percentage);


    }
}
