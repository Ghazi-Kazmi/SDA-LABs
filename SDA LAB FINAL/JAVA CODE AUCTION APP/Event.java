import java.util.Date;

public class Event {
    private String eventId;
    private String eventType;
    private Date timestamp;

    public Event(String eventId, String eventType, Date timestamp) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.timestamp = timestamp;
    }

    public String getEventDetails() {
        return "Event ID: " + eventId + ", Type: " + eventType + ", Timestamp: " + timestamp;
    }

    // Getters and Setters (if needed)
}
