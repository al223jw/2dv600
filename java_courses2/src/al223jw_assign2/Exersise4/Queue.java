package al223jw_assign2.Exersise4;

import java.util.Iterator;

public class Queue<E> implements QueueI<E> {
    private Node tail;
    private Node head;
    private int size = 0;

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public void enqueue(E element) {
        if (head == null){
            head = new Node(element);
            tail = head;
        }

        else {
            tail.setNext(new Node(element));
            tail = tail.getNext();
        }
        size++;
    }


    @Override
    public E dequeue() throws IndexOutOfBoundsException {
        if(head != null){
            Node headTobeRemoved = head; //

            head = headTobeRemoved.getNext();
            size--;

            return headTobeRemoved.getObject();
        }
        else{
            throw new IndexOutOfBoundsException();
        }

    }


    @Override
    public E first() throws IndexOutOfBoundsException {
        if(head != null){
            return head.getObject();
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }


    @Override
    public E last() throws IndexOutOfBoundsException {
        if(head != null){
            return tail.getObject();
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }


    @Override
    public Iterator iterator() {
        return new ListIterator();
    }


    private class ListIterator implements Iterator<E> {

        private Node node = head;


        @Override
        public boolean hasNext() {
            return node != null;
        }


        @Override
        public E next() {

            if(node != null){
                E val = node.getObject();
                node = node.getNext();
                return val;
            }
            else{
                throw new IndexOutOfBoundsException();
            }
        }
    }


    private class Node{

        private Node next = null;
        private E _obj;

        public Node(E obj){
            _obj = obj;
        }

        public E getObject(){
            return _obj ;
        }

        public void setNext(Node obj){
            next = obj;
        }

        public Node getNext(){
            return next;
        }

    }
}