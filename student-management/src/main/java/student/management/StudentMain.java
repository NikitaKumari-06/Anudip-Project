package student.management;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("**********Welcome to Student Management System***********");
        MainMenu menu = new MainMenu();
        menu.login();
        menu.mainMenu();
    }

}
