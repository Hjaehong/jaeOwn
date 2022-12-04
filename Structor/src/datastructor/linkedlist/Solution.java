package datastructor.linkedlist;

class ListNode{
	int val;
	ListNode next; // 래퍼런스 변수
	public ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public boolean hasCycle(ListNode head) { // 처음일때 변수 val(x)를 head에 대입하고 처음이라 next 값이 없어서 null값이 된다.
        // 베이스 케이스. head가 null이면 바로 반환한다.
        if (head == null) return false;
        
        ListNode curr = head;
        ListNode slow = curr;
        ListNode fast = curr.next;
        
        while (fast != null && fast.next != null) {
            // 만약 두 개의 포인터가 서로 만났다면 순환하는 list
            if (slow == fast) return true;
            
            // 한 번에 하나의 노드씩 움직인다
            slow = slow.next;

            // 한 번에 두개의 노드씩 움직인다
            fast = fast.next.next;
        }
        
        // 여기까지 왔다면 fast 포인터가 null을 만났다는 의미이므로 false를 반환한다
        return false;
    }
}