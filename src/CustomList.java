import java.util.AbstractList;
import java.util.NoSuchElementException;

public class CustomList<T> extends AbstractList<T> {
    private class Node {
        T value;
        Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    private Node head = null, tail = null;

    @Override
    public int size() {
        if (head == null)
            return 0;
        Node node = head;
        int size = 1;
        while(node != tail){
            ++size;
            node = node.next;
        }
        return size;
    }

    @Override
    public boolean add(T t) {
        addLast(t);
        return true;
    }

    @Override
    public T get(int index) {
        Node node = head;
        for(int i = 0; i < index; ++i){
            if (node.next == null)
                throw new NoSuchElementException();
            node = node.next;
        }
        return node.value;
    }

    public void addLast(T value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
        } else if (head == tail) {
            head.next = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public void addFirst(T value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        } else if (head == tail) {
            T temp = head.value;
            head = null;
            tail = null;
            return temp;
        } else {
            T temp = head.value;
            head = head.next;
            return temp;
        }
    }

    public T removeLast(){
        if (head == null) {
            throw new NoSuchElementException();
        }
        else if(head == tail){
            T temp = head.value;
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            T temp2 = tail.value;
            tail = temp;
            tail.next = null;
            return temp2;
        }
        return null;
    }



    public T getFirst() {
        return head.value;
    }

    public T getLast() {
        return tail.value;
    }

}