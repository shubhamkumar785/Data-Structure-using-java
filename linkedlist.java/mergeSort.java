class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class mergeSort {
    public static Node merge(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null || fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head = merge(head);
        head2 = merge(head2);
        return sort(head, head2);
    }

    public static Node sort(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node t = dummy;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                t.next = t1;
                t1 = t1.next;
                t = t.next;
            } else {
                t.next = t2;
                t2 = t2.next;
                t = t.next;
            }
        }
        if (t1 == null) {
            t.next = t2;
        } else {
            t.next = t1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}