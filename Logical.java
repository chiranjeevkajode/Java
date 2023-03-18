// Logical operators
public class Logical {
    public static void main(String[] args) {
        
        boolean isFbLoggin=true;
        boolean isEmail=false;
        boolean isGoogle=true;
           
        // It shows the true if all the condions are true if not false
        System.out.println(isEmail && isFbLoggin);//false
        // It shows true value if any of them is true
        System.out.println(isFbLoggin || isGoogle);//true
        // It covert true value to false or false value to true
        System.out.println(!isEmail);//true
        System.out.println(!isFbLoggin);//false
        System.out.println(!isGoogle);//false
    }
    
}
