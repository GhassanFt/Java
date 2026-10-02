//simple implementation of bank account
public class SimpleAccount implements Account{
    private int balance; // Encapuslated field for sorting balance

    //Konstruktor to intialize the account
    public SimpleAccount(int initial){
        this.balance = initial;
    }
    //Withdraws money without any limit check
    public void withdraw(int amount){
        balance-= amount;
    }
    //Deposite money ito account
    public void deposit(int amount){
        balance += amount;
    }
    //returns the current balance
    public int getBalance(){
        return balance;
    }

    //oop concepts
    //Encapsulation: Balance is private and accessed via methods.
    //Implements Interface: Inharits from Account

}
