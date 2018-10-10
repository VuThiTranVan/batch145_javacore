package Buoi5;

public abstract class NhanVien {
	private int code;
	private String ten;
	public NhanVien(int code, String ten) {
		this.code = code;
		this.ten = ten;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public abstract void congViec();
}
