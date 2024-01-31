import java.util.Scanner;

public class x34_ps {
    public static void main(String[] args) {
//        System.out.println(java);
//        Syntax error;
//        int a = 34;
//        int b = 0;
//        int age = 34;
//        int yearBorn = 2000-34;
//        logical error to fine year born we havee to subtract the age from current year.
//        int c = a/b;
//        runtime error cz b is 0 so the program will never stop running.
//        prob 2
//        try {
//            System.out.println(6/0);
//        }
//        catch(ArithmeticException e){
//            System.out.println("haha");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("hehe");
//        }
//        prob 3
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the array index");
        int arr[] = {3,4,5,6,7,8};
        int i= 0;
        boolean flag;
        while(true && i<5) {
            try {
                System.out.println(arr[a]);
            } catch (Exception e) {
                System.out.println("Error");
                i++;
            }
            break;
        }
    }
}
