package java_8;

import java.util.Arrays;

public class ArrSort {

	public static void main(String[] args) {
		int[] a = { 43, 54, 56, 3, 54, 76, 2, 5, 7, 6, 8, 3, 54, 23, 45, 6, 3, 45, 7, 6 };
		for (int aa : a) {
			System.out.println(aa);
		}
			System.out.println("Arrays element after sorting:");
			Arrays.parallelSort(a,0,4);
			for (int aaa : a) {   
				System.out.println(aaa);
			}

		

	}

}
