package java_program;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
//other alphabet should be invalid entry.
public class pg11 {
    public static void City(){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter alphabet : ");
        String alpha = s.next();
        if(alpha.equalsIgnoreCase("a")){
            System.out.println("AMD");}
        else if (alpha.equalsIgnoreCase("b")){
            System.out.println("Bombay");    }
        else if (alpha.equalsIgnoreCase("c")){
            System.out.println("Chennai");    }
        else if (alpha.equalsIgnoreCase("d")){
            System.out.println("DEl");    }
        else if (alpha.equalsIgnoreCase("e")){
            System.out.println("Eston");    }
        else if (alpha.equalsIgnoreCase("f")){
            System.out.println("Franklin");    }
        else {
            System.out.println("Invalid entery Enter between A to Z");}
}

    public static void main(String[] args) {
        City();
    }}
