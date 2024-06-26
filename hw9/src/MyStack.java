import java.util.Objects;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    public void push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void remove(int index){
        Objects.checkIndex(index, size);
        if (index == 0) {
            top = top.next;
        } else {
            Node<T> current = top;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public void clear(){
        top = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public T peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }
    public T pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = top;
        while (current != null) {
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
