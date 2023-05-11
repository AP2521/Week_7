package java_program;

import java.util.Scanner;

//Write java program using for loop and print your name 10 times.
public class pg23 {
    public static void name(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = s.next();
        for(int i=0;i<10;i++){
        System.out.println(name);}
    }
    public static void main(String[] args) {
        name();
    }
}
