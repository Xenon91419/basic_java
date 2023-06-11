import java.util.Scanner;
public class km_to_miles {
    public static void main(String[] args) {
        System.out.println("Enter kms");
        Scanner a = new Scanner(System.in);
        float kms = a.nextFloat();
        System.out.println(kms*1.609344);
    }
}
