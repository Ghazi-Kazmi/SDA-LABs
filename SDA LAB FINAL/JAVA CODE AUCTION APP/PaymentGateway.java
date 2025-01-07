public class PaymentGateway {

    public boolean processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
        return true; // Simulates a successful payment
    }

    public boolean refund(String transactionId) {
        System.out.println("Refund issued for transaction: " + transactionId);
        return true; // Simulates a successful refund
    }
}
