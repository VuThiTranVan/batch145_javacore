package buoi6;

public class Duck extends DongVat implements CanSwim, CanFly {

	public static void main(String[] args) {
		Duck convit = new Duck();
		convit.canSwim();
		convit.fly();
		convit.nhipTim = 10;
		System.out.println("Nhip tim: " + convit.nhipTim);

	}

	@Override
	public void canSwim() {
		System.out.println("tui co the boi");

	}

	@Override
	public void fly() {
		System.out.println("tui co the bay");
	}

}
