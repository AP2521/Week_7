package java_program;

import java.util.Scanner;

/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
 */
public class pg19 {
    public static void number(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = s.nextInt();
        if (num>=1){
            System.out.println("Positive"); }
        else if (num<0){
            System.out.println("Negative"); }
        else {
            System.out.println("Zero");}
    }
    public static void main(String[] args) {
        number();
    }
}
