import java.util.Scanner;
public class practice_set_4 {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks obtained in maths=");
        m1 = sc.nextInt();
        System.out.println("Marks obtained in chemistry=");
        m2 = sc.nextInt();
        System.out.println("Marks obtained in physics=");
        m3 = sc.nextInt();
        float avg = (m1+m2+m3)/3.0f;
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }



    }
}
