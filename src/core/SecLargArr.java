package core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecLargArr {

	public static void main(String[] args) {

		int[] arr = { 21, 53, 32, 64, 76, 34, 21, 87, 34, 32, 67, 54, 23, 6 };
		//List<int []> l = Arrays.asList(arr);//array to list
		int secondLargestNum = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
		System.out.println(secondLargestNum); 
	}
	// Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
}
//Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();