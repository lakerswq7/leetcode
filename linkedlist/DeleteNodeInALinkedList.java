package linkedlist;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        int val = node.next.val;
        node.next = node.next.next;
        node.val = val;
    }
}
