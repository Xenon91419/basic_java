import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am an Exception";
    }
    public String getMessage(){
        return "I am getMessage()";
    }

}
public class x32_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }
    }
}
