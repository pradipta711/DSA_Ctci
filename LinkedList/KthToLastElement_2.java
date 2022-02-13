package LinkedList;

public class KthToLastElement_2 {
    public static void main(String args[])
    {
        ListNode start = new ListNode(10);
        start.next = new ListNode(12);
        start.next.next = new ListNode(13);
        start.next.next.next = new ListNode(14);
        start.next.next.next.next = new ListNode(9);
        int result = getNthFromLast(start,3);
        System.out.println(result);
    }



    public static int getNthFromLast(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp1 = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (n > count) {
            return -1;
        }

        count = count - n;
        for (int i = 0; i < count; i++) {
            temp1 = temp1.next;
        }
        return temp1.val;
    }
}