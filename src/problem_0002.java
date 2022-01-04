
public class problem_0002 {


	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode ans = new ListNode();
		ListNode current = ans;
		ListNode dummy = new ListNode(0);
		
		int carry = 0;

		while(l1 != dummy|| l2 != dummy)
		{
			int a = l1 ==  dummy? 0:l1.val;
			int b = l2 ==  dummy? 0:l2.val;
			
			int sum = a + b+ current.val;

			if(sum >=10) 
			{
				carry = sum /10;
				sum -=10;
			}

			current.val = sum;
			
			
			if( l1.next != null ||l2.next != null)
			{
				current.next = new ListNode(carry);
				current= current.next;
				carry =0;
			}


			if (l1.next != null)
				l1 = l1.next;
			else
				l1 =  dummy;
			if (l2.next != null)
				l2 = l2.next;
			else
				l2 = dummy;


		}

		return ans;

	}

}
