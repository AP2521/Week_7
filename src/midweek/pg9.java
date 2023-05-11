package midweek;

import java.util.Scanner;

/*
Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */
public class pg9 {
    public static void attendence(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter classes held : ");  //Number of classes held
    double held = s.nextDouble();
    System.out.println("Enter classes attended : ");  //Number of classes attended.
    double attend = s.nextDouble();
    double percentage = (attend/held)*100;  //percentage of class attended
    System.out.println("Percentage of class attended = "+percentage+"%");
    System.out.println("Any Medical cause (Y/N) : ");  //if he/she has medical cause
    String cause = s.next();
    if(cause.equalsIgnoreCase("Y")){
        System.out.println("Student is allowed to sit in exam");}
    else {
        System.out.println("Student is not allowed to sit in exam");}

}

    public static void main(String[] args) {
        attendence();
    }
}
