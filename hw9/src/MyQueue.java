public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T value){
        Node<T> newNode = new Node<>(value);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }
    public void clear(){
        head = tail = null;
        size = 0;
        System.out.println("The queue has been cleared up");
    }
    public int getSize(){
        System.out.print("The size of collection is - ");
        return size;
    }
    public T peek(){
        if (head == null){
            System.out.println("The queue is empty");
        }
        System.out.print("The first element of queue is - ");
        return head.data;
    }
    public T pool(){
        if (head == null){
            System.out.println("The queue is empty");
        }
        T element = head.data;
        head = head.next;
        size--;
        System.out.print("Pooling - ");
        return element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       Node<T> current  = head;
        while (current != null){
            sb.append(current.data).append(" ");
            current = current.next;

        }
        return sb.toString().trim();
    }

    static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }


}
