package midweek;

import java.util.Scanner;

/*
Write a program to print the sum of two numbers entered by user by defining your
own method.
 */
public class pg10 {
    public static void sum(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        double num1 = s.nextDouble();          //Declare number 1
        System.out.println("Enter number 2 : ");
        double num2 = s.nextDouble();         ////Declare number 2
        System.out.println("Sum of both no. = "+(num1+num2)); } //Sum of both number

    public static void main(String[] args) {
        sum();
    }
}
