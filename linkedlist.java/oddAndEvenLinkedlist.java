
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class oddAndEvenLinkedlist {
    public static Node NodeoddEven(Node head) {
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node t1 = dummy1;
        Node t2 = dummy2;
        Node t = head;

        while (t != null) {
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            if (t != null)
                t = t.next;
            t2 = t2.next;
        }
        t1.next = dummy2.next;
        return dummy1.next;
    }

    public static void main(String[] args) {

    }

}
