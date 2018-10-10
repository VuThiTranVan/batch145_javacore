package buoi8.SoThu;

public class ConMeo extends ThuNuoi {

	public ConMeo(String ten, int code) {
		super(ten, code);
	}

	@Override
	public void tamRua() {
		System.out.println("Tui la meo tui ko thich tam rua");
	}
}
