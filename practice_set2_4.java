import java.util.Scanner;
public class practice_set2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter v:");
        float v = sc.nextFloat();
        System.out.println("enter u:");
        float u = sc.nextFloat();
        System.out.println("enter a:");
        float a = sc.nextFloat();
        System.out.println("enter s:");
        float s = sc.nextFloat();
        float answer = (v*v - u*u)/2*a*s;
        System.out.println("answer:");
        System.out.println(answer);
        /*float v = 56;
        float u = 45;
        float a = 87;
        float s = 45;
        float answer = (v*v - u*u)/2*a*s;
        System.out.println(answer); */
    }
}
