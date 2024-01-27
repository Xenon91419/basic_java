import java.util.Scanner;

public class x30_exceptionErrors {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 73;
        marks[2] = 74;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the value you want to divide with :");
        int number = sc.nextInt();
        try {
            System.out.println("The value of array index is :" + marks[ind]);
            System.out.println("The value of value/number :" + marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArthmeticException occured" +e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured" +e);
        }
        catch(Exception e){
            System.out.println("Other exception occured" +e);
        }
    }
}
