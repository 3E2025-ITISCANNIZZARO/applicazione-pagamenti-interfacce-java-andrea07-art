public class Main {
    public static void main(String[] args) {
        // viene creato un carrello contenente l'importo totale
        ShoppingCart cart = new ShoppingCart(100.0);

        // viene selezionato il metodo di pagamento utilizzando la carta di credito
        PaymentStrategy creditCardPayment = new CreditCardPayment("1798-3490-2391-6510");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(); //rappresenta l'inizio di un acquisto da parte dell'utente

        System.out.println("-----------");

        // viene selezionato il metodo di pagamento utilizzando PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout();
    }
}