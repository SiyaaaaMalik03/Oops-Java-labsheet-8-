import java.time.LocalDate;

public class DateBean {
    public DateBean() {}

    // Read-only property: no setter is provided.
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static void main(String[] args) {
        DateBean d = new DateBean();
        System.out.println("Current Date: " + d.getCurrentDate());
    }
}
