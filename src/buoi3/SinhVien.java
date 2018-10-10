package buoi3;

import java.util.Scanner;

public class SinhVien {

	private String ten;
	private boolean gioiTinh;
	private int soDienThoai;
	private String diaChi;

	public SinhVien(String ten, boolean gioiTinh, int soDienThoai, String diaChi) {
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	public SinhVien() {
	}

	public void hienThiThongTin() {
		System.out.println("=====");
		System.out.println("Ten: " + getTen());
		System.out.println("Gioi tinh: " + convertGioiTinh(getGioiTinh()));
		System.out.println("So dien thoai: " + getSoDienThoai());
		System.out.println("Dia chi: " + getDiaChi());
	}

	public void thayDoiSoDienThoai() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap so dien thoai muon thay doi: ");
		int phoneNum = sn.nextInt();
		setSoDienThoai(phoneNum);
	}

	public String convertGioiTinh(boolean gioiTinh) {
		if (gioiTinh) {
			return "Nam";
		}
		return "Nu";
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public boolean getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("An", true, 12345567, "Quang Nam");
		sv1.hienThiThongTin();

		sv1.thayDoiSoDienThoai();

		sv1.hienThiThongTin();

	}

}
