package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Q.there are two integer list, we have to merge or concat those list ?
*/
public class MergeToList {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 8, 9);

		// we have to create two stream which is going to add both list in a stream
		// class
		Stream<Integer> fullStream = Stream.concat(list1.stream(), list1.stream());
		// apply stream
		List<Integer> mergeList = fullStream.collect(Collectors.toList());
		System.out.println(mergeList);

		// remove duplicates elements from a mergelist
		Set<Integer> uniqueElements = mergeList.stream().collect(Collectors.toSet());
		System.out.println(uniqueElements);

		// print minimum and maximum numbers from unique list

		/*
		 * int minimum = uniqueElements.stream().min((a, b) -> a - b).get();
		 * System.out.println(minimum);
		 */

		int maximum = uniqueElements.stream().max((x1, x2) -> x1 - x2).get();
		System.out.println(maximum);
	}
}
