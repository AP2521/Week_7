package java_program;

import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/
public class pg10 {
    public static void Info(){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter seller's id : ");
      int id = s.nextInt();                         //sales id
       System.out.println("Enter seller's name : ");
        String name = s.next();                    //seller's name
        System.out.println("Enter salary basic : ");
        int basicSalary = s.nextInt();             //salary basic
        System.out.println("Enter sales amount : ");
        int sales = s.nextInt();                  //sales amount
        if(sales>=50000){                         //Commission
            double a = 35%sales;
            System.out.println("Commission : "+a+"%");
        }else if (sales < 50000 && sales>=30000){ double a = 20%sales;
            System.out.println("Commission : "+a+"%");
    }else if (sales < 30000 && sales>=20000){ double a = 10%sales;
            System.out.println("Commission : "+a+"%");}
        else if (sales < 20000 && sales>=10000){ double a = 5%sales;
            System.out.println("Commission : "+a+"%");}
        else if (sales < 10000){ double a = 2%sales;
            System.out.println("Commission : "+a+"%");}
        else {
            System.out.println("Invalid amount");}}

    public static void main(String[] args) {
        Info();
    }
}
