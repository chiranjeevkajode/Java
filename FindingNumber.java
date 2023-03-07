import java.util.Scanner;

public class FindingNumber {
    public static void main(String[] args) {
        int i;
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        i=sc.nextInt();
        while(i!=0){
            i/=10;
            ++j;

        }
        System.out.println(j);
    }
}
