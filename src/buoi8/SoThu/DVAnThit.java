package buoi8.SoThu;

public abstract class DVAnThit extends DongVat {

	public DVAnThit(String ten, int code) {
		super(ten, code);
	}
	@Override
	public String gioChoAn() {
		return GioChoAn.SangSom.toString();
	}
}
