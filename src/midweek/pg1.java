package midweek;

import java.util.Arrays;

/*
Take 10 integers from keyboard using loop and print their average value on the
screen.
 */
public class pg1 {
    public static void main(String[] args) {
        pg1 a =new pg1();
        a.average();
    }
    public void average(){
        int[] a={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);}
            System.out.println("Average value : "+Arrays.stream(a).sum()/ a.length);
        }
    }


