package al223jw_assign2.Exersise1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
    @Override
    public void push(int n) {

        if(size() == values.length){
            resize();
        }
        values[size++] = n;
    }


    @Override
    public int pop() throws IndexOutOfBoundsException {
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        return values[--size];
    }

    @Override
    public int peek() throws IndexOutOfBoundsException {
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        return values[size-1];
    }

}
