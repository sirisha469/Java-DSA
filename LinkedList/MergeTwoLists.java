//https://leetcode.com/problems/sort-list/description/
package LinkedList;

public class MergeTwoLists {

  class ListNode{
    int val;
    ListNode next;

    ListNode(){

    }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummyHead = new ListNode();
        ListNode main = dummyHead;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                main.next = list1;
                list1 = list1.next;
                main = main.next;
            }
            else{
                main.next = list2;
                list2 = list2.next;
                main = main.next;
            }
            
        }

        while(list1!=null){
            main.next = list1;
            list1 = list1.next;
            main = main.next;
        }

        while(list2!=null){
            main.next = list2;
            list2 = list2.next;
            main = main.next;
        }

        return dummyHead.next;
    }
}
