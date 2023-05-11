package java_program;

import java.util.Arrays;

/*
Write a Java program to calculate the average value of array elements.
 */
public class pg22 {
    public static void average(){
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        System.out.println("Average value of Array :"+(Arrays.stream(a).sum())/5);//Declare Average
    }
    public static void main(String[] args) {
        average();
    }

}
