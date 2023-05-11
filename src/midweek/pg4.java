package midweek;

import java.util.Scanner;

/*
Take values of length and breadth of a rectangle from user and check if it is square or not.
 */
public class pg4 {
    public static void Square(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length : ");
        double length = s.nextDouble();
        System.out.println("Enter breadth : ");
        double breadth = s.nextDouble();
        if(length==breadth){
            System.out.println("Square");}
        else {
            System.out.println("Rectangle");
        }
    }

    public static void main(String[] args) {
        Square();
    }
}
