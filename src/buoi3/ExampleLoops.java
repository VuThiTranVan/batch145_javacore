package buoi3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleLoops {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num = 1;
		// while(num > 10) {
		//
		// System.out.print("Nhap so bat ky: ");
		// num = sn.nextInt();
		// System.out.println("num = " + num + "\n\n");
		//
		// }

//		do {
//
//			System.out.print("Nhap so bat ky: ");
//			num = sn.nextInt();
//			System.out.println("num = " + num + "\n\n");
//
//		} while (num > 10);
		
//		String hello = "Hello";
		
//		for(int i = 0; i < hello.length(); i++) {
////		for(int j = 0, a = 1; i < hello.length(); i++) {
//			if(i == 2) {
//				continue;
//			}
//			System.out.println(hello.charAt(i));
//		}
		
//		List<String> arr = new ArrayList<>();
//		arr.add("123");
//		arr.add("h1llo");
//		for (String item : arr) {
//			System.out.println(item);
//		}

		// int num1 = 1;
		// int num2 = 5;
		// while(++num1 <= --num2) {
		// System.out.println("num1, num2 "+ num1 + "; "+ num2);
		// }
		condition1: for(int a = 1; a < 10; a++) {
			System.out.println("a = " + a);
			condition2: for(int b = 1; b <= a; b++) {
				System.out.println("b = " + b + "\n");
				break condition2;
			}
		}
	}

}
