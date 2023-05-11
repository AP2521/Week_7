package java_program;

import java.util.Scanner;

/*
Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
 */
public class pg26 {
    public static void reverse(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = s.next();
        String word2="";
        for(int i=0;i<word.length();i++) {
        word2= word.charAt(i)+word2;}
            System.out.println(word2);
        }




    public static void main(String[] args) {
        reverse();
    }
}

