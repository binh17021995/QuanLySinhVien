package studentmanager;

import java.util.Comparator;

import student.Student;

public class SortStudentByNumberPhone implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		int kq1 = Integer.parseInt(o1.getBornOfYear());
		int kq2 = Integer.parseInt(o2.getBornOfYear());
		if(kq1>kq2) {
			return 1;
		}
		return -1;
	}

}
