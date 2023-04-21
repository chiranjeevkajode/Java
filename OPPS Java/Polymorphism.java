class Banker{
    private String name;

    public Banker(String name){
        this.name = name;
    }

    public String greet(){
        return "Greeting \n";
    }

}

class Bank1 extends Banker{
    public Bank1(){
        super("Bank");
    }

    @Override
    public String greet(){
        return "Welcome to bank \n";
    }    
} 

class Bank2 extends Banker{
    public Bank2(){
        super("Big Bank");
    }

    @Override
    public String greet(){
        return "Welcome to Big Bank \n";
    }
}

class Bank3 extends Banker{
    public Bank3(){
        super("Next Branch");
    }

    @Override
    public String greet(){
        return "Welcome to Branch\n ";
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            Banker banker = NewObject();
            System.out.println("Bank Greet is: " + banker.greet());
        }
    }

    public static Banker NewObject(){
        int random = (int) (Math.random()*3) + 1;
        // System.out.println(random);
        switch(random){
            case 1:
                return new Bank1();
                // break;
            case 2:
                return  new Bank2();
                // break;   
            case 3:
                return new Bank3();
                // break;    
            default:
                return null;
                // break;    
        }
    }

}



