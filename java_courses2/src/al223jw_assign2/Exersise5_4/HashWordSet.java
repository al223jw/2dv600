package al223jw_assign2.Exersise5_4;

import al223jw_assign2.Exersise5.IWordSet;
import al223jw_assign2.Exersise5.Word;

import java.util.Iterator;

public class HashWordSet implements IWordSet {
    private int size;
    private Node[] buckets = new Node[3];

    @Override
    public void add(Word word) {
        int pos = getBucketNumber(word);
        Node node = buckets[pos];

        while(node != null)
        {
            if(node.value.equals(word))
                return;
            else
                node = node.next;
        }
        node = new Node(word);
        node.next = buckets[pos];
        buckets[pos] = node;
        size++;

        if(size == buckets.length)
            rehash();
    }

    private void rehash()
    {
        Node[] temp = buckets;
        buckets = new Node[2*temp.length];
        size = 0;

        for(Node n : temp)
        {
            if(n == null) continue;
            while (n != null)
            {
                add(n.value);
                n = n.next;
            }
        }
    }

    @Override
    public boolean contains(Word word) {
        int pos = getBucketNumber(word);
        Node node = buckets[pos];

        while(node != null)
        {
            if(node.value.equals(word))
                return true;
            else
                node = node.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString()
    {
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i < buckets.length; i++)
        {
            Node node = buckets[i];
            if(node == null) continue;
            buf.append("Bucket "+ i + ":");

            while (node != null)
            {
                buf.append(" " + node.value);
                node = node.next;
            }
            buf.append("\n");
        }
        return buf.toString();
    }

    @Override
    public Iterator iterator() {
        return new SetIterator();
    }

    private int getBucketNumber(Word word)
    {
        int hc = word.hashCode();
        if(hc < 0)
            hc = -hc;
        return hc % buckets.length;
    }

    private class Node
    {
        Word value;
        Node next = null;

        public Node(Word word)
        {
            value = word;
        }

        public String toString()
        {
            return value.toString();
        }
    }

    private class SetIterator implements Iterator<Word>
    {
        int pos = 0;
        Word[] words;

        public SetIterator()
        {
            words = new Word[size];
            int n = 0;

            System.out.println(buckets.length);

            for(int i = 0; i < buckets.length; i++)
            {
                Node node = buckets[i];

                while(node != null)
                {
                    words[n++] = node.value;
                    node = node.next;
                }
            }
        }

        public boolean hasNext()
        {
            return pos < words.length;
        }

        public Word next()
        {
            return words[pos++];
        }

        public void remove()
        {
            throw new RuntimeException("remove() is not implemented");
        }

    }
}
