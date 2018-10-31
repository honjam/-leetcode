package leetcode.addTwoNumber;

import java.util.Arrays;

/*
You are given two non-empty linked lists representing 
two non-negative integers. The digits are stored in reverse order 
and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, 
except the number 0 itself.
Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/
public class addTwoNumber {

	public static void main(String[] args) {
		ListNode L1_1 = new ListNode(2);
		ListNode L1_2 = new ListNode(4);
		ListNode L1_3 = new ListNode(3);
		L1_1.next = L1_2;
		L1_2.next = L1_3;

		ListNode L2_1 = new ListNode(5);
		ListNode L2_2 = new ListNode(6);
		ListNode L2_3 = new ListNode(4);
		L2_1.next = L2_2;
		L2_2.next = L2_3;

		addTwoNumber test = new addTwoNumber();
		ListNode result = test.addTwoNumber(L1_1, L2_1);

		while(result!=null)
		{
			System.out.println(result.val);
			result=result.next;
		}
		
	}

	public ListNode addTwoNumber(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		int sum = 0;
		ListNode cur = dummy;
		ListNode p1 = l1, p2 = l2;

		while (p1 != null || p2 != null) {
			if (p1 != null) {
				sum += p1.val;
				p1 = p1.next;
			}

			if (p2 != null) {
				sum += p2.val;
				p2 = p2.next;
			}

			cur.next = new ListNode(sum % 10);
			sum /= 10;
			cur = cur.next;
		}
		if (sum == 1) {
			cur.next = new ListNode(1);
		}

		return dummy.next;

	}

}
