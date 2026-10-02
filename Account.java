//Interface representing a generic bank account
public interface Account {
    void withdraw(int amount);  //Method to withdraw money from the account
    void deposit(int amount); //Method to deposite money into the account
    int getBalance(); //method to get the current balance

            //oop concepts
    //Abstraction: defines what an account can do, but not how.
    //Promotes polymorphism(different account types can behave differently)
}
