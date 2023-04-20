public class Inheritance extends BankApp {
    public Inheritance( String name){
        super(name);
        System.out.println("constructor inheritence");
    }
    @Override
    public void getUserinfo() {
        // TODO Auto-generated method stub
        super.getUserinfo();
        System.out.println("User tax details :" + taxDetail);
    }
}
