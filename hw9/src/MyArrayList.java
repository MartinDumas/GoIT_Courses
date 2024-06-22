import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private T[] elements;
    private int size;

    public MyArrayList() {
        this.elements = (T[]) new Object[10];
        this.size = size;
    }

    public void add(T element){
        if (size == elements.length){
            elements = Arrays.copyOf(elements, elements.length*2);
        }
         elements[size] = element;
         size++;

    }
    public T getIndex(int index){
        Objects.checkIndex(index, size);
        return elements[index];
    }

    public void remove(int index){
        Objects.checkIndex(index, size);

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;

    }
    public void clear(){
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }


    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
