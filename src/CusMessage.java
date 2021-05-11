import java.util.ArrayList;
import java.util.List;

public class CusMessage {

    // Fields ********************
    private String senderID;
    private String empfaengerID;
    private List<String> comments;
    private double totalWeight;
    private int numberOfPackages;

    // Constructors
    public CusMessage() {
        comments = new ArrayList<>();
    }

    public CusMessage(
        String senderID, String empfaengerID, List<String> comments,
        double totalWeight, int numberOfPackages)
    {
        this.senderID = senderID;
        this.empfaengerID = empfaengerID;
        this.comments = comments != null
            ? comments
            : new ArrayList<>();
        this.totalWeight = totalWeight;
        this.numberOfPackages = numberOfPackages;
    }

    // Setters and Getters
    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getEmpfaengerID() {
        return empfaengerID;
    }

    public void setEmpfaengerID(String empfaengerID) {
        this.empfaengerID = empfaengerID;
    }

    public List<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

}
