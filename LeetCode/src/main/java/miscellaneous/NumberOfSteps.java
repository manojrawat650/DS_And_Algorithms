//LeetCode problem link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
package miscellaneous;

public class NumberOfSteps {

	public static void main(String args[]) {
		System.out.println(new NumberOfSteps().numberOfSteps(123));
	}

	public int numberOfSteps(int num) {
		int steps = 0;
		while (num > 0) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num - 1;
			}
			steps++;
		}
		return steps;
	}
}
