package com.seenu.DSA;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head1 = arrayToList(new int[]{1, 2, 3, 4, 5});
        ListNode result1 = removeNthFromEnd(head1, 2);
        printList(result1); // Output: 1 2 3 5

        ListNode head2 = arrayToList(new int[]{1});
        ListNode result2 = removeNthFromEnd(head2, 1);
        printList(result2); // Output: (empty)

        ListNode head3 = arrayToList(new int[]{1, 2});
        ListNode result3 = removeNthFromEnd(head3, 1);
        printList(result3); // Output: 1
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Helper method to convert array to linked list
    public static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}


