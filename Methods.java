public class Methods {
    public static void main(String[] args) {
        System.out.println("hello");
        // sayHello();
        // sayHello();
        // sayHello();
        // sayHello();
        int number1=10;
        int number2=20;
        // int result=minimunNum(number1, number2);
        // System.out.println(result);
        System.out.println(minimunNum(number1, number2));
    }
    public static void sayHello(){
        System.out.println("Hello java");
        System.out.println("Hello Chiranjeev");
    }
    public static int minimunNum(int num1,int num2){
        int minimun;
        if(num1>num2){
            minimun=num2;
        }else{
            minimun = num1;
        }
        return minimun;
    }
}
