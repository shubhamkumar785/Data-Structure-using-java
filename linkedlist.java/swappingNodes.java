
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class swappingNodes {

    public static Node swap(Node head, int k) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (k > size) {
            return null;
        }
        Node first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        int idx = size - k;
        Node second = head;
        for (int i = 0; i < idx; i++) {
            second = second.next;
        }
        int val = first.data;
        first.data = second.data;
        second.data = val;

        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        Node head = swap(a, 2);
        print(head);

    }
}
