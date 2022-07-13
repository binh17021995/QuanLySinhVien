package quanlysinhvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import sinhvien.SinhVien;

public class QuanLySinhVien {
	private List<SinhVien> listSV;
	private Scanner scanner = new Scanner(System.in);

	public QuanLySinhVien() {
		this.listSV = new ArrayList<>();
	}

	public void addStudent() {

		int id = nhapID();
		System.out.println("Nhập Tên sinh viên: ");
		String tenSV = nhapThongTinSV();
		System.out.println("Nhập Năm sinh: ");
		String namSinh = nhapThongTinSV();
		System.out.println("Nhập Số điện thoại: ");
		String soDT = nhapThongTinSV();

		System.out.println("Nhập Chuyên ngành: ");
		String chuyenNganh = nhapThongTinSV();
		System.out.println("Nhập Hệ đào tạo: ");
		String heDT = nhapThongTinSV();

		SinhVien sinhVien = new SinhVien(id, tenSV, namSinh, soDT, chuyenNganh, heDT);

		listSV.add(sinhVien);

	}

	public int nhapID() {
		System.out.println("Nhập id: ");
		while (true) {
			try {
				int id = Integer.parseInt((scanner.nextLine()));
				while (id <= 0) {
					System.out.println("ID định dạng không đúng, yêu cầu nhập lại: ");
					id = Integer.parseInt((scanner.nextLine()));

				}

				for (int i = 0; i < listSV.size(); i++) {
					while (listSV.get(i).getiD() == id) {
						System.out.println("ID trùng, yêu cầu nhập lại: ");
						id = Integer.parseInt((scanner.nextLine()));

					}
				}
				return id;
			} catch (NumberFormatException ex) {
				System.out.print("Sai định dạng dữ liệu ID, nhập lại: ");
			}
		}

	}

	private String nhapThongTinSV() {

		String sv = scanner.nextLine();

		for (int i = 0; i < listSV.size(); i++) {
			while (listSV.get(i).getSoDT().equals(sv)) {
				System.out.println("Số điện thoại trùng nhau, yêu cầu nhập lại: ");
				sv = scanner.nextLine();
			}
		}
		return sv;
	}

	public void editSV(int id) {
		if (listSV.size() == 0) {
			System.out.println("Danh sách trống!");
			return;
		} else {
			System.out.println();
			for (int i = 0; i < listSV.size(); i++) {
				if (listSV.get(i).getiD() == id) {
					System.out.println("Đổi tên: ");
					listSV.get(i).setTenSinhVien(nhapThongTinSV());

					System.out.println("Đổi năm sinh: ");
					listSV.get(i).setNamSinh(nhapThongTinSV());

					System.out.println("Đổi số điện thoại: ");
					listSV.get(i).setSoDT(nhapThongTinSV());

					System.out.println("Đổi chuyên ngành: ");
					listSV.get(i).setChuyenNganh(nhapThongTinSV());

					System.out.println("Đổi hệ đào tạo: ");
					listSV.get(i).setHeDaoTao(nhapThongTinSV());
				} else {
					System.out.println("Không có sinh viên nào có id như trên!");
				}

			}
		}

	}

	public void xoaSV(int id) {
		if (listSV.size() == 0) {
			System.out.println("Danh sách trống!");
			return;
		} else {
			System.out.println();
			for (int i = 0; i < listSV.size(); i++) {
				if (listSV.get(i).getiD() == id) {
					listSV.remove(i);
					System.out.println("Đã xoá sinh viên có id là: " + id);
				} else {
					System.out.println("Không có sinh viên nào có id như trên!");
				}

			}
		}

	}

	public void sortByName() {
		if (listSV.size() == 0) {
			System.out.println("Danh sách trống!");
			return;
		} else {
			System.out.println("Sắp xếp thứ tự sinh viên theo tên thành công");
			Collections.sort(listSV, new SortStudentByName());
		}

	}

	public void sortByYear() {
		if (listSV.size() == 0) {
			System.out.println("Danh sách trống!");
			return;
		} else {
			System.out.println("Sắp xếp thứ tự sinh viên theo Năm sinh thành công");
			Collections.sort(listSV, new SortStudentByYear());
		}

	}

	public void sortByNumberPhone() {
		if (listSV.size() == 0) {
			System.out.println("Danh sách trống!");
			return;
		} else {
			System.out.println("Sắp xếp thứ tự sinh viên theo Số điện thoại thành công");
			Collections.sort(listSV, new SortStudentByNumberPhone());
		}

	}

	public void findStudent() {
		System.out.println("Nhập vào tên cần tìm: ");
		String findName = inputFindName();

		if (listSV.size() == 0) {
			System.out.println("Danh sách trống!");
			return;
		} else {
			for (int i = 0; i <listSV.size(); i++) {
				if (ktName(findName)) {
					System.out.println("Không tìm thấy!");
					
				}else {
					System.out.println("Đã tìm kiếm được: "+ listSV.get(i).getTenSinhVien()+" ");

					
				}
				
			}

			

		}

	}

	private boolean ktName(String kt) {
		for (int i = 0; i < listSV.size(); i++) {
			listSV.get(i).getTenSinhVien().contains(kt);
			listSV.get(i).getNamSinh().contains(kt);
			listSV.get(i).getSoDT().contains(kt);
			listSV.get(i).getChuyenNganh().contains(kt);
			listSV.get(i).getHeDaoTao().contains(kt);

		}

		return false;
	}

	private String inputFindName() {
		String findName = scanner.nextLine();
		return findName;
	}

	public void hienThiDSSV() {
		if (listSV.size() == 0) {

			System.out.println("Danh sách sinh viên rỗng ! ");
			return;
		}
		System.out.println("Danh sách sinh viên đã nhập:\n ");
		for (int i = 0; i < listSV.size(); i++) {
			System.out.println(listSV.get(i).getTenSinhVien() + "   " + listSV.get(i).getSoDT() + "   "
					+ listSV.get(i).getHeDaoTao());

		}
	}

}
