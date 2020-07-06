package market_store.cardholders;

public class Cardholder {
    private String firstName;
    private String lastName;

    public Cardholder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
