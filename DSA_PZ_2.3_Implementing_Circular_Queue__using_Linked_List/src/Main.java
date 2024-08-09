import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.print();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();

        queue.dequeue();
        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}