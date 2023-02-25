// compare two number
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class comparenumber {
    public static void main(String[] args) {
        long i;
        long j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First no : ");
        i =sc.nextLong();
        System.out.println("Enter second no : ");
        j =sc.nextLong();
        // if(i>j){
        //     System.out.println("First number is greater!");
           
        // }
        // if (i<j) {
        //         System.out.println("Second number greater!");
        // }
        if (i>j) {
            System.out.println(i + "is greater than" + j);
        }
        else if (i<j) {
            System.out.println(j + "is grater than" + i);
        }else{
            System.out.println( "Both are equal");
        }
    }
}
