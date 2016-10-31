package al223jw_assign1;

import java.util.Iterator;

public class QueueMain {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(6);

        Iterator<Object> iterator = queue.iterator();
        System.out.println("Values in the Queue: ");

        while(iterator.hasNext())
        {
            System.out.println(iterator.next() + ", ");
        }
        System.out.println();
        System.out.println("______");

        System.out.println("Size:"+queue.size());
        System.out.println("-----");
        System.out.println("First:"+queue.first());
        System.out.println("-----");
        System.out.println("Last:"+queue.last());
        System.out.println("-----");
        System.out.println("dequeue() | response :"+queue.dequeue());
        System.out.println("-----");
        System.out.println("First:"+queue.first());
        System.out.println("-----");
        System.out.println("Last:"+queue.last());
        System.out.println("-----");
        System.out.println("queue.contains('3') Found object:" + queue.contains("3"));
        System.out.println("-----");
        System.out.println("queue.contains('1') Found object:" + queue.contains("1"));
        System.out.println("-----");
        System.out.println("Dequeue till empty |dequeue value and size");

        while(!queue.isEmpty())
        {
            System.out.println("Dequeue response: "+queue.dequeue());
            System.out.println("Queue Size after dequeue ="+queue.size() );
        }
        System.out.println("queue.isEmpty =" + queue.isEmpty());
    }
}
