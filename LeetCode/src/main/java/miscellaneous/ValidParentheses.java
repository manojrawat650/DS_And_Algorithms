//Leetcode problem link: https://leetcode.com/problems/valid-parentheses/
package miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {

	public static void main(String args[]) {
		System.out.println(new ValidParentheses().isValid("[({(())}[()])]"));
	}
//alternate method	
//	public boolean isValid(String s) {
//		Map<Character,Character> map = new HashMap<>();
//		map.put(')','(');
//		map.put('}','{');
//		map.put(']','[');
//	
//		List<Character> list = new ArrayList<>();
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) ==')' || s.charAt(i)=='}' || s.charAt(i)==']') {
//				if (list.isEmpty()) {
//					return false;
//				}
//				else if (!list.get(list.size() - 1).equals(map.get(s.charAt(i)))) {
//					return false;
//				}
//				else {
//					list.remove(list.size() - 1);
//				}
//			}
//			else{
//				list.add(s.charAt(i));
//			}
//		}
//		if (list.size()>0) {
//			return false;
//		}
//		return true;
//	}
	
	public boolean isValid(String s) {
	
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (curr==')') {
				 if (list.isEmpty() || !list.get(list.size() - 1).equals('(')) {
					 return false;
				 }
				 else {
					 list.remove(list.size()-1);
				 }
			}
			else if (curr=='}') {
				 if (list.isEmpty() || !list.get(list.size() - 1).equals('{')) {
					 return false;
				 }
				 else {
					 list.remove(list.size()-1);
				 }
			}
			else if (curr==']') {
				 if (list.isEmpty() || !list.get(list.size() - 1).equals('[')) {
					 return false;
				 }
				 else {
					 list.remove(list.size()-1);
				 }
			}
			else {
				list.add(curr);
			}
		}
		if (list.isEmpty()) {
			return false;
		}
		return true;
	}
}