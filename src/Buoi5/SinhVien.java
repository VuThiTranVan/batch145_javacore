package Buoi5;

public class SinhVien extends ConNguoi {

	public SinhVien() {
		super();
	}

	public SinhVien(String ten, boolean gioiTinh, int tuoi) {
		super(ten, gioiTinh, tuoi);
	}

	public SinhVien(String ten, boolean gioiTinh, int tuoi, String truongHoc) {
		super(ten, gioiTinh, tuoi);
		this.truongHoc = truongHoc;
	}

	private String truongHoc;

//	public void gioiThieu() {
//		super.gioiThieu();
//		System.out.println("Truong hoc: " + getTruongHoc());
//	}

	@Override
	public void gioiThieu() {
		System.out.println("Ten: " + getTen());
		System.out.println("Truong hoc: " + getTruongHoc());
	}

	public String getTruongHoc() {
		return truongHoc;
	}

	public void setTruongHoc(String truongHoc) {
		this.truongHoc = truongHoc;
	}
}
