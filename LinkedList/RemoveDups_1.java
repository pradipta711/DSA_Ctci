package LinkedList;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDups_1 {
    static ListNode s;

    public static void main(String args[]) {

        ListNode start = new ListNode(10);
        start.next = new ListNode(12);
        start.next.next = new ListNode(11);
        start.next.next.next = new ListNode(11);
        start.next.next.next.next = new ListNode(12);
        start.next.next.next.next.next = new ListNode(11);
        start.next.next.next.next.next.next = new ListNode(10);


        System.out.println(
                "Linked list before removing duplicates :");
        printList(start);

        //ListNode n= deleteDuplicatesSortedList(start);
        delDuplicatesUnSortedList(start);

        System.out.println(
                "\nLinked list after removing duplicates :");
        printList(start);
        /**
        printList(start);
        System.out.println("++++++++++++++++++++++++++++++++++");
         s = deleteDuplicatesSortedList(start);
        printList(s);
         */

    }

    public static void printList(ListNode head)
    {
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }


    public static ListNode deleteDuplicatesSortedList(ListNode head) {
        ListNode current = head;
        while(current != null || current.next != null)
        {
            if(current.next.val == current.val)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
        return head;
    }


    static void delDuplicatesUnSortedList(ListNode head)
    {
        //Hashset to store seen values
        HashSet<Integer> hset = new HashSet<>();
        ListNode prev = null;
        ListNode current = head;

        while(current != null)
        {
            if(hset.contains(current.val))
            {
                prev.next = current.next;
            }
            else{
                hset.add(current.val);
                prev = current;
            }
            current = current.next;
        }
    }

}


