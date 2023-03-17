// Leap Year cheak whether its a leap year or not 

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  no. to cheak leap year : ");
        year =sc.nextInt();
        if((year % 400 ==0 )||(year % 4==0 && year % 100 !=0)){
            System.out.println(year + "its a leap year");
        }else{
            System.out.println("its not a leap year");
        }
    }
}
