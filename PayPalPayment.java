public class PayPalPayment implements PaymentStrategy {
    // Variabile per memorizzare l'email dell'utente PayPal
    private String email;
    
    // Costruttore che inizializza l'email dell'utente PayPal
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    // Implementazione del metodo "pay" definito in precedenza nel PaymentStrategy
    @Override
    public void pay(double conteggio) {
         // Esegue il pagamento stampando una conferma dell'importo pagato e dell'email associata all'account PayPal
        System.out.println("Pagato " + conteggio + " utilizzando PayPal. Email: " + email);
    }
}