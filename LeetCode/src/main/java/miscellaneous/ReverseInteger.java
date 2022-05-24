//Leetcode problem link: https://leetcode.com/problems/reverse-integer/
package miscellaneous;

public class ReverseInteger {
	public static void main(String args[]) {
		System.out.println(new ReverseInteger().reverse(-123));
	}

	public int reverse(int x) {
		char[] input = String.valueOf(x).toCharArray();
		for (int i = 0; i < input.length / 2; i++) {
			char temp = input[i];
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;
		}
		String mid = new String(input);
		if (mid.endsWith("-")) {
			mid = "-".concat(mid.substring(0, mid.length() - 1));
		}
		int result = 0;

		try {
			result = Integer.parseInt(mid);
		} catch (NumberFormatException exception) {
			System.out.println("Number format exception :" + exception.getMessage());
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			result = 0;
		}
		return result;
	}
	
	//Ideal solution
	
//	public int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int rem= x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem> 7)) return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem< -8)) return 0;
//            rev = rev * 10 + rem;
//        }
//        return rev;
//        }
}
