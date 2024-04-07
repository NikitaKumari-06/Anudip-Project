package student.management.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import student.management.connection.StudentDBConnection;
import student.management.model.Score;

public class ScoreDAO {
    static PreparedStatement pstmt = null;
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;

    // Insert method handles auto-increment
    public static boolean insert(Score obj) {
        boolean f = false;
        try {
            conn = StudentDBConnection.createC();

            String q = "INSERT INTO SCORE(ScoreID, StudentID, CourseID, CreditObtained, DateOfExam) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(q);

            pstmt.setString(1, obj.getScoreID());
            pstmt.setString(2, obj.getStudentID());
            pstmt.setString(3, obj.getCourseID());
            pstmt.setString(4, obj.getCreditObtained());
            pstmt.setDate(5, new java.sql.Date(obj.getDateOfExam().getTime())); // Converting Date to SQL Date

            pstmt.executeUpdate();

            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            closeResources();
        }
        return f;
    }

    // Update Score
    public static boolean update(Score obj, String scoreID) {
        boolean f = false;
        try {
            conn = StudentDBConnection.createC();

            String q = "UPDATE SCORE SET StudentID = ?, CourseID = ?, CreditObtained = ?, DateOfExam = ? WHERE ScoreID = ?";
            pstmt = conn.prepareStatement(q);

            pstmt.setString(1, obj.getStudentID());
            pstmt.setString(2, obj.getCourseID());
            pstmt.setString(3, obj.getCreditObtained());
            pstmt.setDate(4, new java.sql.Date(obj.getDateOfExam().getTime())); // Converting Date to SQL Date
            pstmt.setString(5, scoreID);

            pstmt.executeUpdate();
            f = true;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return f;
    }

    // Delete Method
    public static boolean delete(String scoreID) {
        boolean f = false;
        try {
            conn = StudentDBConnection.createC();

            String qDelete = "DELETE FROM SCORE WHERE ScoreID=?";
            pstmt = conn.prepareStatement(qDelete);
            pstmt.setString(1, scoreID);

            pstmt.executeUpdate();
            f = true;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return f;
    }

    // Score by ScoreID
    public static Score getByScoreID(String scoreID) {
        Score score = null;
        try {
            conn = StudentDBConnection.createC();

            String q = "SELECT * FROM SCORE WHERE ScoreID=?";
            pstmt = conn.prepareStatement(q);

            pstmt.setString(1, scoreID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                score = new Score();
                score.setScoreID(rs.getString("ScoreID"));
                score.setStudentID(rs.getString("StudentID"));
                score.setCourseID(rs.getString("CourseID"));
                score.setCreditObtained(rs.getString("CreditObtained"));
                score.setDateOfExam(rs.getDate("DateOfExam"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return score;
    }

    public static List<Score> getAllScores() {
        List<Score> scores = new ArrayList<>();
        try {
            conn = StudentDBConnection.createC();

            String q = "SELECT * FROM SCORE";
            stmt = conn.createStatement();

            rs = stmt.executeQuery(q);

            while (rs.next()) {
                Score score = new Score();
                score.setScoreID(rs.getString("ScoreID"));
                score.setStudentID(rs.getString("StudentID"));
                score.setCourseID(rs.getString("CourseID"));
                score.setCreditObtained(rs.getString("CreditObtained"));
                score.setDateOfExam(rs.getDate("DateOfExam"));
                scores.add(score);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return scores;
    }
    
    public static boolean addScoreByStudentId(Score score) {
        boolean result = false;
        try {
            conn = StudentDBConnection.createC();

            // Check if the student exists before adding the score
            String checkStudentQuery = "SELECT * FROM Student WHERE StudentID = ?";
            PreparedStatement checkStudentStmt = conn.prepareStatement(checkStudentQuery);
            checkStudentStmt.setString(1, score.getStudentID());
            ResultSet studentResult = checkStudentStmt.executeQuery();

            if (studentResult.next()) {
                // If the student exists, proceed to add the score
                String insertQuery = "INSERT INTO Score (scoreID, studentID, courseID, creditObtained, dateOfExam) VALUES (?, ?, ?, ?, ?)";
                pstmt = conn.prepareStatement(insertQuery);

                pstmt.setString(1, score.getScoreID());
                pstmt.setString(2, score.getStudentID());
                pstmt.setString(3, score.getCourseID());
                pstmt.setString(4, score.getCreditObtained());
                pstmt.setDate(5, new java.sql.Date(score.getDateOfExam().getTime()));

                int rowsAffected = pstmt.executeUpdate();
                result = rowsAffected > 0;
            } else {
                System.out.println("Student with ID " + score.getStudentID() + " does not exist.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return result;
    }

    // Close resources method
    private static void closeResources() {
        try {
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
