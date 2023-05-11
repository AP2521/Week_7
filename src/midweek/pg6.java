package midweek;

import java.util.Scanner;

/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
public class pg6 {
    public static void grading(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Marks : ");
        double marks = s.nextDouble();
        if(marks<25){
            System.out.println("Grade F");} //Below 25 - F
        else if(marks>25 && marks<45){
            System.out.println("Grade E");}  //25 to 45 - E
        else if(marks>45 && marks<50){
            System.out.println("Grade E");}  //45 to 50 - D
        if(marks>50 && marks<60){
            System.out.println("Grade C");}  //50 to 60 - C
        if(marks>60 && marks<80){
            System.out.println("Grade B");}  //60 to 80 - B
        if(marks>80 && marks<=100){
            System.out.println("Grade A");}  //Above 80 - A
    }

    public static void main(String[] args) {
        grading();
    }
}
