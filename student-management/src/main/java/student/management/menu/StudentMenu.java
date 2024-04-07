package student.management.menu;

import java.util.Scanner;

import student.management.operation.CourseOperation;
import student.management.operation.FeedbackOperation;
import student.management.operation.InstructorOperation;
import student.management.operation.ScoreOperation;
import student.management.operation.StudentOperation;

public class StudentMenu {
	

    // Student menu
    public static void studentMenu(Scanner sc) {
        int choice;
        do {
            System.out.println("Student Menu");
            System.out.println("1. View Instructors");
            System.out.println("2. View Courses");
            System.out.println("3. View Student By Id");
            System.out.println("4. View Feedback By student Id");
            System.out.println("5. Add Feedback");
            System.out.println("6. View Score");
            System.out.println("0. Logout");

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
                	StudentOperation.showStudentById(sc);
                    break;
                case 4:
                	FeedbackOperation.showFeedbackByStudentId(sc);
                    break;
                case 5:
                	FeedbackOperation.addFeedback(sc);
                    break;
                case 6:
                	ScoreOperation.showScoreById(sc);
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
    
    
    public static void processInstructor(Scanner sc) {
        int choice;
        do {
            System.out.println("Welcome to instructor operation");
            System.out.println("1. View Instructor By Id");
            System.out.println("3. View Instructors");
            System.out.println("0. Back");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    InstructorOperation.showInstructorById(sc);
                    break;
                case 2:
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
    
    

}
