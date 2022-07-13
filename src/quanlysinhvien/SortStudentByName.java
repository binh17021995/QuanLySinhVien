package quanlysinhvien;

import java.util.Comparator;

import sinhvien.SinhVien;

public class SortStudentByName implements Comparator<SinhVien>{

	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		
		return o1.getTenSinhVien().compareTo(o2.getTenSinhVien());
	}

}
