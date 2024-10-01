package be.ucll.backend2.records_dtos.class_vs_record;

import java.util.Objects;

public class UserClass {
    private Long id;
    private String emailAddress;
    private String password;
    private String firstName;
    private String lastName;

    public UserClass(Long id, String emailAddress, String password, String firstName, String lastName) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserClass userClass = (UserClass) o;
        return Objects.equals(id, userClass.id) && Objects.equals(emailAddress, userClass.emailAddress) && Objects.equals(password, userClass.password) && Objects.equals(firstName, userClass.firstName) && Objects.equals(lastName, userClass.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emailAddress, password, firstName, lastName);
    }
}
