package java_program;

import java.util.Scanner;

/*Write a Java program which input any number between 1 to 7 and it print The Daysname
        MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
        number is out of selection Print message “Week contains 1 to 7 days”*/
public class pg16 {
    public static void weekDays(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enetr a number :");
        String num = s.next();
        if (num.equals("1")){
            System.out.println("Monday");}
        else if (num.equals("2")){
            System.out.println("Tuesday");}
        else if (num.equals("3")){
            System.out.println("Wednesday");}
       else if (num.equals("4")){
            System.out.println("Thursday");}
        else if (num.equals("5")){
            System.out.println("Friday");}
       else if (num.equals("6")){
            System.out.println("Saturday");}
        else if (num.equals("7")){
            System.out.println("Sunday");}
        else {
            System.out.println("Week contains 1 to 7 days");}
    }

    public static void main(String[] args) {
        weekDays();
    }
}
