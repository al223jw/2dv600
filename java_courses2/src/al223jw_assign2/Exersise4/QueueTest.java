package al223jw_assign2.Exersise4;

import junit.framework.TestCase;

public class QueueTest extends TestCase {

    public void testEnqueue(){
        Queue<Integer> bigQueue = build(1000000);

        assertEquals(1000000, bigQueue.size());
        bigQueue.enqueue(1000000);
        assertEquals(1000001,bigQueue.size());
    }


    public void testDequeue(){
        Queue<Integer> bigQueue = build(1000000);
        assertEquals(1000000, bigQueue.size());
        assertTrue(bigQueue.dequeue() == 0);

        for(Object val : bigQueue){
            assertNotSame  (0, val);
        }

        for(int i = 1; i < 1000000; i++){
            assertTrue(i == bigQueue.dequeue());
        }

        assertTrue(bigQueue.isEmpty());

        //Should throw IndexOutOfBoundsException.
        try{
            bigQueue.dequeue();
            fail("Should throw IndexOutOfBoundsException!");
        }catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }


    public void testSize(){
        Queue<Integer> q1 = build(0);
        Queue<Integer> q2 = build(100000);
        Queue<String> q3 = new Queue<>();

        assertEquals(0, q1.size());
        assertEquals(100000, q2.size());

        q3.enqueue("1");
        q3.enqueue("5");
        assertEquals(2, q3.size());
    }


    public void testIsEmpty(){
        Queue<Integer> q1 = build(0);
        Queue<Integer> q2 = build(100);

        assertTrue(q1.isEmpty());
        assertTrue(!q2.isEmpty());
    }


    public void testFirst(){
        Queue<String> q1 = new Queue<>();
        Queue<String> q2 = new Queue<>();

        //Add four elements to queue 1.
        q1.enqueue("1st Element in");
        q1.enqueue("2nd Element in");
        q1.enqueue("3rd Element in");
        q1.enqueue("4th Element in");

        assertEquals("1st Element in", q1.first()); //The head should be the first element sent in.

        try {
            q2.first();
            fail("Should throw IndexOutOfBoundsException!");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }


    public void testLast(){
        Queue<String> q1 = new Queue<>();
        Queue<String> q2 = new Queue<>();
        //Add four elements to queue 1.
        q1.enqueue("1st Element in");
        q1.enqueue("2nd Element in");
        q1.enqueue("3rd Element in");
        q1.enqueue("4th Element in");

        assertEquals("4th Element in", q1.last()); //The tail should be the last element sent in.

        try {
            q2.last();
            fail("Should throw IndexOutOfBoundsException!");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    // To easily make big Ques.
    private Queue<Integer> build(int size) {
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < size; i++) {
            queue.enqueue(i);
        }
        return queue;
    }
}