package Java8;

import java.util.Arrays;

public class findArrayElement {
	public static void main(String[] args) {
		int[] a1 = { 4,9,4 };
		int[] a2 = { 9,4,9,4};

		// convert the array into stream
		Arrays.stream(a1).filter(x -> Arrays.stream(a2).anyMatch(y -> y == x))
		.distinct().forEach(System.out::println);

	}
}
