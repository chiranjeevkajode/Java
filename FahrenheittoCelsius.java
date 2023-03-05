import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        float temprature;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a fahrenheit temprature : ");
        temprature=sc.nextFloat();
        temprature =((temprature-32)*5)/9;
        System.out.println("Temprature in celsius is: " + temprature);
    }
}
