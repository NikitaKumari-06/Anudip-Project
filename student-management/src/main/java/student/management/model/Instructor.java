package student.management.model;

public class Instructor {
    private String instructorID;
    private String email;
    private String firstName;
    private String lastName;

    // Constructor
    public Instructor(String instructorID, String email, String firstName, String lastName) {
        this.instructorID = instructorID;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Instructor() {
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
    public String getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorID='" + instructorID + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
