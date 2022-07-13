package main;

import java.util.Scanner;

import quanlysinhvien.QuanLySinhVien;
import sinhvien.SinhVien;

public class Main {
	public static void main(String[] args) {
		
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		int id;
		String choose = null;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
		 showMenu();
	        while (true) {
	            choose = scanner.nextLine();
	            switch (choose) {
	            case "1":
	                quanLySinhVien.addStudent();
	                break;
				
				  case "2": 
					  System.out.println("Nhập id sinh viên muốn sửa: ");
					  id = scanner.nextInt();
					  scanner.nextLine();
					  quanLySinhVien.editSV(id);
				  break; 
				  case "3": 
					  System.out.println("Nhập id sinh viên muốn xoá: ");
					  id = scanner.nextInt();
					  scanner.nextLine();
					  
					  quanLySinhVien.xoaSV(id);
				  break; 
				  case "4":
					  quanLySinhVien.sortByName();
				 
				  break; 
				  case "5":
					  quanLySinhVien.sortByYear();
				  
				  break; 
				  case "6": 
					  quanLySinhVien.sortByNumberPhone();
				  break;
				 case "7": quanLySinhVien.findStudent();
				  break;
				  
				 case "8": quanLySinhVien.hienThiDSSV();
				  break;
				 
	            case "0":
	                System.out.println("Đã thoát!");
	                exit = true;
	                break;
	            default:
	                System.out.println("Chọn giá trị không hợp lệ:");
	                break;
	            }
	            if (exit) {
	                break;
	            }
	          
	            showMenu();
	        }
	    }
	 
	   
	
public static void showMenu() {
    System.out.println("-----------Lựa chọn theo bảng dưới------------");
    System.out.println("1. Thêm sinh viên.");
    System.out.println("2. Sửa thông tin Sinh viên bằng id.");
    System.out.println("3. Xoá thông tin Sinh viên bằng id.");
    System.out.println("4. Sắp xếp sinh viên theo tên.");
    System.out.println("5. SSắp xếp sinh viên theo năm sinh.");
    System.out.println("6. Sắp xếp sinh viên theo số điện thoại.");
    System.out.println("7. Tìm kiếm học sinh.");
    System.out.println("8. Hiển thị danh sách sinh viên.");
    System.out.println("0. Thoát.");
    System.out.println("---------------------------");
    System.out.print("Mời lựa chọn: ");
}

}
