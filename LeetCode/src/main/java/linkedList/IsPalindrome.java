//Leetcode problem link: https://leetcode.com/problems/palindrome-linked-list/
package linkedList;

import java.util.ArrayList;
import java.util.List;

//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      
      public String toString() {
    	  return String.valueOf(this.val);
      }
  }

public class IsPalindrome {
	public static void main(String args[]) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		one.next=two;
		ListNode three = new ListNode(2);
		two.next=three;
		ListNode four = new ListNode(2);
		three.next=four;
		ListNode five = new ListNode(1);
		four.next=five;
		System.out.println(new IsPalindrome().isPalindrome(one));
	}
   
	 public boolean isPalindrome(ListNode head) {
	    	ListNode token1= head;
	    	ListNode token2 = head;
	        if (head==null) {
	        	return false;
	        }
	        if (head.next==null) {
	        	return true;
	        }
	        List<ListNode> list = new ArrayList<ListNode>();
	        boolean isSizeOdd=true;
	        while(token2.next!=null) {
	        	list.add(token1);
	        	if (token2.next.next!=null) {
	        		token1= token1.next;
	        		token2 = token2.next.next;
	        	}
	        	else {
	        		isSizeOdd=false;
	        		break;
	        	}
	        }
	       
	        if (!isSizeOdd) {
	        	token1=token1.next;
	        }
	        else {
	        	list.add(token1);
	        }
	        while(token1!=null) {
	        	
	        	 if (matchAndRemove(list, token1)) {
		        	   token1=token1.next;
		           }
	        	 else {
	        		 return false;
	        	 } 
	        }
	        return true;
	    }
	 
	 private boolean matchAndRemove(List<ListNode> list, ListNode node) {
		 if(node.val==list.get(list.size()-1).val) {
			 list.remove(list.size()-1);
			 return true;
		 }
		 return false;
	 }
}
