package net.comdava.taskscheduler.model;

import java.time.LocalDateTime;

public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime dateCreated;

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public LocalDateTime getDateCreated() { return dateCreated; }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setDateCreated(LocalDateTime dateCreated) { this.dateCreated = dateCreated; }
}
