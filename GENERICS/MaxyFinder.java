import java.util.Scanner;

public class MaxyFinder {

    public static <T extends Comparable <T>> T maxy ( T x, T y, T z){
        T maxy = x;

        if (y.compareTo(maxy) > 0) {
            maxy = y;
        }

        if (z.compareTo(maxy) > 0) {
            maxy = z;
        }
        return maxy;
    }

    public static void main(String[] args) {

        // int a,b,c;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter First number: ");
        // a = sc.nextInt();
        // System.out.println("Enter Second number: ");
        // b = sc.nextInt();
        // System.out.println("Enter Third number: ");
        // c = sc.nextInt();
        // System.out.printf("Max of is %d ", maxy(a,b,c));
        System.out.printf("maxy is %s", maxy("Narayan", "Mukesh", "Gopal"));
        HolderClass<String> stringValue = new HolderClass<>();
        stringValue.setMyVar(new String("\nHEllo All"));
        System.out.println(stringValue.getMyVar());

        HolderClass<Integer> integerValue = new HolderClass<>();
        integerValue.setMyVar(new Integer(4));
        System.out.println(integerValue.getMyVar());
    }
}
