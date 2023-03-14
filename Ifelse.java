import java.text.BreakIterator;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        // int num=20;
        // if condition run only if condition is true
        // if (num<10 ){
        //     System.out.println("number is less then 20");

        // }if (num>=20) {
        //     System.out.println("number is equal or greater");
        // }
        // else{
        //     System.out.println("number is greater than 20");
        // }
        int electricity=400;

        int paybill;
        Scanner sc=new Scanner(System.in);
        System.out.println("pay electricity bill : ");
        paybill=sc.nextInt();
        
        if (paybill<=240 || paybill==340) {
            System.out.println("It is good for home");
        }
        if (paybill==400) {
            System.out.println("it will work but not so long");
        }
        else{
            System.out.println("its not good for home");
        }

    }
    
}
