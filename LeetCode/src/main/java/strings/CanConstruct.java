//Leetcode problem link: https://leetcode.com/problems/ransom-note/
package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CanConstruct {
     public static void main(String args[]) {
    	 System.out.println(new CanConstruct().canConstruct("ab", "aaabbb"));
     }
	 public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length()>magazine.length()) {
			return false;
		}	
		else {
			Map<Character, Integer> map1 = new HashMap<>();
			Map<Character, Integer> map2 = new HashMap<>();
		    for (int i=0;i<magazine.length();i++) {
		    	try {
				Integer count1 = map1.get(ransomNote.charAt(i));
				count1 = count1 != null ? ++count1 : 1;
				map1.put(ransomNote.charAt(i), count1);
				}
		    	catch(IndexOutOfBoundsException e) {
		    		//do nothing
		    	}
		    	Integer count2 = map2.get(magazine.charAt(i));
				count2 = count2 != null ? ++count2 : 1;
				map2.put(magazine.charAt(i), count2);
		    }	

			for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
				if (entry.getValue() > (map2.get(entry.getKey()) == null ? 0 : map2.get(entry.getKey()))) {
					return false;
				}

			}
		}
	        return true;
	    }
}
