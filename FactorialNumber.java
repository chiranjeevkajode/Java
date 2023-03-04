import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int number;
        int fact = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        number=sc.nextInt();
        if(number < 0){
            System.out.println("Enter a number greater than 0 : ");
        }else{
            for(int i=1;i<=number;i++){
                fact=fact*i;
            }
        }
        System.out.println("Fectoreal is : " + fact);
    }
}
