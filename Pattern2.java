import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int pattern;
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        pattern = sc.nextInt();
        // for (int i = 0; i < pattern; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < pattern; i++) {
        //     for (int j=2*(pattern-i); j>=0; j--)         
        //     {  
        //     //prints space between two stars      
        //     System.out.print(" ");   
        //     }   
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        for (int i = 0; i < pattern; i++)   
        {  
        int number = 1;  
        System.out.printf("%" + (pattern - i) * 2 + "s", "");  
        for (int j = 0; j <= i; j++)   
        {  
        System.out.printf("%4d", number);  
        number = number * (i - j) / (j + 1);  
        }  
        System.out.println();  
        }  
    }
}
