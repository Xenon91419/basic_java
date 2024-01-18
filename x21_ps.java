package com.company;

import java.util.Scanner;

class calculator{
    public void calculate(int a,int b){
        System.out.println("Your result is :" + (a+b));
    }
}
class sccalculator{
    public void calculate(int a,int b){
        System.out.println("Your result is :" + Math.sin(a+b));
    }
}
class hycalculator{
    public void calculate(int a,int b){
        System.out.println("Your result is :" + Math.sin(a+b));
        System.out.println("Your result is :" + Math.cos(a+b));
    }
}
class user_Input{
    public void print1(){
        System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a+ " hello sir!");
    }
}

public class x21_ps {
    public static void main(String[] args) {
        calculator a = new calculator();
        a.calculate(23,34);
        user_Input u = new user_Input();
        u.print1();
    }
}
