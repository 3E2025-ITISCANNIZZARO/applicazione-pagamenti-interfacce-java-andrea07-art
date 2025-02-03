public class CreditCardPayment implements PaymentStrategy {
     // Variabile per memorizzare il numero della carta di credito
    private String numeroCarta;
    
    // Costruttore che inizializza il numero della carta di credito
    public CreditCardPayment(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }
    
     // Implementazione del metodo 'pay' definito nell'interfaccia PaymentStrategy
    @Override
    public void pay(double conteggio) {
        // Esegue il pagamento stampando una conferma dell'importo pagato e il numero della carta di credito
        System.out.println("Pagato " + conteggio + " utilizzando carta di credito. Numero carta: " + numeroCarta);
    }
}
