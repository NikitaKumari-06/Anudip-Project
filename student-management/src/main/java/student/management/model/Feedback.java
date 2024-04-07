package student.management.model;

public class Feedback {
    private int feedbackID;
    private String studentID;
    private String instructorName;
    private String feedback;

    // Constructor
    public Feedback(int feedbackID, String studentID, String instructorName, String feedback) {
        this.feedbackID = feedbackID;
        this.studentID = studentID;
        this.instructorName = instructorName;
        this.feedback = feedback;
    }

    public Feedback() {
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackID=" + feedbackID +
                ", studentID='" + studentID + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}

