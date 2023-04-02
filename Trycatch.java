import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        try {
            int[] newArray = {1,3,6};
            System.out.println(newArray[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Given value is not present : " + e);
        }
        
        System.out.println("System is steel working");
    }
}
