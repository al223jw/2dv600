package al223jw_assign2.Exersise3;

import al223jw_assign2.Exersise1.ArrayIntStack;
import junit.framework.TestCase;
import org.junit.Assert;

public class ArrayIntStackTest extends TestCase {

    public void testPush() throws Exception {

        ArrayIntStack lIntStack = buildIntStack(10000);
        ArrayIntStack emptyStack = buildIntStack(0);

        assertEquals(10000,lIntStack.size());
        assertTrue(emptyStack.isEmpty());
    }

    public void testPop() throws Exception {

        ArrayIntStack liStack = buildIntStack(10000);
        ArrayIntStack emptyStack = buildIntStack(0);

        assertEquals(9999,liStack.pop());

        assertNotSame(9999,liStack.pop());
        for(int val : liStack){
            assertNotSame(9999, val);
        }

        assertEquals(9997, liStack.pop());

        try{
            emptyStack.pop();
            fail("Should throw IndexOutOfBoundsException");
        }
        catch(IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }

    public void testPeek() throws Exception {

        ArrayIntStack liStack = buildIntStack(100001);
        ArrayIntStack emptyStack = buildIntStack(0);

        assertEquals(100000,liStack.peek());

        try{
            emptyStack.peek();
            fail("Should throw IndexOutOfBoundsException");
        }
        catch(IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }

    private ArrayIntStack buildIntStack(int size){
        ArrayIntStack lIntStack = new ArrayIntStack();
        for(int i = 0; i < size; i++){
            lIntStack.push(i);
        }
        return lIntStack;
    }

}