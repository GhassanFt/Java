//Main class with entry point and demonstration of polymorphism
public class Interfaces{

    //Simulates a user interacting with any type of account
    public static void user(Account account){
        System.out.println("Balance: " + account.getBalance());
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());

    }
//transfers money from one account to another(generic version)
    public static void transfer(Account from , Account to, int amount){
        from.withdraw(amount);
        to.deposit(amount);
    }

    //overload transfer method for specific account types
    public static void transfer(SimpleAccount from, AdvancedAccount to, int amount){
        System.out.println("you have to pay extra");
        from.withdraw( amount + 5);//extra fee applied
        to.deposit(amount);
    }

    public static void main(String[] args){
        //create an advanced account and a simple account
        var mary = new AdvancedAccount(100000, -20000);//1000000 balance , -200 limit
        var peter = new SimpleAccount(0);//zero balance

        mary.deposit(200); //now 100200
        peter.deposit(200);//now 200
        //print balances
        System.out.println("mary: " + mary.getBalance());
        System.out.println("peter: " + peter.getBalance());
//transfer 13 from mary to peter (uses Account-Account version)
        transfer(mary, peter,13);
        System.out.println("mary: " + mary.getBalance());//100187
        System.out.println("peter: " + peter.getBalance());//213

        //transfer 130 from peter to mary(uses overload SimpleAccount-Advanced Account version)
        transfer(peter, mary,130);
        
        System.out.println("mary: " + mary.getBalance()); //100317
        System.out.println("peter: " + peter.getBalance());//78

        //oop concepts
        //Polymorphism: user() and transfer() work with any Accoun
        //Method Overloading: different behavior for specific types.
        //Encapsulation: balance is private in account calsses.
        //Reusability: code like Transfer can work for many account types.
    } 



    //Abstraction : Account interface hides implementatio details.
    //Encapsulation : Private fields like balance accessed via public methods.
    //inheritance: simpleAccount and AdvancedAccount implement Account
    //Polymorphism: user(Accoun) works with any Account subtype.
    //Method overloading: transfer() methods behave differently based on parameter types.
}


