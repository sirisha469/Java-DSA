//https://leetcode.com/problems/palindrome-linked-list/description/
package LinkedList;

public class PalindromeLL {

  class ListNode {
    int val;
    ListNode next;
  }
  public ListNode findMid(ListNode head){
    ListNode slow = head;
    ListNode fast = head;

    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}

public ListNode reverse(ListNode head){
    ListNode prev = null;
    ListNode current = head;

    while(current!=null){
        ListNode nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;
    }

    return prev;
}
public boolean isPalindrome(ListNode head) {
    ListNode mid = findMid(head);
    ListNode secondHalf = reverse(mid);

    while(head!=null && secondHalf!=null){
        if(head.val!=secondHalf.val){
            return false;
        }
        head = head.next;
        secondHalf = secondHalf.next;
    }

    return true;
}
}
