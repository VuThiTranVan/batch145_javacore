package buoi4;

import java.util.Scanner;

public class RunHinhChuNhat {

	public static void main(String[] args) {
		HinhChuNhat hcn1 = new HinhChuNhat(2, 3);

		hcn1.hienThiThongTin();
		System.out.println("Dien tich: " + hcn1.tinhDienTich());

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Chieu Dai: ");
		int chieuDai = sc.nextInt();
		
		System.out.print("\nNhap Chieu Rong: ");
		int chieuRong = sc.nextInt();
		HinhChuNhat hcn2 = new HinhChuNhat();
		hcn2.hienThiThongTin(chieuDai, chieuRong);
		hcn2.tinhDienTich(chieuDai, chieuRong);
	}

}
