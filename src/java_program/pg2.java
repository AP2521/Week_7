package java_program;
/*
Declare array and store any 5 countries and print them in console.
 */
public class pg2 {

    public static void countries(){
        String [] a ={"UK","US","IND","AUS","CAN"};//Declare 5 Countries

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]); }
}
    public static void main(String[] args) {
        countries();
    }

}
