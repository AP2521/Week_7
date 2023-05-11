package java_program;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even.
public class pg7 {
    public static void input(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter input : ");
        int num = a.nextInt();
        if(num%2==0) {
            System.out.println("Even");}//Declare Even
        else{
            System.out.println("Odd");//Declare odd
        }}

    public static void main(String[] args) {
        input();
    }
}
