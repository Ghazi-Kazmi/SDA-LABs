import java.util.Date;

public class AnalyticsService {
    private AnalyticsDatabase database = new AnalyticsDatabase();
    private PaymentGateway paymentGateway = new PaymentGateway();

    public void logEvent(String eventId, String eventType) {
        Event event = new Event(eventId, eventType, new Date());
        database.storeEvent(event);
    }

    public Report generateReport(Date startDate, Date endDate) {
        String reportId = "R" + System.currentTimeMillis();
        Report report = new Report(reportId, startDate, endDate);
        database.storeReport(report);
        System.out.println("Report generated with ID: " + reportId);
        return report;
    }

    public void storeAnalytics() {
        System.out.println("Storing analytics data...");
        // Simulate storing additional data
    }

    public void handlePayment(double amount, String currency) {
        boolean success = paymentGateway.processPayment(amount, currency);
        if (success) {
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
