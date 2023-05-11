package java_program;

import java.util.Scanner;

/*Write if else condition and print your group name in console else others group name.*/
public class pg4 {
    public static void group() {
        //anish ="Java", dhawal="Selenium", maulik="Postman";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name : ");
         String name = s.next();
        if ( name.equalsIgnoreCase("anish" )) {
            System.out.println("Java");
        } else if ( name.equalsIgnoreCase ("maulik") ) {
            System.out.println("Postman");
        } else if ( name.equalsIgnoreCase ("dhawal") ) {
            System.out.println("Selenium");
        } else {
            System.out.println("Invalid group name");
        }
    }
    public static void main(String[] args) {
        group();
    }
}