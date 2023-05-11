package java_program;

import java.util.Arrays;

/*
Write a Java program to sum values of an array.
 */
public class pg21 {
    public static void sum(){
    int a[]=new int[5];
    a[0]=1;
    a[1]=2;
    a[2]=3;
    a[3]=4;
    a[4]=5;
    System.out.println("Sum of arrays :"+ Arrays.stream(a).sum());//Declare sum
}

    public static void main(String[] args) {
        sum();
    }}
