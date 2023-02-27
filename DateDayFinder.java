import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date from (1-31): ");
        int dd = sc.nextInt(); 

        System.out.println("Enter month from (1-12): ");
        int mm = sc.nextInt()-1; 
        System.out.println("Enter year: ");
        int yy = sc.nextInt(); 

        Date date = (new GregorianCalendar(dd, mm, yy)).getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String day = sdf.format(date);
        System.out.println(day);
    }
}
