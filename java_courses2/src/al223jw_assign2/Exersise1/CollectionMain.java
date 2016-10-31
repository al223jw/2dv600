package al223jw_assign2.Exersise1;

public class CollectionMain {
    public static void main(String[] args) {

        try {
            ArrayIntList list = new ArrayIntList();

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);

            System.out.println(list.toString());

            list.addAt(9, 3);
            System.out.println(list.toString());
            System.out.println("");

            list.remove(4);
            System.out.println(list.toString());
            System.out.println("");

            System.out.println(list.get(3));
            System.out.println("");

            System.out.println("Index is: " + list.indexOf(5));
            System.out.println("");
            System.out.println(list.toString());

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.err.println(e.getMessage());
        }


        ArrayIntStack stack = new ArrayIntStack();

        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.toString());
        System.out.println("");


        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println("");

        System.out.println(stack.peek());
        System.out.println(stack.toString());
        System.out.println("");
    }
}
