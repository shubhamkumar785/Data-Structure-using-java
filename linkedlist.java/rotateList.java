
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class rotateList {
    public static int length(Node head) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static Node rotate(Node head, int k) {

        if (head == null || head.next == null) {
            return head;
        }
        int len = length(head);
        k %= len;
        Node slow = head;
        Node fast = head;

        for (int i = 0; i <= k + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node a = slow.next;
        slow.next = null;
        Node t = a;

        while (t.next != null) {
            t = t.next;
        }
        t.next = head;
        return a;

    }

    public static void main(String[] args) {

    }
}
