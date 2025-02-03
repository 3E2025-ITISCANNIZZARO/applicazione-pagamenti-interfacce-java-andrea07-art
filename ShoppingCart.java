public class ShoppingCart {
    // Variabile per memorizzare il totale dell'importo nel carrello
    private double totalConteggio;
    // Variabile per memorizzare la strategia di pagamento selezionata
    private PaymentStrategy paymentStrategy;

    // Costruttore che inizializza l'importo totale del carrello
    public ShoppingCart(double totalConteggio) {
        this.totalConteggio = totalConteggio;
    }
    
     // Metodo per impostare la strategia di pagamento da utilizzare
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    // Metodo per eseguire il pagamento utilizzando il metodo selezionato
    public void checkout() {
         // Verifica se è stata inserita una strategia di pagamento
        if (paymentStrategy != null) {
             // Se è stata inserita una strategia di pagamento, viene eseguito il pagamento 
            paymentStrategy.pay(totalConteggio);
        } else {
              // Se non è stata inserita una strategia di pagamento, il pagamento non viene effettuato ed esce un messaggio di errore
            System.out.println("Non è stata scelta alcuna strategia di pagamento.");
        }
    }
}