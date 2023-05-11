package java_program;

import java.util.Scanner;

//Write java program using for loop and print surname 9 times.
public class pg24 {
    public static void lastName(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter LastName : ");
        String lastname = s.next();
        for(int i=0;i<9;i++){
            System.out.println(lastname);}
    }
    public static void main(String[] args) {
        lastName();
    }
}
