import java.util.ArrayList;
import java.util.List;

public class AnalyticsDatabase {
    private List<Event> eventStore = new ArrayList<>();
    private List<Report> reportStore = new ArrayList<>();

    public void storeEvent(Event event) {
        eventStore.add(event);
        System.out.println("Event stored: " + event.getEventDetails());
    }

    public List<Event> fetchEvents() {
        return new ArrayList<>(eventStore); // Returns a copy of the list
    }

    public void storeReport(Report report) {
        reportStore.add(report);
        System.out.println("Report stored with ID: " + report.getReportId());
    }
}
