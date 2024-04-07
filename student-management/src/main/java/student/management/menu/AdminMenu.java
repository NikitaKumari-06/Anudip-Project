package student.management.menu;

import java.util.Scanner;

import student.management.operation.CourseOperation;
import student.management.operation.EnrollmentOperation;
import student.management.operation.FeedbackOperation;
import student.management.operation.InstructorOperation;
import student.management.operation.ScoreOperation;
import student.management.operation.StudentOperation;

public class AdminMenu {

	// Admin menu
   public static void adminMenu(Scanner sc) {
       int choice;
       do {
           System.out.println("Admin Menu");
           System.out.println("1. Manage Courses");
           System.out.println("2. Manage Instructors");
           System.out.println("3. Manage Students");
           System.out.println("4. Manage Enrollment");
           System.out.println("5. Manage Feedback");
           System.out.println("6. Manage Score");
           System.out.println("0. Logout");

           System.out.print("Enter your choice: ");
           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   manageCourses(sc);
                   break;
               case 2:
                   manageInstructors(sc);
                   break;
               case 3:
                   manageEnrollments(sc);
                   break;
               case 4:
                   manageScores(sc);
                   break;
               case 5:
                   manageStudents(sc);
                   break;
               case 6:
                   manageFeedbacks(sc);
                   break;
               case 0:
                   System.out.println("Logged out.");
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       } while (choice != 0);
   }

   public static void manageCourses(Scanner sc) {
       int choice;
       do {
           System.out.println("Welcome to course operation");
           System.out.println("1. Add a Course");
           System.out.println("2. Update a Course");
           System.out.println("3. View all Course");
           System.out.println("4. View Course by Id");
           System.out.println("5. Delete Course by Id");
           System.out.println("0. Back");

           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   CourseOperation.addCourse(sc);
                   break;
               case 2:
                   CourseOperation.updateCourse(sc);
                   break;
               case 3:
                   CourseOperation.showCourses(sc);
                   break;
               case 4:
                   CourseOperation.showCourseById(sc);
                   break;
               case 5:
                   CourseOperation.deleteCourseById(sc);
                   break;
               case 0:
                   System.out.println("Returning to main menu...");
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       } while (choice != 0);
   }

   public static void manageInstructors(Scanner sc) {
       int choice;
       do {
           System.out.println("Welcome to instructor operation");
           System.out.println("1. Add an Instructor");
           System.out.println("2. Update an Instructor");
           System.out.println("3. View all Instructors");
           System.out.println("4. View Instructor by Id");
           System.out.println("5. Delete Instructor by Id");
           System.out.println("0. Back");

           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   InstructorOperation.addInstructor(sc);
                   break;
               case 2:
                   InstructorOperation.updateInstructor(sc);
                   break;
               case 3:
                   InstructorOperation.showInstructors(sc);
                   break;
               case 4:
                   InstructorOperation.showInstructorById(sc);
                   break;
               case 5:
                   InstructorOperation.deleteInstructorById(sc);
                   break;
               case 0:
                   System.out.println("Returning to main menu...");
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       } while (choice != 0);
   }

   public static void manageEnrollments(Scanner sc) {
       int choice;
       do {
           System.out.println("Welcome to enrollment operation");
           System.out.println("1. Add an Enrollment");
           System.out.println("2. Update an Enrollment");
           System.out.println("3. View all Enrollments");
           System.out.println("4. View Enrollment by Id");
           System.out.println("5. Delete Enrollment by Id");
           System.out.println("0. Back");

           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   EnrollmentOperation.addEnrollment(sc);
                   break;
               case 2:
                   EnrollmentOperation.updateEnrollment(sc);
                   break;
               case 3:
                   EnrollmentOperation.showEnrollments(sc);
                   break;
               case 4:
                   EnrollmentOperation.showEnrollmentById(sc);
                   break;
               case 5:
                   EnrollmentOperation.deleteEnrollmentById(sc);
                   break;
               case 0:
                   System.out.println("Returning to main menu...");
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       } while (choice != 0);
   }

   public static void manageScores(Scanner sc) {
       int choice;
       do {
           System.out.println("Welcome to score operation");
           System.out.println("1. Add a Score");
           System.out.println("2. Update a Score");
           System.out.println("3. View all Scores");
           System.out.println("4. View Score by Id");
           System.out.println("5. Delete Score by Id");
           System.out.println("0. Back");

           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   ScoreOperation.addScore(sc);
                   break;
               case 2:
                   ScoreOperation.updateScore(sc);
                   break;
               case 3:
                   ScoreOperation.showScores(sc);
                   break;
               case 4:
                   ScoreOperation.showScoreById(sc);
                   break;
               case 5:
                   ScoreOperation.deleteScoreById(sc);
                   break;
               case 0:
                   System.out.println("Returning to main menu...");
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       } while (choice != 0);
   }

   public static void manageStudents(Scanner sc) {
       int choice;
       do {
           System.out.println("Welcome to student operation");
           System.out.println("1. Add a Student");
           System.out.println("2. Update a Student");
           System.out.println("3. View all Students");
           System.out.println("4. View Student by Id");
           System.out.println("5. Delete Student by Id");
           System.out.println("0. Back");

           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   StudentOperation.addStudent(sc);
                   break;
               case 2:
                   StudentOperation.updateStudent(sc);
                   break;
               case 3:
                   StudentOperation.showStudents(sc);
                   break;
               case 4:
                   StudentOperation.showStudentById(sc);
                   break;
               case 5:
                   StudentOperation.deleteStudentById(sc);
                   break;
               case 0:
                   System.out.println("Returning to main menu...");
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
           }
       } while (choice != 0);
   }

   public static void manageFeedbacks(Scanner sc) {
       int choice;
       do {
           System.out.println("Welcome to feedback operation");
           System.out.println("1. Add a Feedback");
           System.out.println("2. Update a Feedback");
           System.out.println("3. View all Feedbacks");
           System.out.println("4. View Feedback by Id");
           System.out.println("5. Delete Feedback by Id");
           System.out.println("0. Back");

           choice = sc.nextInt();
           switch (choice) {
               case 1:
                   FeedbackOperation.addFeedback(sc);
                   break;
               case 2:
                   FeedbackOperation.updateFeedback(sc);
                   break;
               case 3:
                   FeedbackOperation.showFeedbacks(sc);
                   break;
               case 4:
                   FeedbackOperation.showFeedbackById(sc);
                   break;
               case 5:
                   FeedbackOperation.deleteFeedbackById(sc);
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
