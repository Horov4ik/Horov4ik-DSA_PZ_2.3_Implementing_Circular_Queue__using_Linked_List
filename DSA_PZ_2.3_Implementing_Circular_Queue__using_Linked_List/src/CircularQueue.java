import java.util.NoSuchElementException;

class CircularQueue {
    private Node front = null;
    private Node rear = null;

    public CircularQueue(){
    }

    public void enqueue(int data) { //Correct
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        rear.next = front;
    }

    public int dequeue() { //Correct
        if (front == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data;
        if (front == rear) {
            data = front.data;
            front = rear = null;
        } else {
            Node temp = front;
            data = temp.data;
            front = front.next;
            rear.next = front;
        }
        return data;
    }

    public void print() { //Correct
        if (front == null) {
            System.out.println("Null");
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}
