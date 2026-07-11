
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class reorderList {

    public void reorderList(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = reverse(slow.next);
        slow.next = null;

        Node t1 = head;
        Node t2 = head2;
        while (t1 != null && t2 != null) {

            Node next1 = t1.next;
            Node next2 = t2.next;

            t1.next = t2;
            t2.next = next1;

            t1 = next1;
            t2 = next2;
        }
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {

    }

}
