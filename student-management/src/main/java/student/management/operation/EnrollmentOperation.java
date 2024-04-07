package student.management.operation;

import java.util.List;
import java.util.Scanner;

import student.management.DAO.EnrollmentDAO;
import student.management.model.Enrollment;

public class EnrollmentOperation {
    public static void addEnrollment(Scanner sc) {
        System.out.println("Enter enrollment ID:");
        String enrollmentID = sc.next();

        System.out.println("Enter student ID:");
        String studentID = sc.next();

        System.out.println("Enter course ID:");
        String courseID = sc.next();

        System.out.println("Enter instructor ID:");
        String instructorID = sc.next();

        // Creating object of Enrollment class
        Enrollment obj = new Enrollment(enrollmentID, studentID, courseID, instructorID);

        // Calling method to insert into table and passing the object of Enrollment class
        boolean result = EnrollmentDAO.insert(obj);
        if (result) {
            System.out.println("The enrollment is successfully added.");
        } else {
            System.out.println("Something went wrong.");
        }
    }

    public static void updateEnrollment(Scanner sc) {
        System.out.println("Enter enrollment ID to update:");
        String enrollmentID = sc.next();

        System.out.println("Enter student ID:");
        String studentID = sc.next();

        System.out.println("Enter course ID:");
        String courseID = sc.next();

        System.out.println("Enter instructor ID:");
        String instructorID = sc.next();

        // Creating object of Enrollment class
        Enrollment obj = new Enrollment(enrollmentID, studentID, courseID, instructorID);

        // Calling method to update the record in the table
        boolean result = EnrollmentDAO.update(obj, enrollmentID);
        if (result) {
            System.out.println("The enrollment is successfully updated.");
        } else {
            System.out.println("Something went wrong.");
        }
    }

    public static void showEnrollments(Scanner sc) {
        // Get all Enrollments
        List<Enrollment> enrollments = EnrollmentDAO.getAllEnrollments();
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }

    public static void showEnrollmentById(Scanner sc) {
        System.out.println("Enter enrollment ID to get data:");
        String enrollmentID = sc.next();
        Enrollment obj = EnrollmentDAO.getByEnrollmentID(enrollmentID);
        if (obj != null) {
            System.out.println(obj);
        } else {
            System.out.println("Enrollment with ID " + enrollmentID + " not found.");
        }
    }
    
    public static void showEnrollmentByStudentId(Scanner sc) {
        System.out.println("Enter student ID to get data:");
        String studentID = sc.next();
        Enrollment obj = EnrollmentDAO.getByEnrollmentID(studentID);
        if (obj != null) {
            System.out.println(obj);
        } else {
            System.out.println("Enrollment with student ID " + studentID + " not found.");
        }
    }

    public static void deleteEnrollmentById(Scanner sc) {
        System.out.println("Enter enrollment ID to delete:");
        String enrollmentID = sc.next();

        // Calling method to delete a particular record
        boolean result = EnrollmentDAO.delete(enrollmentID);
        if (result) {
            System.out.println("The enrollment is successfully deleted.");
        } else {
            System.out.println("Something went wrong.");
        }
    }
}
