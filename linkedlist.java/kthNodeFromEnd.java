
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class kthNodeFromEnd {

    public static Node kthFromEnd(Node head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (k > size) {
            return null;
        }
        int idx = size - k + 1;
        temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
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

        Node middle = kthFromEnd(a, 4);
        System.out.println(middle.data);

    }
}
