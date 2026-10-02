public abstract class BankAccount {
    protected int balance; //fleder

    public BankAccount(int balance){ // knstruktor
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid amount");
        }
        else{
            balance += amount;
        }}
        public int balance(){
            return this.balance;
        }

        //Abstract method to be implemented in subclasses
        public abstract int calculateMothlyFees();

        public String report(){
            return "Balance " + Currency.EUR(balance()) + "\n" +
            "Monthly Fee: "  + Currency.EUR(calculateMothlyFees());
        
    }
}
