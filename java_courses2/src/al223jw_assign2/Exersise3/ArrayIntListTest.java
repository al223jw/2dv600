package al223jw_assign2.Exersise3;

import al223jw_assign2.Exersise1.ArrayIntList;
import junit.framework.TestCase;

public class ArrayIntListTest extends TestCase {

    public void testAdd() throws Exception {

        ArrayIntList emptyList = buildIntList(0);
        ArrayIntList list2 = buildIntList(10000);

        assertEquals(10000,list2.size());
        assertTrue(emptyList.isEmpty());

        emptyList.add(1);
        assertTrue(!emptyList.isEmpty());
    }

    public void testAddAt() throws Exception {
        ArrayIntList list = buildIntList(10);

        list.addAt(100, 9);
        assertEquals(11,list.size());

        list.addAt(101, 9);
        assertEquals(12,list.size());

        assertEquals(100,list.get(10));

        try{
            list.addAt(10,13);
            fail("Should throw IndexOutOfBoundsException");
        }
        catch(IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }

    public void testRemove() throws Exception {

        ArrayIntList list = buildIntList(10000);

        list.remove(0);

        assertEquals(9999, list.size());

        assertEquals(1, list.get(0));

        try {
            list.remove(10000);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    public void testGet() throws Exception {

        ArrayIntList list = buildIntList(10000);

        for(int i = 0; i < list.size(); i++){
            assertEquals(i,list.get(i));
        }

        try{
            list.get(10001);
            fail("Should throw IndexOutOfBoundsException");
        }
        catch(IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }

    public void testIndexOf() throws Exception {

        ArrayIntList list = buildIntList(10000);
        for(int i = 0; i < list.size(); i++){
            assertEquals(i,list.indexOf(i));
        }

        assertEquals(-1,list.indexOf(10001)); //If the index doesn't exist, the method should return -1.
    }

    private ArrayIntList buildIntList(int size){
        ArrayIntList list = new ArrayIntList();
        for(int i = 0; i < size; i++){
            list.add(i);
        }
        return list;
    }

}