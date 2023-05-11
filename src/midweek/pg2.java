package midweek;
/*
Print multiplication table of 24, 50 and 29 using loop.
 */
public class pg2 {
    public static void table(){
        int a=24,b=50,c=29;
        for(int i=1;i<=10;i++){
            System.out.println(a+" x  "+i+" = "+a*i+"     "+b+" x  "+i+" = "+b*i+"     "+c+" x  "+i+" = "+c*i);
                                      //Table of 24             //Table of 50                //Table of 29
        }
    }
    public static void main(String[] args) {
        table();
    }
}
