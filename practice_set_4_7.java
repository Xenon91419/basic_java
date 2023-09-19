import java.util.Scanner;
public class practice_set_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("organisation website");
        }
        else if (website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("indian website");
        }

    }
}
