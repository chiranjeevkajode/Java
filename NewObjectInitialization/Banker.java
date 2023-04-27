package NewObjectInitialization;

public class Banker {
    private String customerName;
    private Double customerBalance;

    public Banker(String customerName, Double customerBalance){
        this.customerName = customerName;
        this.customerBalance = customerBalance;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setcustomerName (String customerName){
        this.customerName = customerName;
    }
    public Double getCustomerBalance(){
        return customerBalance;
    }
    public void setcustomerBalance (Double customerBalance){
        this.customerBalance = customerBalance;
    }
}
