import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        while(num<=100){
            System.out.println(num);
            num++;
            
        }
        System.out.println("This number is not valide.");
    }
    
}
