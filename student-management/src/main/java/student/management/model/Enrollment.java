package student.management.model;

public class Enrollment {
    private String enrollmentID;
    private String studentID;
    private String courseID;
    private String instructorID;

    // Constructor
    public Enrollment(String enrollmentID, String studentID, String courseID, String instructorID) {
        this.enrollmentID = enrollmentID;
        this.studentID = studentID;
        this.courseID = courseID;
        this.instructorID = instructorID;
    }

    public Enrollment() {
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
    public String getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(String enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentID='" + enrollmentID + '\'' +
                ", studentID='" + studentID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", instructorID='" + instructorID + '\'' +
                '}';
    }
}

