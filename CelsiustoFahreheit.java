import java.util.Scanner;

public class CelsiustoFahreheit {
    public static void main(String[] args) {
        int temprature;        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a celsius temprature: ");
        temprature= sc.nextInt();
        temprature=(temprature*9/5)+32;
        System.out.println("Temprature in fahrenheit is : " +temprature);
    }
}
