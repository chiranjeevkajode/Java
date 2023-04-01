import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int Reatingclass;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter class rating from 1-10:");
        Reatingclass=in.nextInt();
        switch (Reatingclass) {
            case 1:
                System.out.println("Rating is 1");
                break;
            case 2:
                System.out.println("Rating is 2");
                break;
            case 3:
                System.out.println("Rating is 3");
                break;
            case 4:
                System.out.println("Rating is 4");
                break;
            case 5:
                System.out.println("Rating is 5");
                break;
            case 6:
                System.out.println("Rating is 6");
                break;
            case 7:
                System.out.println("Rating is 7");
                break;
            case 8:
                System.out.println("Rating is 8");
                break;
            case 9:
                System.out.println("Rating is 9");
                break;
            case 10:
                System.out.println("Rating is 10");
                break;
            
            default:
            System.out.println("The rating should be 1 to 10 only.");
                break;
        }
    }
    
}
