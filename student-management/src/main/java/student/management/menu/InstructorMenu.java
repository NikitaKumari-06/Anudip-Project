package student.management.menu;

import java.util.Scanner;

import student.management.operation.CourseOperation;
import student.management.operation.EnrollmentOperation;
import student.management.operation.FeedbackOperation;
import student.management.operation.InstructorOperation;
import student.management.operation.ScoreOperation;
import student.management.operation.StudentOperation;

public class InstructorMenu {

    // Instructor menu
    public static void instructorMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("Instructor Menu");
            System.out.println("1. Process Instructors");
            System.out.println("2. Process Courses");
            System.out.println("3. Process Students");
            System.out.println("4. Process Enrollment");
            System.out.println("5. Process Feedback");
            System.out.println("6. Process Score");
            System.out.println("0. Logout");

            choice = sc.nextInt();
            switch (choice) {
            	case 1:
	            	processInstructor(sc);
	                break;    
            	case 2:
            		processCourse(sc);
                    break;
                case 3:
                	processStudent(sc);
                    break;
                case 4:
                	processEnrollment(sc);
                    break;
                case 5:
                	processFeedback(sc);
                    break;
                case 6:
                	processScore(sc);
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Logged out.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
    
    public static void processScore(Scanner sc) {
        int choice;
        do {
            System.out.println("Welcome to score operation");
            System.out.println("1. Grade Students");
            System.out.println("2. View Score By StudentId");
            System.out.println("3. View Score By CourseId");
            System.out.println("0. Back");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ScoreOperation.addScoreByStudentId(sc);
                    break;
                case 2:
                    ScoreOperation.showScoreById(sc);
                    break;
                case 3:
                    ScoreOperation.showScores(sc);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
    
    public static void processInstructor(Scanner sc) {
        int choice;
        do {
            System.out.println("Welcome to instructor operation");
            System.out.println("1. View Instructor By Id");
            System.out.println("2. View Assigned Courses By courseId");
            System.out.println("3. View Instructors");
            System.out.println("0. Back");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    InstructorOperation.showInstructorById(sc);
                    break;
                case 2:
                	InstructorOperation.showAssignedCourses(sc);
                    break;
                case 3:
                    InstructorOperation.showInstructors(sc);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
    
    public static void processStudent(Scanner sc) {
        int choice;
        do {
            System.out.println("Welcome to Student operation");
            System.out.println("1. View Student By Id");
            System.out.println("2. View all Students");
            System.out.println("0. Back");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StudentOperation.showStudentById(sc);
                    break;
                case 2:
                    StudentOperation.showStudents(sc);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
    
    public static void processEnrollment(Scanner sc) {
        int choice;
        do {
            System.out.println("Welcome to Enrollment operation");
            System.out.println("1. View Enrolled Student By EnrollmentId");
            System.out.println("2. View Enrolled Student By StudentId");
        	System.out.println("3. View Enrolled Students");
            System.out.println("0. Back");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    EnrollmentOperation.showEnrollmentById(sc);
                    break;
                case 2:
                    EnrollmentOperation.showEnrollmentByStudentId(sc);
                    break;
                case 3:
                	EnrollmentOperation.showEnrollments(sc);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
    
    public static void processCourse(Scanner sc) {
        int choice;
        do {
            System.out.println("Welcome to Course operation");
            System.out.println("1. View Course By Id");
            System.out.println("2. View all Courses");
            System.out.println("0. Back");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    CourseOperation.showCourseById(sc);
                    break;
                case 2:
                	CourseOperation.showCourses(sc);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
    
    public static void processFeedback(Scanner sc) {
        int choice;
        do {
            System.out.println("Welcome to feedback operation");
            System.out.println("1. View Feedback By Id");
            System.out.println("2. View Feedback By StudentId");
            System.out.println("3. View all Feedbacks");
            System.out.println("0. Back");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    FeedbackOperation.showFeedbackById(sc);
                    break;
                case 2:
                    FeedbackOperation.showFeedbackByStudentId(sc);
                    break;
                case 3:
                    FeedbackOperation.showFeedbacks(sc);
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

}
