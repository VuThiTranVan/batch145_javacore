package Buoi5;

public class RunTest {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien("Tuan", true, 18, "Ko bjk");
		sv.gioiThieu();
		
		//down
		ConNguoi cn = new SinhVien("Tuan 1", true, 19, "Ko bjk");
		cn.gioiThieu();
		
		// up
		ConNguoi cn_up = sv;
		
			
		
	}

}
