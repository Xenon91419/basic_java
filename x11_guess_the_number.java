import java.util.Random;
import java.util.Scanner;

class Game1{
    public int number;
    public int numberOfGuesses = 0;
    public int inputNumber;
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }
    Game1(){
        Random ra = new Random();
        this.number = ra.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();
    }
    Boolean isCorrectNumber() {
        numberOfGuesses++;
        if (inputNumber == number) {
            System.out.format("you are right %d\n you guessed it in %d attempts ", number,numberOfGuesses);
            return true;
        }
        else if(inputNumber>number){
            System.out.println("the number is too high");
        }
        else if(inputNumber<number){
            System.out.println("the number is too low");
        }
        return false;
    }
}
public class x11_guess_the_number {
    public static void main(String[] args) {
        Game1 g = new Game1();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
