package buoi4;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrays {

	public static void main(String[] args) {
		int[] arrInt = { 1, 2, 3, 4, 5, 3, 4, 10, 20 };

//		for (int i : arrInt) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

//		boolean flagChan = false;
//
//		for (int i = 0; i < arrInt.length; i++) {
//			if (arrInt[i] % 2 == 0) {
//				if (!flagChan) {
//					System.out.println("vi tri: " + i);
//					flagChan = true;
//				}
//				System.out.println(arrInt[i]);
//			}
//		}
//		
//		int[][] arrMul = {{1, 2}, {3, 4}, {5, 6}};
//		System.out.println("length " + arrMul);
//		for(int i = 0; i < arrMul.length; i++) {
//			for (int j = 0; j < arrMul[i].length; j++) {
//				System.out.println("a[" + i + "]["+ j +"] = " + arrMul[i][j]);
//			} 
//		}
////		
//		List list = new ArrayList<Object>();
//		
//		list.add(12);
//		list.add("qfnjn");
//		for (Object object : list) {
//			System.out.println(object);
//		}

		
		String str = new String("Hello batch 145");
		
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 11));
		Integer in = new Integer(111);
	}

}
