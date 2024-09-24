/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowcoupling;

/**
 *
 * @author fa22-bse-082
 */
// PaymentMethod
interface PaymentMethod {
    void processPayment(double amount);
}

// CreditCardPayment.java
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPalPayment.java
class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// PaymentProcessor.java
class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    // Dependency Injection through constructor
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}

// Main.java
public class LowCoupling {
    public static void main(String[] args) {
        // Using Credit Card Payment
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCard);
        creditCardProcessor.makePayment(100.0);

        // Using PayPal Payment
        PaymentMethod payPal = new PayPalPayment();
        PaymentProcessor payPalProcessor = new PaymentProcessor(payPal);
        payPalProcessor.makePayment(150.0);
    }
}
