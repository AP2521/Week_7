package midweek;

import java.util.Scanner;

/*
Take input of age of 3 people by user and determine oldest and youngest among
them.
 */
public class pg7 {
    public static void age(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter age1 : ");
        int age1 = s.nextInt();
        System.out.println("Enter age2 : ");
        int age2 = s.nextInt();
        System.out.println("Enter age3 : ");
        int age3 = s.nextInt();
        if (age1<age2 && age1<age3){
            System.out.println("age1 is Youngest");}
        else if (age2<age1 && age2<age3)
        {System.out.println("age2 is Youngest");}
        else if (age3<age1 && age3<age2)
        {System.out.println("age3 is Youngest");}
        else {
            System.out.println("You are old");}
    }

    public static void main(String[] args) {
        age();
    }
}
