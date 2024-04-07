package student.management.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import student.management.connection.StudentDBConnection;
import student.management.model.Enrollment;

public class EnrollmentDAO {
    static PreparedStatement pstmt = null;
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;

    // Insert method handles auto-increment
    public static boolean insert(Enrollment obj) {
        boolean f = false;
        try {
            conn = StudentDBConnection.createC();

            String q = "INSERT INTO ENROLLMENT(EnrollmentID, StudentID, CourseID, InstructorID) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(q);

            pstmt.setString(1, obj.getEnrollmentID());
            pstmt.setString(2, obj.getStudentID());
            pstmt.setString(3, obj.getCourseID());
            pstmt.setString(4, obj.getInstructorID());

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

    // Update Enrollment
    public static boolean update(Enrollment obj, String enrollmentID) {
        boolean f = false;
        try {
            conn = StudentDBConnection.createC();

            String q = "UPDATE ENROLLMENT SET StudentID = ?, CourseID = ?, InstructorID = ? WHERE EnrollmentID = ?";
            pstmt = conn.prepareStatement(q);

            pstmt.setString(1, obj.getStudentID());
            pstmt.setString(2, obj.getCourseID());
            pstmt.setString(3, obj.getInstructorID());
            pstmt.setString(4, enrollmentID);

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
    public static boolean delete(String enrollmentID) {
        boolean f = false;
        try {
            conn = StudentDBConnection.createC();

            String qDelete = "DELETE FROM ENROLLMENTS WHERE EnrollmentID=?";
            pstmt = conn.prepareStatement(qDelete);
            pstmt.setString(1, enrollmentID);

            pstmt.executeUpdate();
            f = true;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return f;
    }

    // Enrollment by EnrollmentID
    public static Enrollment getByEnrollmentID(String enrollmentID) {
        Enrollment enrollment = null;
        try {
            conn = StudentDBConnection.createC();

            String q = "SELECT * FROM ENROLLMENT WHERE EnrollmentID=?";
            pstmt = conn.prepareStatement(q);

            pstmt.setString(1, enrollmentID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                enrollment = new Enrollment();
                enrollment.setEnrollmentID(rs.getString("EnrollmentID"));
                enrollment.setStudentID(rs.getString("StudentID"));
                enrollment.setCourseID(rs.getString("CourseID"));
                enrollment.setInstructorID(rs.getString("InstructorID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return enrollment;
    }
    

    // Enrollment by EnrollmentID
    public static Enrollment getByStudentID(String studentID) {
        Enrollment enrollment = null;
        try {
            conn = StudentDBConnection.createC();

            String q = "SELECT * FROM ENROLLMENT WHERE StudentID=?";
            pstmt = conn.prepareStatement(q);

            pstmt.setString(1, studentID);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                enrollment = new Enrollment();
                enrollment.setEnrollmentID(rs.getString("EnrollmentID"));
                enrollment.setStudentID(rs.getString("StudentID"));
                enrollment.setCourseID(rs.getString("CourseID"));
                enrollment.setInstructorID(rs.getString("InstructorID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return enrollment;
    }

    public static List<Enrollment> getAllEnrollments() {
        List<Enrollment> enrollments = new ArrayList<>();
        try {
            conn = StudentDBConnection.createC();

            String q = "SELECT * FROM ENROLLMENT";
            stmt = conn.createStatement();

            rs = stmt.executeQuery(q);

            while (rs.next()) {
                Enrollment enrollment = new Enrollment();
                enrollment.setEnrollmentID(rs.getString("EnrollmentID"));
                enrollment.setStudentID(rs.getString("StudentID"));
                enrollment.setCourseID(rs.getString("CourseID"));
                enrollment.setInstructorID(rs.getString("InstructorID"));
                enrollments.add(enrollment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return enrollments;
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
