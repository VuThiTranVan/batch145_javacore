package buoi4;

public class ExampleStatic {
	private int a;

	private static int b;

	public void exampl1() {
		System.out.println(this.a);
		System.out.println(ExampleStatic.b);
	}

	public static void exampl2() {
		// System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
