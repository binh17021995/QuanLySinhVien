package main;

import java.util.Scanner;

import student.Student;
import studentmanager.StudentManager;

public class Main {
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		int id;
		String choose = null;
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		showMenu();
		while (true) {
			choose = scanner.nextLine();
			switch (choose) {
			case "1":
				studentManager.addStudent();
				break;

			case "2":
				System.out.println("Iput ID of student want to edit: ");
				id = scanner.nextInt();
				scanner.nextLine();
				studentManager.editStudent(id);
				break;

			case "3":
				System.out.println("Iput ID of student want to delete: ");
				id = scanner.nextInt();
				scanner.nextLine();
				studentManager.deleteStudent(id);
				break;

			case "4":
				studentManager.sortByName();
				break;

			case "5":
				studentManager.sortByYear();
				break;

			case "6":
				studentManager.sortByNumberPhone();
				break;

			case "7":
				studentManager.findStudent();
				break;

			case "8":
				studentManager.filterCollegeOrUniversity();
				break;
				
			case "9":
				studentManager.showList();
				break;

			case "0":
				System.out.println("Exited!");
				exit = true;
				break;

			default:
				System.out.println("Invalid! choose id:");
				break;

			}
			if (exit) {
				break;
			}
			showMenu();
		}
	}

	public static void showMenu() {
		System.out.println("-----------Menu------------");
		System.out.println("1. Add student.");
		System.out.println("2. Edit student by id.");
		System.out.println("3. Delete student by id.");
		System.out.println("4. Sort student by name.");
		System.out.println("5. Sort student by year.");
		System.out.println("6. Sort student by number phone.");
		System.out.println("7. Find student.");
		System.out.println("8. Filter student College/University.");
		System.out.println("9. Show list student.");
		System.out.println("0. Exit.");
		System.out.println("---------------------------");
		System.out.print("Press key: ");
	}

}
