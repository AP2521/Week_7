package java_program;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet orsymbol.
public class pg15 {
    public static void pg(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter input : ");
      char i = s.next().charAt(0);
        if(i >= '0' && i <= '9' ){
            System.out.println("Number");
        } else if (i >= 'a' && i <= 'z' || i >='A' && i <='Z'){
            System.out.println("Alphabet");}
          else {  System.out.println("Symbol");}
    }

    public static void main(String[] args) {
        pg();
    }
}
