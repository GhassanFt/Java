//Advanced implementation that includes an overdraft limit

public class AdvancedAccount implements Account {
    private int balance; //account balance
    private int limit;//Lower limit (can be negative for overdraft)

    //Knstr. to intialize balance and limit
    public AdvancedAccount(int initial, int limit){
        this.balance = initial; //
        this.limit = limit;
    }

    //Methoden

    //withdraw money with limit check
    public void withdraw(int amount){
        int newBalance = balance - amount;
        if(newBalance < limit){
            //disallow withdrawal if it exceeds limit
            throw new RuntimeException("Not enough limit.");
        }
        else{
            balance = newBalance;
        }
    }
    //deposite money into account
    public void deposit(int amount){
        balance += amount;
    }

    //return the current balance
    public int getBalance(){
        return balance;
    }


    //oop concepts:
    //Encapsulation and inharitance
    //Behavioral Differance using Polymorphism
}
