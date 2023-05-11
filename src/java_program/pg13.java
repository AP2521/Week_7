package java_program;

import java.util.Scanner;

/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/
public class pg13 {
    public static void calculator(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number1 :");
        double num1 = s.nextInt();
        System.out.println("Enter number2 : ");
        double num2 = s.nextInt();
        System.out.println("Enter Symbol : ");
        String symbol = s.next();
        if (symbol.equals("+")){
            System.out.println("addition = "+(num1+num2));} //addition
        else if (symbol.equals("-")){
            System.out.println("Subtraction = "+(num1-num2));}//Subtraction
        else if (symbol.equals("/")){
            System.out.println("Division = "+(num1/num2));}//division
        else if (symbol.equals("*")){
            System.out.println("Multiplication = "+(num1*num2));}//multiplication
        else {
            System.out.println("Enter Valid Symbol : +, -, /, *");}

}

    public static void main(String[] args) {
        calculator();
    }}
