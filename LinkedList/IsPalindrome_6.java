package LinkedList;

public class IsPalindrome {

    public static void main(String args[])
    {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        /*start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(3);
        start.next.next.next.next = new ListNode(7);
        start.next.next.next.next.next = new ListNode(9);
        //start.next.next.next.next.next.next = new ListNode(10);*/
        System.out.println(isPalindome(start));
    }

    public static boolean isPalindome(ListNode head)

    {
        //Reverse half of the LinkedList from mid
        if(head == null)
            return true;

        ListNode mid = getMid(head);
        ListNode last = reverse(mid);
        ListNode curr= head;

        while(last != null)
        {
            if(last.val != curr.val)
                return false;
            last = last.next;
            curr = curr.next;
        }
        return true;

    }

    public static ListNode getMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast= head;

        while(fast != null  && fast.next != null)
        {
            fast= fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode previous = null;

        while(head != null)
        {
            ListNode nextNode = head.next;
            head.next = previous;
            previous = head;
            head = nextNode;
        }
        return previous;
    }

}
