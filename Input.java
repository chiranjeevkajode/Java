// package javacore;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        int firstinput;
        int secondinput;
        int result;

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter first number : ");
        firstinput = sc.nextInt();

        System.out.print("Enter second number : ");
        secondinput =sc.nextInt();

        System.out.print("This is your added result : ");

        result = firstinput + secondinput;
        System.out.println(result);


    }
}
