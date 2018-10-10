package Buoi5;

public class Developer extends NhanVien {
	public Developer(int code, String ten) {
		super(code, ten);
		this.language = "hi";
	}

	private String language;

	@Override
	public void congViec() {
		System.out.println("Tui di code dao");
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
