package buoi4;

public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;

	public HinhChuNhat(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
	}

	public void hienThiThongTin() {
		System.out.println("Call method Hien Thi Thong Tin");
		System.out.println("Chieu Dai: " + this.chieuDai);
		System.out.println("Chieu Rong: " + this.chieuRong);
	}

	public void hienThiThongTin(int dai, int rong) {
		System.out.println("Call method Hien Thi Thong Tin with params");
		System.out.println("Chieu Dai: " + dai);
		System.out.println("Chieu Rong: " + rong);
	}

	public int tinhDienTich() {
		return this.chieuDai * this.chieuRong;
	}

	public int tinhDienTich(int dai, int rong) {
		return dai * rong;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

}
