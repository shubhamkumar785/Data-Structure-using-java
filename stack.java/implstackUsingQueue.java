import java.util.LinkedList;
import java.util.Queue;

public class implstackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {

        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        q1.add(x);

        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.remove();
        }
    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q1.remove();
    }

    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        implstackUsingQueue st = new implstackUsingQueue();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top Element: " + st.peek());

        System.out.println("Popped Element: " + st.pop());

        System.out.println("Top Element After Pop: " + st.peek());

        System.out.println("Is Stack Empty? " + st.isEmpty());
    }
}