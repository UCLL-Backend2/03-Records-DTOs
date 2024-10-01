package be.ucll.backend2.records_dtos.class_vs_record;

public class Main {
    public static void main(String[] args) {
        // constructor met alle velden
        final var user = new UserRecord(1L,
                "jos@example.com",
                "hunter2",
                "Jos",
                "Bosmans");

        // toString functie
        System.out.println("User: " + user);

        // Niet getFirstName(), maar firstName()
        System.out.println("First name: " + user.firstName());
    }
}
