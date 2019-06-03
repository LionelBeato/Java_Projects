package lab060319;


public class LinkedList {
	

	public ListNode start,last;
	public ListNode next;	
	
	public static void main(String[] args) {
		
LinkedList newList = new LinkedList();
		
		ListNode newNode = new ListNode(0);
		ListNode secondNode = new ListNode(1);
		ListNode thirdNode = new ListNode(2);
		
		newList.start = newNode;
		newList.next = secondNode;
		newList.last = thirdNode;
		
		
		System.out.println(newList.start.value);
		System.out.println(newList.next.value);
		System.out.println(newList.last.value);
		
		LinkedList check = new LinkedList();
				
		System.out.println(newList.isEmpty());
		
		
	}
	
	   
}

