package midweek;

import java.util.Scanner;

/*
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */
public class pg8 {
    public static void attendence(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter classes held : ");  //Number of classes held
        double held = s.nextDouble();
        System.out.println("Enter classes attended : ");  //Number of classes attended.
        double attend = s.nextDouble();
        double percentage = (attend/held)*100;  //percentage of class attended
        System.out.println("Percentage of class attended = "+percentage+"%");
        if(percentage>75){
            System.out.println("Student is allowed to sit in exam");}
        else {
            System.out.println("Student is not allowed to sit in exam");}

    }

    public static void main(String[] args) {
        attendence();
    }
}
