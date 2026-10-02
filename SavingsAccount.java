public class SavingsAccount extends BankAccount {
    private final float interestRate;

    public SavingsAccount(int balance, float interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
    public void addIntrest(){
        int interest = Math.round(balance * interestRate);
        balance += interest;

    }
    @Override
    public int calculateMothlyFees(){
        return 500;
    }
}
