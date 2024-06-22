import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------ArrayList---------------------------------");

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("My");
        myArrayList.add("name");
        myArrayList.add("is");
        myArrayList.add("Martin");
        myArrayList.add("I");
        myArrayList.add("love");
        myArrayList.add("Java");
        myArrayList.add("and");
        myArrayList.add("GoIt");
        System.out.println(Arrays.toString(myArrayList.getElements()));
        System.out.println(myArrayList.getSize());

        myArrayList.remove(7);
        System.out.println(Arrays.toString(myArrayList.getElements()));
        System.out.println(myArrayList.getSize());
        myArrayList.remove(7);
        System.out.println(Arrays.toString(myArrayList.getElements()));
        System.out.println(myArrayList.getSize());

        System.out.println(myArrayList.getIndex(4));

        myArrayList.clear();
        System.out.println(Arrays.toString(myArrayList.getElements()));

        System.out.println("--------------------------LinkedList---------------------------------");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
       myLinkedList.add("Hello");
        myLinkedList.add("My");
        myLinkedList.add("name");
        myLinkedList.add("is");
        myLinkedList.add("Martin");
        myLinkedList.add("I");
        myLinkedList.add("love");
        myLinkedList.add("Java");
        myLinkedList.add("and");
        myLinkedList.add("GoIt");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.getIndex(4));
        myLinkedList.remove(7);
        myLinkedList.remove(7);
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myArrayList.getSize());
        System.out.println(myLinkedList);

        System.out.println("--------------------------Queue---------------------------------");

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        myQueue.add(3);
        myQueue.add(5);
        myQueue.add(7);
        myQueue.add(9);
        System.out.println(myQueue);
        System.out.println(myQueue.getSize());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pool());
        System.out.println(myQueue.getSize());
        System.out.println(myQueue.peek());
        myQueue.clear();
        System.out.println(myQueue);
        System.out.println(myQueue.getSize());

        System.out.println("--------------------------Stack---------------------------------");

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);
        myStack.push(10);
        System.out.println(myStack);
        System.out.println(myStack.getSize());
        myStack.remove(4);
        System.out.println(myStack);
        System.out.println(myStack.getSize());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack);
        myStack.clear();
        System.out.println(myStack.getSize());

        System.out.println("--------------------------HashMap---------------------------------");
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Martin", 19);
        myHashMap.put("Maksym", 21);
        myHashMap.put("Nazar", 17);
        myHashMap.put("Artem", 31);
        myHashMap.put("Danylo", 45);
        System.out.println(myHashMap);

        System.out.println(myHashMap.getSize());

        System.out.println(myHashMap.get("Maksym"));

        myHashMap.remove("Danylo");
        System.out.println(myHashMap);
        System.out.println(myHashMap.getSize());

        myHashMap.clear();
        System.out.println(myHashMap);
        System.out.println(myHashMap.getSize());
    }
}