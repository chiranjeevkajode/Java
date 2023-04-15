public class BankApp{
    String name;
    int age;
    String taxDetail;
    double ammount;


    //constuctor
    public BankApp(String name){
        this.name=name;
        System.out.println("Constructor clled");
    }

    // user age
    public void userAge(int age){
        this.age = age;
    }
     
    // user tax details

    public void userTax(String taxDetail){
        this.taxDetail = taxDetail;
    }

    // user account details 

    public void account(double ammount){
        this.ammount = ammount;
    }

    public void getUserinfo(){
        System.out.println("Name of user is: " + name);
        System.out.println("user deposite is: " + ammount);
    }

    
}