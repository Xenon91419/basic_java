import java.util.Scanner;

class MaxInputException extends Exception{
    public String toString() {
        return "You have exceeded the maximum limit";
    }
}
class InvalidInputException extends Exception{
    public String toString(){
        return "Can't calculate 8 or 9 input";
    }
}
class MaxMultiplyInputException extends Exception{
    public String toString() {
        return "You have reached the maximum multiply limit";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "You can't divide number with zero";
    }
}
class calculator {
    double addition(double a, double b) throws MaxInputException,InvalidInputException  {
        if(a == 8 || b ==9){
            throw new InvalidInputException();
        }
        if(a >= 100000 || b >= 100000) {
            throw new MaxInputException();
        }
        return a + b;
    }

    double subtraction(double a, double b) throws MaxInputException,InvalidInputException  {
        if(a == 8 || b ==9){
            throw new InvalidInputException();
        }
        if (a >= 100000 || b >= 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiplication(double a, double b) throws MaxInputException,InvalidInputException,MaxMultiplyInputException  {
        if(a >= 7000 || b >= 7000){
            throw new MaxMultiplyInputException();
        }
            if(a == 8 || b ==9){
                throw new InvalidInputException();
            }
            if(a >= 100000 || b >= 100000) {
                throw new MaxInputException();
            }
        return a * b;
    }

    double division(double a, double b) throws MaxInputException,InvalidInputException,CannotDivideByZeroException  {
        if(b == 0){
            throw new CannotDivideByZeroException();
        }
        if(a == 8 || b ==9){
            throw new InvalidInputException();
        }
        if(a >= 100000 || b >= 100000) {
            throw new MaxInputException();
        }
        return a / b;
    }
}

public class x35_custom_Calculator {

    public static void main(String[] args) throws Exception {
        calculator c = new calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a :" );
        double a = sc.nextDouble();
        System.out.println("Choose operation(+ , - , * , /) :");
        char operation = sc.next().charAt(0);
        System.out.println("Enter a number b :" );
        double b = sc.nextDouble();
        double result;
        switch (operation){
            case '+' :
                result = c.addition(a,b);
                break;
            case '-' :
                result = c.subtraction(a,b);
                break;
            case '*' :
                result =c.multiplication(a,b);
                break;
            case '/' :
                result = c.division(a,b);
                break;
            default:
                System.out.println("Invalid input.");
                return;
        }
        System.out.println("result :" + result);
    }
}
