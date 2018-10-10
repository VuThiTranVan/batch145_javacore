package buoi3;

public class HinhVuong {
	public HinhVuong() {
		// TODO Auto-generated constructor stub
	}

	public HinhVuong(int canh) {
		this.canh = canh;
	}

	int canh;

	int tinhChuVi() {
		return canh * 4;
	}

	int tinhChuVi(int canhHV) {
		return canhHV * 4;
	}

	public static void main(String[] args) {

		HinhVuong hv3 = new HinhVuong(1);
		System.out.println(hv3.tinhChuVi());
		
		HinhVuong hv4 = hv3;
		System.out.println(hv4.tinhChuVi());
		hv4.canh = 10;
		System.out.println(hv4.tinhChuVi());
		HinhVuong hv5;
		
//		
//		HinhVuong hv = new HinhVuong();
//		hv.canh = 3;
//		System.out.println(hv.tinhChuVi());
//		System.out.println(hv.tinhChuVi(2));
//
//		HinhVuong hv2 = new HinhVuong();
//		hv2.canh = 6;
//		System.out.println(hv2.tinhChuVi());
//		System.out.println(hv2.tinhChuVi(8));

	}

}
