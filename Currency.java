public class Currency {
    public static String EUR(int amountInCents){
        int euros = amountInCents/100;
        int cents = amountInCents % 100;
        return String.format("%d, %02d" , euros, cents );
    }

}
