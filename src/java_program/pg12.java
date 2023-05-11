package java_program;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (switch statement).ifany
//other alphabet should be invalid entry.
public class pg12 {
    public static void City(){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter alphabet : ");
        String city = s.next();
        switch (city){
            case "a" :
                System.out.println("AMD");
                break;
            case "b" :
                System.out.println("Bombay");
                break;
            case "c" :
                System.out.println("Channai");
                break;
            case "d" :
                System.out.println("DEL");
                break;
            case "e" :
                System.out.println("Eston");
                break;
            case "f" :
                System.out.println("Farklin");
                break;
            default:
                System.out.println("Invalid Input");

}}

    public static void main(String[] args) {
        City();
    }}
