package classExamples;

import java.util.Scanner;

public class ConNguoi {

	private String ten;
	
	public ConNguoi() {
		
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void gioiThieuBanThan() {
		System.out.println("Class Con Nguoi");
		System.out.println("Ten: " + ten);
	}
	
	public void gioiThieuBanThan(String param_ten) {
		System.out.println("\n\nClass Con Nguoi");
		System.out.println("Ten: " + param_ten);
	}
	
	
	public void nhapTuBanPhim() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hay nhap ten: ");
		String ten_input = scanner.nextLine();
		
		gioiThieuBanThan(ten_input);
	}
	
	
	
}
