//LeetCode problem link: https://leetcode.com/problems/middle-of-the-linked-list/
package linkedList;


 // Definition for singly-linked list.
//written inside IsPalindrome class
 
public class FindMiddleNode {
	public static void main(String args[]) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		one.next=two;
		ListNode three = new ListNode(3);
		two.next=three;
		ListNode four = new ListNode(5);
		three.next=four;
		ListNode five = new ListNode(1);
		four.next=five;
		ListNode six = new ListNode(1);
		five.next=six;
		System.out.println("Middle node: "+new FindMiddleNode().middleNode(one).val);
	}
	 public ListNode middleNode(ListNode head) {
	        if (head==null) {
	        	return head;
	        }
	        ListNode slow =head;
	        ListNode fast =head;

	        while(fast.next!=null && fast.next.next!=null) {
	        	slow = slow.next;
	        	fast = fast.next.next;
	        }
	        if (fast.next!=null) {
	        	slow = slow.next;
	        }
	        return slow;
	    }
}
