package buoi3;

import java.util.Scanner;

public class ExampleNestedIf {

	public static void main(String[] args) {
		// int a = 1;
		// int b = 1;
		//
		// if(a == 1) {
		// System.out.println("a = " + a);
		// if (b > 1) {
		// System.out.println("b = " + b);
		// }
		// else {
		// System.out.println("else cua if trong");
		// }
		// } else {
		// System.out.println("else cua if ngoai");
		// }

		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap so bat ky");
		int num = sn.nextInt();
		// if (num == 1) {
		// System.out.println("Day la so " + num);
		// } else if (num == 2) {
		// System.out.println("Day la so " + num);
		// } else {
		// System.out.println("Day la so " + num);
		// }

		switch (num) {
		case 1:
			System.out.println("Day la so " + num);
		case 2:
			System.out.println("case 2: Day la so " + num);
			System.out.println("case 2: Day la so " + num);
			System.out.println("case 2: Day la so " + num);
			break;
		case 3:
			System.out.println("case 3: Day la so " + num);
			break;
		default:
			break;
		}

	}

}
