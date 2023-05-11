package java_program;
//Write a java program to print the numbers between 1 to 100 which can be divided by 3and
//5 separately.
public class pg14 {
    public static void num(){
        System.out.println("Number Divided by 3 : ");//Declare numbers divide by 3
        for(int i = 0;i<=100;i++)
        if (i%3==0){
            System.out.println(i);}

        System.out.print("Number Divided by 5 : ");//Declare numbers divide by 5
        for(int i = 0;i<=100;i++)
            if (i%5==0){
                System.out.print(i);} }

    public static void main(String[] args) {
        num();

    }
}
