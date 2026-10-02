//A dummy class that does not implement Account
public class NoAccount {
    //Methods match account but no interface implementation
    public void withdraw(int amount){}
    public void deposit(int amount){}
    public int getBalance(){
        return 0;
    }

}
