//account class to create account instances
public class AccountFactory {
    //static method to return an Account instance
    public static Account makeAccount(int initial, int limit){
        return new AdvancedAccount(initial, limit); // could return different types later
    }
//oop concepts:
//Encapsulation
//Factory Pattern: hides creation logic; can be extended easily
}


