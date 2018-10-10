package buoi4;

public class ExampleMethods {

	public static void main(String[] args) {
		// int sum = ExampleMethods.sumTwoNumber(2, 5);
		//
		// int sum12 = sumTwoNumber(2, 5);
		//
		// System.out.println("sum = " + sum);
		//
		// ExampleMethods exx = new ExampleMethods();
		// int sum2 = exx.sumTwoNumber();

//		is_student(true);

	}
	
	public static int sumTwoNumber1(float a, int b) {
		int sum2 = (int)a + b;
		return sum2;
	}

	public static void is_student(boolean flag_student) {
		if (flag_student) {
			System.out.println("la sinh vien");
//			return;
		}
		System.out.println("Hello method student()");
		System.out.println("Hello method student()");
		System.out.println("Hello method student()");
	}

	public static int sumTwoNumber(int a, int b) {
		int sum = a;
		int sum2 = a + b;
		return sum;
	}

	public int sumTwoNumber() {
		int a = 4;
		int b = 2;
		return a + b;
	}

}
