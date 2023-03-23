public class Pattern {
    public static void main(String[] args) {
        
        //1. Its for star pattern from 1 to 5
        // for(int i=1;i<=5;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Output 
        // *
        // **
        // ***
        // ****
        // *****
        // 2. Pattern start with 5* and end with 1*
        // for(int i=5;i>0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // output 
        // *****
        // ****
        // ***
        // **
        // *
        // 3. Pattern start with 1to5 and end with 1
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
        // output 
        // 12345
        // 1234
        // 123
        // 12
        // 1
    }
}
