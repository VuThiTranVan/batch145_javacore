package Buoi5;

public class ConNguoi {
	private String ten;
	private boolean gioiTinh;
	private int tuoi;

	public ConNguoi(String ten, boolean gioiTinh, int tuoi) {
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
	}

	public ConNguoi() {

	}

	public void gioiThieu() {
		System.out.println("Ten: " + getTen());
		System.out.println("Tuoi: " + getTuoi());
		System.out.println("Gioi tinh: " + getGioiTinh());
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

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
}
