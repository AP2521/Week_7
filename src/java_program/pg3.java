package java_program;
/*Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
public class pg3 {
    public static void CC(){
    //String[][] a=  {{"UK","LON"},{"US","DC"},{"IND","DEL"},{"AUS","CNB"},{"CAN","OTTAWA"}};
String a[][] = new String[5][2];
a[0][0]= "UK";
a[0][1] = "LON";
a[1][0]= "US";
a[1][1]="DC";
a[2][0]="IND";
a[2][1]="DEL";
a[3][0]="AUS";
a[3][1]="CNB";
a[4][0]="CAN";
a[4][1]="OTTAWA";

        for(int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++)
            { System.out.println(a[i][j]);}
            System.out.println();
        }

    }

    public static void main(String[] args) {
        CC();
    }
}
