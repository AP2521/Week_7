package java_program;

import java.util.Scanner;

/*Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/
public class pg1 {


public static void output(){ //method 2
    Scanner a = new Scanner(System.in);
    System.out.println("Enter num : ");
    int d = a.nextInt();

    String n = (d%2==0)?"Even":"Odd";//Declare even or odd
    System.out.println(n);
}
   public static void main(String[] args) {

        output();
    }
}
