package midweek;

import java.util.Scanner;

/*
Take two int values from user and print greatest among them.
 */
public class pg5 {
    public static void greatest(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 digit : ");
        double value = s.nextDouble();
        System.out.println("Enter 2 digit : ");
        double value2 = s.nextDouble();
        if(value>value2){
            System.out.println("Digit 1 is greater");}
        else {
            System.out.println("Digit 2 is greater");}
    }

    public static void main(String[] args) {
        greatest();
    }
}
