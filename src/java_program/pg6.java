package java_program;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
 */

import java.util.Scanner;

public class pg6 {
    public static void salary(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee id : ");
        int id = s.nextInt();
        System.out.println("Enter employee name : ");
        String name =  s.next();
        System.out.println("Enter basic salary : ");
        double salary = s.nextInt();
        double HRA = 10%salary;
        double DA = 8%salary;
        double TA = 9%salary;
        double PF = 20%salary;
        double grossSalary = salary+HRA+TA+DA-PF;

        System.out.println("_______________________________");
        System.out.println("|         SALARY SLIP         |");
        System.out.println("|-----------------------------|");
        System.out.println("| Employee id     :   "+id+"       |");
        System.out.println("| Employee Name   : "+name+"     |");
        System.out.println("|-----------------------------|");
        System.out.println("| Basic Salary    :"+salary+"     |");
        System.out.println("| HRA 10%         :"+HRA+"       |");
        System.out.println("| TA 8%           :"+TA+"        |");
        System.out.println("| DA 9%           :"+DA+"        |");
        System.out.println("| PF-20%          :"+PF+"       |");
        System.out.println("|-----------------------------|");
        System.out.println("| Gross Salary   :"+grossSalary+"      |");
        System.out.println("|=============================|");
    }
    public static void main(String[] args) { salary();
    }
}
