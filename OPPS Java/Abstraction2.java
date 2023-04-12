public abstract class Abstraction2 {
        private String name;
        private String tax;
        private double balance;

        public Abstraction2(String name, String tax, double balance){
            this.name=name;
            this.tax = tax;
            this.balance = balance;
        }


        public void greets(){
            System.out.println("Your name is : " + this.name + " and Your balance is: " + this.balance);
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }

        public String getTax(){
            return tax;             
        }
        public void setTax(String tax){
            this.tax = tax;
        }

        public double getBalance(){
            return balance;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
}
