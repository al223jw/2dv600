package al223jw_assign2.Exersise5_4;

import al223jw_assign2.Exersise5.IWordSet;
import al223jw_assign2.Exersise5.Word;

import java.util.Iterator;


public class TreeWordSet implements IWordSet{

    private Node root;
    private int size = 0;


    @Override
    public void add(Word word) {
        if(root == null)
        {
            root =  new Node(word);
        }
        else if(!root.contains(word))
        {
            root.add(word);
        }
        else
        {
            return;
        }
        size++;
    }

    @Override
    public boolean contains(Word word) {
            return root.contains(word);
    }

    @Override
    public int size() {
        return size;
    }

    public String toString()
    {
        String content = "";
        Iterator<Word> iterator = iterator();
        while(iterator.hasNext()){
            content += iterator.next() +"\n";
        }
        return content;
    }


    @Override
    public Iterator iterator() {
        return new SetIterator();
    }

    private class Node
    {
        Word word;
        Node left, right, parent;
        boolean checked = false;

        public Node (Word w)
        {
            word = w;
        }


        void add(Word w)
        {

            if(w.compareTo(word) < 0)
            {
                if(left == null)
                {
                    left = new Node(w);
                }
                else
                    left.add(w);
            }
            else if(w.compareTo(word) > 0)
            {
                if(right == null)
                {
                    right = new Node(w);
                }
                else
                    right.add(w);
            }
        }

        boolean contains(Word w)
        {

            if (w.compareTo(word) < 0)
            {
                if (left == null)
                    return false;
                else
                    return left.contains(w);
            }
            else if (w.compareTo(word) > 0)
            {
                if (right == null)
                    return false;
                else
                    return right.contains(w);
            }
            return true;
        }
    }

    private class SetIterator implements Iterator<Word>
    {
        Node node;

        public SetIterator()
        {
            node = root;

            while(node.left != null)
            {
                Node temp = node;
                node = node.left;
                node.parent = temp;
            }
        }

        public boolean hasNext()
        {
            return node != null;
        }

        public Word next()
        {
            node.checked = true;
            Node toBeReturned = node;

            if (node.right != null)
            {
                node = node.right;

                if(node.parent == null )
                {
                    node.parent = toBeReturned;
                }
                while (node.left != null)
                {
                    Node temp = node;
                    node = node.left;
                    node.parent = temp;
                }
            }
            else
            {
                while (node.checked )
                {
                    Node temp = node;
                    node.checked = false;
                    if(node.parent == null)
                    {
                        node = null;
                        break;
                    }
                    node = temp.parent;
                }
            }

            return toBeReturned.word;
        }
    }
}
