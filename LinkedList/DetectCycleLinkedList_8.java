package LinkedList;

import java.util.HashSet;

public class DetectCycleLinkedList_8 {
    public static void main(String args[])
    {
        ListNode start = new ListNode(10);
        start.next = new ListNode(12);
        start.next.next = new ListNode(13);
        start.next.next.next = new ListNode(14);
        start.next.next.next.next = start;
       // start.next.next.next.next.next = new ListNode(11);
       // start.next.next.next.next.next.next = new ListNode(10);
        boolean b=DetectCycleLL_2(start);
        System.out.println(b);
    }

    public static boolean DetectCycleLL(ListNode head)
    {
        if(head == null)
        {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null)
        {
                if(slow == fast)
                {
                    return true;
                }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }


    public static boolean DetectCycleLL_2(ListNode head)
    {
        HashSet<ListNode> hset=new HashSet<>();

        while(head != null) {
            if (hset.contains(head)) {
                return true;
            }
            hset.add(head);
            head = head.next;
        }
        return false;
    }
}
