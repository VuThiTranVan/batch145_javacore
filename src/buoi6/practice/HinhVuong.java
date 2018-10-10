package buoi6.practice;

public class HinhVuong extends HinhHoc {

	public HinhVuong(int canh) {
		super(canh);
	}

	@Override
	public int chuVi() {
		return canh * 4;
	}

	@Override
	public int dienTich() {
		return canh * canh;
	}	

	public static void main(String[] args) {
		HinhVuong hv = new HinhVuong(2);
		hv.hienThi();
		
		System.out.println("\n");
		HinhHoc hv2 = new HinhVuong(5);
		hv2.hienThi();
		
		System.out.println("\n");
		// class vo danh
		HinhHoc hh1 = new HinhHoc(4) {
			
			@Override
			public int dienTich() {
				return (canh+canh)*2;
			}
			
			@Override
			public int chuVi() {
				return canh*canh;
			}
		};
		hh1.hienThi();
		
	}

}
