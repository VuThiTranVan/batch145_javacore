package buoi6.practice;

public abstract class HinhHoc {
	int canh;

	public HinhHoc(int canh) {
		this.canh = canh;
	}

	public abstract int chuVi();

	public abstract int dienTich();

	public void hienThi() {
		System.out.println("Canh " + canh);
		System.out.println("chu vi " + chuVi());
		System.out.println("dien tich " + dienTich());
	}
}
