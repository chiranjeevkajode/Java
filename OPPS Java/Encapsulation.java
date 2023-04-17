import java.lang.reflect.Constructor;

// Getter and Setter

public class Encapsulation {
    public static void main(String[] args) {
        test ByBank = new test("mohan", 23, 12435);
        // ByBank.name="Mohan";
        // ByBank.age=34;
        // ByBank.accountNo=1246846867;
        // System.out.println( ByBank.name);
        // System.out.println( ByBank.age);
        // System.out.println( ByBank.accountNo);
        ByBank.setAge(24);
        System.out.println(ByBank.getAge());
        ByBank.setName("Rahul");
        System.out.println(ByBank.getName());
        ByBank.setAccountNo(146823);
        System.out.println(ByBank.getAccountNo());
    }
}

class test {
    private String name;
    private int age;
    private long accountNo;

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int myAge) {
        age = myAge;
    }

    public test(String name, int age, int accountNo) {
        this.name = name;
        this.age = age;
        this.accountNo = accountNo;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        name=name;
    }

    public long getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(long accountNo){
        accountNo=accountNo;
    }
}