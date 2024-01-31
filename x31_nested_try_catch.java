import java.util.Scanner;

public class x31_nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 73;
        marks[2] = 74;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter array index :");
            int ind = sc.nextInt();
            try{
                System.out.println("hello");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Array out of index");
                    System.out.println("Exception level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception level 1");
            }
        }
        System.out.println("End of the program");
    }
}
