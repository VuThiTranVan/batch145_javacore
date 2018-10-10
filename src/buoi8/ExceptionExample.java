package buoi8;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			result();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("qqqq" + e.getMessage());
		}
		System.out.println("done");
	}

	// public static void chiaHaiSo(int a, int b) {
	// try {
	// System.out.println(a / b);
	// System.out.println("chiaHaiSo");
	// } catch (ArithmeticException e) {
	// throw e;
	// }
	// // System.out.println(a / b);
	//
	// }
	//
	// public static void chiaHaiSo(int a, int b) throws ArithmeticException {
	// try {System.out.println(a / b);
	// } catch (Exception e) {
	// System.out.println(e.getMessage());
	// }
	// System.out.println("result chiaHaiSo");
	//
	// }

	public static void chiaHaiSo1(int a, int b) throws MyException {
		int i = 0;
//		try {
			i = 1;
			if (i == 1)
				throw new MyException("my exception ");
			System.out.println(a / b);

//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException");
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		} finally {
//			System.out.println("finally, i = " + i);
//		}

		System.out.println("result chiaHaiSo1; i = " + i);
	}

	public static void result() throws MyException {
		System.out.println("result");
		// chiaHaiSo(10, 0);
		chiaHaiSo1(10, 1);

		System.out.println("result final");

	}

	// public static void chiaHaiSo(int a, int b) {
	// try {
	// System.out.println(a / b);
	// } catch (ArithmeticException e) {
	// System.out.println(e.getMessage());
	// throw e;
	// }
	// }
	//

	//
	// public static int chiaHaiSo(int a, int b) {
	// try {
	// return a / b;
	// } catch (ArithmeticException e) {
	// System.out.println(e.getMessage());
	// throw e;
	// }
	// }

}
