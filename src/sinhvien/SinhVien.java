package sinhvien;

public class SinhVien {
	private int iD;
	private String tenSinhVien;
	private String namSinh;
	private String soDT;
	private String chuyenNganh;
	private String heDaoTao;
	public SinhVien(int iD, String tenSinhVien, String namSinh, String soDT,
			String chuyenNganh, String heDaoTao) {
		this.iD =iD;
		this.tenSinhVien = tenSinhVien;
		this.namSinh = namSinh;
		this.soDT = soDT;
		this.chuyenNganh = chuyenNganh;
		this.heDaoTao = heDaoTao;
	}
	
	
	public int getiD() {
		return iD;
	}


	public void setiD(int iD) {
		this.iD = iD;
	}


	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public String getHeDaoTao() {
		return heDaoTao;
	}
	public void setHeDaoTao(String heDaoTao) {
		this.heDaoTao = heDaoTao;
	}

	



}
