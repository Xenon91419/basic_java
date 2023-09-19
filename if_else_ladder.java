import java.util.Scanner;
public class if_else_ladder {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age=");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are an adult");
                break;
            case 21:
                System.out.println("you are elligible to get a job");
                break;
            case 60:
                System.out.println("you are getting retired");
                break;
            default:
                System.out.println("enjoy your life");
                break;
        }








//        if (age > 56) {
//            System.out.println("you are experinced");
//        } else if (age > 46) {
//            System.out.println("you are semi experinced");
//        } else if (age > 30) {
//            System.out.println("you are semi semi experinced");
//        } else {
//            System.out.println("you are not experinced");
//        }
    }
}