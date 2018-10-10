package buoi2;

import java.util.Scanner;

import classExamples.ConNguoi;

public class TestVariable {
	final float PI = 3.14f;
	private String instanceVariable = "instance";

	private static String localVariable = "local";

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Hay nhap vao mot so: ");
		int num = sn.nextInt();

		if ("aaa".equals("wqqq")) {
			
		}
		if (num == 2) {
			System.out.println("Nhap vao so " + num + " - la thu 2");
		} else if (num == 3) {
			System.out.println("Nhap vao so " + num + " - la thu 3");
		} else if (num == 4) {
			System.out.println("Nhap vao so " + num + " - la thu 4");
		} else if (num == 5) {
			System.out.println("Nhap vao so " + num + " - la thu 5");
		} else if (num == 6) {
			System.out.println("Nhap vao so " + num + " - la thu 6");
		} else if (num == 7) {
			System.out.println("Nhap vao so " + num + " - la thu 7");
		} else if (num == 8) {
			System.out.println("Nhap vao so " + num + " - la chu nhat");
		} else {
			System.out.println("Nhap vao so " + num + " - Nhap du lieu sai");
		}

		// TestVariable t = new TestVariable();
		// System.out.println(t.PI);
		//
		// t.localVariable = "hell";
		//
		// TestVariable.localVariable = "my classsss";
		//
		// t.localMethod();
		//
		// TestVariable.localMethod();
		//
		// int i = 1;
		// int j = 1;
		//
		// System.out.println(i++);
		//
		// System.out.println(++j);
		//
		// System.out.println(i);
		//
		// System.out.println(j);

		int i = 10;
		float f = i;

		float f1 = 1233312333123.13f;
		int i1 = (int) f1;
		System.out.println(i1);

		// t.localVariable();
		//
		//
		// Integer tuoi;
		// int age = 10;

		// ConNguoi cn1 = new ConNguoi();
		// cn1.setTen("van");
		// System.out.println("cn1.ten = " + cn1.getTen());
		//
		// ConNguoi cn2 = new ConNguoi();
		//// cn2.setTen("1111");
		// System.out.println("cn2.ten = " + cn2.getTen());
		//
		//
		// System.out.println(myLocal);

	}

	public void localVariable() {
		String myLocal = "123455";
		System.out.println(myLocal);
	}

	public static void localMethod() {
		String myLocal = "123455";
		System.out.println(myLocal);
	}

}
