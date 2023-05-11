package midweek;
/*
Write an infinite loop.
A infinite loop never ends. Condition is always true.
 */
public class pg3 {
    public static void infinite(){
        int i=0;
        do {
            System.out.println("Hello world");
            i++; }while (true);
    }

    public static void main(String[] args) {
        infinite();
    }
}
