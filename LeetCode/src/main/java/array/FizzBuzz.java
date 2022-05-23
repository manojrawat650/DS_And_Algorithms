//Leetcode problem link: https://leetcode.com/problems/fizz-buzz/
package array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String args[]) {
		System.out.println(new FizzBuzz().fizzBuzz(17));
	}

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				list.add("Fizz");
				if (i % 5 == 0) {
					list.set(i-1, "FizzBuzz");
				}
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;

	}

}
