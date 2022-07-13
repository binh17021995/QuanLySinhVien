package quanlysinhvien;

import java.util.Comparator;

import sinhvien.SinhVien;

public class SortStudentByNumberPhone implements Comparator<SinhVien>{

	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		
		int kq1 = Integer.parseInt(o1.getNamSinh());
		int kq2 = Integer.parseInt(o2.getNamSinh());
		if(kq1>kq2) {
			return 1;
		}
		return -1;
	}

}
