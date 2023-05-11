package java_program;

import java.util.Scanner;

//Write a java program to get numbers from users and print whether it is positive or negative.
public class pg8 {
    public static void num(){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter number : ");//Declare any number
        int num = s.nextInt();

        if(num >= 0){
        System.out.println("Positive");}//Declare positive
        else {
            System.out.println("Negative");//Declare negative
    }}

    public static void main(String[] args) {
        num();
    }
}
