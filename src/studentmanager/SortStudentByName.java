package studentmanager;

import java.util.Comparator;

import student.Student;

public class SortStudentByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getNameStudent().compareTo(o2.getNameStudent());
	}

}
