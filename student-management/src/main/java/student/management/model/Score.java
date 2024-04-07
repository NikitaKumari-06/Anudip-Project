package student.management.model;

import java.util.Date;

public class Score {
    private String scoreID;
    private String studentID;
    private String courseID;
    private String creditObtained;
    private Date dateOfExam;

    // Constructor
    public Score(String scoreID, String studentID, String courseID, String creditObtained, Date dateOfExam) {
        this.scoreID = scoreID;
        this.studentID = studentID;
        this.courseID = courseID;
        this.creditObtained = creditObtained;
        this.dateOfExam = dateOfExam;
    }

    public Score() {
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
    public String getScoreID() {
        return scoreID;
    }

    public void setScoreID(String scoreID) {
        this.scoreID = scoreID;
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

    public String getCreditObtained() {
        return creditObtained;
    }

    public void setCreditObtained(String creditObtained) {
        this.creditObtained = creditObtained;
    }

    public Date getDateOfExam() {
        return dateOfExam;
    }

    public void setDateOfExam(Date dateOfExam) {
        this.dateOfExam = dateOfExam;
    }

    @Override
    public String toString() {
        return "Score{" +
                "scoreID='" + scoreID + '\'' +
                ", studentID='" + studentID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", creditObtained='" + creditObtained + '\'' +
                ", dateOfExam=" + dateOfExam +
                '}';
    }
}
