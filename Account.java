public class Account {
    private static int counter = 1; //Automatisch Vergabe von Kontonnummern
    private int KontoNum ;
    private float KontoBalance;
    private String KontoOwner;

    //Konstruktor für die Erstellung eines neuen Kontos.
    public Account(final String KontoOwner, float KontoBalance){
        this.KontoOwner = KontoOwner;
        this.KontoBalance = KontoBalance;
        this.KontoNum = counter++;
    }
    public void withdraw(float amount){//method withdraw
        if(!hassufficientBalance(amount)){
            System.out.println(KontoOwner  + " unzureichendes Guthaben");
            return;
        }
        else{
            this.KontoBalance -= amount;
            System.out.println(KontoOwner + " neuer Kontostand: " + KontoBalance); 
        }}
        //Führt ein Einzahlung auf gas Konto durch
        //parameter amount der eingezahlt werden soll
        public void deposite(float amount){
            if(amount <= 0){
                System.out.println(" Ungultiger Einzahlungsbetrag");
            }
            else{
                this.KontoBalance += amount;
                System.out.println(KontoOwner + "eingezahlt" + amount + "neuer Kontostand: " + KontoBalance);
            }
        
            }
// prüft, ob genügend Guthabe für eine Abhebung vorhanden ist
// parameter amount, Der abzuhebende Betrag
//return true: wenn genügend Guthaben vorhanden ist, sonst flase
    private boolean hassufficientBalance(float amount){
        return this.KontoBalance >= amount;
    }}
