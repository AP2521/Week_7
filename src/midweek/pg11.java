package midweek;

import java.util.Scanner;

/*
Write a program to print a string entered by user.
 */
public class pg11 {
    public static void string(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter String : ");
        String a=s.next();
        System.out.println("String  : "+a);
    }

    public static void main(String[] args) {
        string();
    }
}
