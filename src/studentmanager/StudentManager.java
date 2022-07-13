package studentmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import student.Student;

public class StudentManager {
	private List<Student> listSV;
	private Scanner scanner = new Scanner(System.in);

	public StudentManager() {
		this.listSV = new ArrayList<>();
	}

	public void addStudent() {
		int id = inputID();
		System.out.println("student id = " + id);
		System.out.println("Name of Student: ");
		String nameStudent = inputInformation();
		System.out.println("Born of year: ");
		String bornOfYear = inputInformation();
		System.out.println("Number phone of Student: ");
		String numberPhone = inputInformation();
		System.out.println("Major of Student: ");
		String majorOfStudent = inputInformation();
		System.out.println("Type of training : (College/University) ");
		String typeOfTraining = inputInformation();
		Student student = new Student(id, nameStudent, bornOfYear, numberPhone, majorOfStudent, typeOfTraining);
		listSV.add(student);
	}

	public int inputID() {
		System.out.println("Input id: ");
		while (true) {
			try {
				int id = Integer.parseInt((scanner.nextLine()));
				while (id <= 0) {
					System.out.println("Input ID malformed, Please input again: ");
					id = Integer.parseInt((scanner.nextLine()));
				}
				for (int i = 0; i < listSV.size(); i++) {
					while (listSV.get(i).getiD() == id) {
						System.out.println("ID duplicated, Please id again: ");
						id = Integer.parseInt((scanner.nextLine()));
					}
				}
				return id;
			} catch (NumberFormatException ex) {
				System.out.print("Input ID malformed, Please input again: ");
			}
		}
	}

	private String inputInformation() {

		String sv = scanner.nextLine();

		for (int i = 0; i < listSV.size(); i++) {
			while (listSV.get(i).getNumberPhone().equals(sv)) {
				System.out.println("Number phone duplicated! Again: ");
				sv = scanner.nextLine();
			}
		}
		return sv;
	}

	public void editStudent(int id) {
		if (listSV.size() == 0) {
			System.out.println("List Student null!");
			return;
		} else {
			System.out.println();
			for (int i = 0; i < listSV.size(); i++) {
				if (listSV.get(i).getiD() == id) {
					System.out.println("Change Name: ");
					listSV.get(i).setNameStudent(inputInformation());
					System.out.println("Change Year: ");
					listSV.get(i).setBornOfYear(inputInformation());
					System.out.println("Change Number phone: ");
					listSV.get(i).setNumberPhone(inputInformation());
					System.out.println("Change Major: ");
					listSV.get(i).setMajorOfStudent(inputInformation());
					System.out.println("Change Type Of Training: ");
					listSV.get(i).setTypeOfTraining(inputInformation());
				} else {
					System.out.println("Sorry! Not ID \n");
				}

			}
		}

	}

	public void deleteStudent(int id) {
		if (listSV.size() == 0) {
			System.out.println("List Student null!");
			return;
		} else {
			System.out.println();
			for (int i = 0; i < listSV.size(); i++) {
				if (listSV.get(i).getiD() == id) {
					listSV.remove(i);
					System.out.println("Deleted student : " + id);
				} else {
					System.out.println("Not id exists!");
				}

			}
		}

	}

	public void sortByName() {
		if (listSV.size() == 0) {
			System.out.println("List Student null!");
			return;
		} else {
			System.out.println("Sort student by name is success!");
			Collections.sort(listSV, new SortStudentByName());
		}
	}

	public void sortByYear() {
		if (listSV.size() == 0) {
			System.out.println("List Student null!");
			return;
		} else {
			System.out.println("Sort student by year is success!");
			Collections.sort(listSV, new SortStudentByYear());
		}
	}

	public void sortByNumberPhone() {
		if (listSV.size() == 0) {
			System.out.println("List Student null!");
			return;
		} else {
			System.out.println("Sort student by numbers phone is success!");
			Collections.sort(listSV, new SortStudentByNumberPhone());
		}
	}

	public void filterCollegeOrUniversity() {
		System.out.println("Input type of training College/University: ");
		String typeOfTraining = inputName();
		isCollege(typeOfTraining);

	}

	private boolean isCollege(String typeOfTraining) {
		for (int i = 0; i < listSV.size(); i++) {
			if (listSV.get(i).getTypeOfTraining().toLowerCase().equals(typeOfTraining.toLowerCase())) {
				System.out.println(listSV.get(i).getNameStudent() + "   " + listSV.get(i).getNumberPhone() + "   "
						+ listSV.get(i).getTypeOfTraining() + "\n");
			}

		}

		return false;
	}

	public void findStudent() {
		System.out.println("Input name need to find: ");
		String findName = inputName();
		if (listSV.size() == 0) {
			System.out.println("List Student null!");
			return;
		} else {
			checkStudent(findName);
		}
	}

	private boolean checkStudent(String check) {
		for (int i = 0; i < listSV.size(); i++) {
			if (listSV.get(i).getNameStudent().toLowerCase().contains(check.toLowerCase())
					|| listSV.get(i).getBornOfYear().toLowerCase().contains(check.toLowerCase())
					|| listSV.get(i).getNumberPhone().toLowerCase().contains(check.toLowerCase())
					|| listSV.get(i).getMajorOfStudent().toLowerCase().contains(check.toLowerCase())
					|| listSV.get(i).getTypeOfTraining().toLowerCase().contains(check.toLowerCase())) {
				System.out.println("Finded name student: " + listSV.get(i).getNameStudent());

			} else {
				System.out.println("Not Find name student!");
			}
		}
		return false;
	}

	private String inputName() {
		String findName = scanner.nextLine();
		return findName;
	}

	public void showList() {
		if (listSV.size() == 0) {
			System.out.println("List Student null!");
			return;
		}
		System.out.println("List:\n ");
		for (int i = 0; i < listSV.size(); i++) {
			System.out.println(listSV.get(i).getNameStudent() + "   " + listSV.get(i).getNumberPhone() + "   "
					+ listSV.get(i).getTypeOfTraining() + "\n");
		}
	}

}
