package leetcode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printNodes(ListNode head) {
        ListNode tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.val + " ");
            tmpNode = tmpNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode output1 = deleteDuplicates(head1); // [1, 2]
        System.out.print("output1 = ");
        printNodes(output1);
        System.out.println();

        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode output2 = deleteDuplicates(head2); // [1, 2, 3]
        System.out.print("output2 = ");
        printNodes(output2);
        System.out.println();
    }
}
