import java.util.Objects;

public class MyLinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if (head == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;

    }

    public T getIndex(int index){
        Objects.checkIndex(index,size);
        Node<T> current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.element;
    }

    public int size(){
        return size;
    }

    public void remove(int index){
        Objects.checkIndex(index, size);
        Node<T> current = head;
        for (int i = 0; i< index; i++){
            current = current.next;
        }
        if (current.previous != null) {
            current.previous.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.previous = current.previous;
        } else {
            tail = current.previous;
        }
        size--;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current  = head;
        while (current != null){
            sb.append(current.element).append(" ");
            current = current.next;

        }
        return sb.toString().trim();
    }

    static class Node<T>{
        T element;
        Node<T> next;
        Node<T> previous;

        public Node(T element) {
            this.element = element;
        }
    }
}
