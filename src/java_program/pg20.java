package java_program;

import java.util.Arrays;

/*
Write a Java program to sort a numeric array and a string array.
 */
public class pg20 {
    public static void numeric(){
String Program[] ={"java","postman","selenium","C","C++"};
int a[]=new int[5];
a[0]=2;
a[1]=4;
a[2]=9;
a[3]=8;
a[4]=1;
        System.out.println("Original Int Array : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted Int Array  :"+Arrays.toString(a));

        System.out.println("Original String Array : "+Arrays.toString(Program));
        Arrays.sort(Program);
        System.out.println("Sorted String Array : "+Arrays.toString(Program));


//for (int i=0;i< a.length;i++){

    }



    public static void main(String[] args) {
        numeric();
    }
}
