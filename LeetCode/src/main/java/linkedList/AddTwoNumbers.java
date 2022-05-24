package linkedList;

public class AddTwoNumbers {
	public static void main(String args[]) {
		ListNode one = new ListNode(4);
		ListNode two = new ListNode(4);
		//one.next=two;
		ListNode three = new ListNode(3);
		two.next=three;
		ListNode four = new ListNode(5);
		ListNode five = new ListNode(6);
		//four.next=five;
		ListNode six = new ListNode(4);
		five.next=six;
		System.out.println(new AddTwoNumbers().addTwoNumbers(one, four));
		System.out.println(new AddTwoNumbers().addTwoNumbers(one, four).next);
		System.out.println(new AddTwoNumbers().addTwoNumbers(one, four).next.next);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode sum = null;
		ListNode resultNode = null;
		int carryOver = 0;
		while (l1 != null || l2 != null) {
			if (sum == null) {
				sum = new ListNode();
				resultNode = sum;
				sum.next = null;
			} else {
				sum.next = new ListNode();
				sum = sum.next;
			}
			sum.val += carryOver;
			if (l1 != null) {
				sum.val += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum.val += l2.val;
				l2 = l2.next;
			}

			if (sum.val > 9) {
				sum.val = sum.val - 10;
				carryOver = 1;
			} else {
				carryOver = 0;
			}
		}
		if (carryOver == 1) {
			sum.next = new ListNode(1);
		}

		return resultNode;
	}

}
