
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class partitionOfLinkedList {
    public static Node partition(Node head, int x) {
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node dummy3 = new Node(-1);
        Node t1 = dummy1;
        Node t2 = dummy2;
        Node t3 = dummy3;
        Node t = head;

        while (t != null) {
            if (t.data < x) {
                t1.next = t;
                t1 = t1.next;
            } else if (t.data > x) {
                t3.next = t;
                t3 = t3.next;
            } else {
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1.next = dummy2.next;
        t2.next = dummy3.next;
        t3.next = null;
        return dummy1.next;
    }

    public static void main(String[] args) {

    }
}
