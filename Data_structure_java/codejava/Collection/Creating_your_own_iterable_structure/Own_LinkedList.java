package codejava.Collection.Creating_your_own_iterable_structure;
import java.util.Iterator;
import java.util.NoSuchElementException;
class LinkedList<T> implements Iterable<T>{
    Node<T> head, current;

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
        }
    }

    public LinkedList(T data){
        head = new Node<>(data);
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T>{
        Node<T> node = head;
        @Override
        public boolean hasNext(){
            return node != null ;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }

            Node<T> prevNode = node;
            node = node.next;

            return prevNode.data;
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException("Removal logic not implemented");
        }
    }

    public void add(T data){
        current = head;
        while(current.next != null){
            current = current.next;
            current.next = new Node <> (data);
        }
    }
}
public class Own_LinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(1);

        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Print List : ");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next()) ;
        }
    }
}
