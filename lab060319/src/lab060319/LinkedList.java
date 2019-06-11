package lab060319;


public class LinkedList { 
	
	
	
	
//establish the head of the list
	ListNode head;
	
//function that checks if the list is empty
	public static boolean isEmpty(LinkedList newList) {		
		if (newList.head == null) {
			return true;
		}
		
		return false;
		
	}
	
//function that makes a list empty
	public static void makeEmpty(LinkedList newList) {
		newList.head = null;
		return;
	}
	
//function that adds to the LinkedList
	public static LinkedList add(LinkedList newList, int value) {
		
		 ListNode newNode = new ListNode(value);
		newNode.next = null;
		
		
//checks to see if the list is empty 
		if(newList.head == null) {
			newList.head = newNode;
		}
//moves the head to the tail and lets a new node become the head
		else {
			
			ListNode tail = newList.head;
			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;
			
			
		}
//returns the value of newList
		return newList;
	} //end of adding function
	
	//function that removes

	
	
	
//printer that prints newList 
	public static void printList(LinkedList newList) {
		
			ListNode temp = newList.head;
			while(temp != null) {
					System.out.println(temp.value);
					temp = temp.next;
			}
		}
	

	public static void remove(LinkedList newList, Integer l) {
		
		//checks to see if the node has a value
				ListNode nodePosition = newList.head;
				ListNode trailingNode = null;
				int nodeCount = 0;
				
					while (l == 3){
						System.out.println("test");
						
						//what happens when the given value is in head
						if (nodePosition.value==l && nodePosition==newList.head) {
					           System.out.printf(" Node %s contains %s and thus will be removed\n", nodeCount, nodePosition.value);
			                    newList.head = null;
			                    break;
			                    
			                    
						}
					}
					
					
					
				}
	
	
	public static void main(String[] args) {
		
//establishes new LinkedList
		LinkedList newList = new LinkedList();
		
		System.out.println(isEmpty(newList));

		
//adding values to the newList
		newList = add(newList, 3);
		newList = add(newList, 4);
		newList = add(newList, 5);
		newList = add(newList, 6);
		newList = add(newList, 7);
		newList = add(newList, 8);

		
		
//print the new List
		printList(newList);
		
		System.out.println(isEmpty(newList));
		
	//	remove(newList, 3);
		printList(newList);

		
		makeEmpty(newList);
		System.out.println(isEmpty(newList));

		
		
	}
	
	   
}

