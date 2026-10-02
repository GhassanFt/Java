//Die klass account stellt ein einfaches Bankkonto dar.
//sie enthält Informationen über den Kontoeingeber, die Kontonummer
//und den aktullen Kontozustand. es können ein- und Auszahlungen durchgeführt werden
//woobei auf ausreichendes Guthaben geprüft wird

public class TestAccount {
    public static void main(String[] args) throws Exception {
        //Ersthelle ein Konto für Hans mit einem Startguhaben von 200
        //Instanz
        Account hansAccount = new Account ("Hans", 200);
        //Instanz2: erstelle ein Konto für Olga mit einem Startguthaben von 400
        Account olgAccount = new Account ("Olga", 400);

//hans versucht , 500 abzuheben - das sollter scheitern , da das GH zu gering ist
        hansAccount.withdraw(500);


        olgAccount.withdraw(50);

        //Direkte zugriff auf hassufficientBalance ist nivht erlaubt, da die Methode private ist

        
    }
}
