
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class swapNodeInPair {

    public static Node swap(Node head) {
        Node a = head;
        Node b = head.next;
        Node dummy = new Node(-1);
        Node c = dummy;
        while (a != null && b != null) {
            c.next = b;
            a.next = b.next;
            b.next = c;

            c = a;
            a = a.next;
            if (a != null)
                b = a.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }

}
