import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnalyticsService analyticsService = new AnalyticsService();

        // Log events
        analyticsService.logEvent("E001", "User Login");
        analyticsService.logEvent("E002", "Item Purchased");

        // Generate a report
        Report report = analyticsService.generateReport(new Date(), new Date());
        report.export("PDF");

        // Handle a payment
        analyticsService.handlePayment(100.50, "USD");
    }
}
