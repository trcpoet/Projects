package App;

import java.time.LocalDate;

public class DoToItem {
private String shortDescription;
private String details;
private LocalDate deadline;

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public DoToItem(String shortDescription, String details, LocalDate deadline) {

}

    @Override
    public String toString() {
        return  shortDescription;
}

}

