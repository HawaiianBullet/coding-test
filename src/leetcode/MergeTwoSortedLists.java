package leetcode;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answerNode = new ListNode(0);
        ListNode currentNode = answerNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        currentNode.next = list1 != null ? list1 : list2;

        return answerNode.next;
    }

    public static void main(String[] args) {
        ListNode node13 = new ListNode(4);
        ListNode node12 = new ListNode(2, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node23 = new ListNode(4);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);

        ListNode mergedNode = mergeTwoLists(node11, node21);
        while (mergedNode != null) {
            System.out.println(mergedNode.val);
            mergedNode = mergedNode.next;
        }
    }
}
