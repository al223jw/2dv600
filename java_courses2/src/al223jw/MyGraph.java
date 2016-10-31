package al223jw;

import graphs.*;

import java.util.*;


public class MyGraph<E> implements DirectedGraph<E> {

    private Map<E, MyNode<E>> itemToNode;
    private Set<Node<E>> heads;
    private Set<Node<E>> tails;

    public MyGraph()
    {
        itemToNode = new HashMap<E, MyNode<E>>();
        heads = new HashSet<>();
        tails = new HashSet<>();
    }

    @Override
    public Node addNodeFor(E item) {

        if(item != null)
        {
            if(!itemToNode.containsKey(item)) {
                MyNode<E> newNode = new MyNode<E>(item);
                heads.add(newNode);
                tails.add(newNode);
                itemToNode.put(item, newNode);
            }
            return itemToNode.get(item);
        }
        else
        {
            throw new NullPointerException("The item you tried to add was not addable.");
        }
    }

    @Override
    public Node getNodeFor(E item) {

        if(item != null){
            if(itemToNode.containsKey(item)){
                return itemToNode.get(item);
            }
            throw new RuntimeException("No node was found");
        }
        else{
            throw new NullPointerException("Recieved null as input");
        }
    }

    @Override
    public boolean addEdgeFor(E from, E to) {

        if(from != null && to != null)
        {
            MyNode nodeForFrom = (MyNode) addNodeFor(from);
            MyNode nodeForTo = (MyNode) addNodeFor(to);

            if(!nodeForFrom.hasSucc(nodeForTo))
            {
                nodeForFrom.addSucc(nodeForTo);
                nodeForTo.addPred(nodeForFrom);
                heads.remove(nodeForTo);
                tails.remove(nodeForFrom);
                return true;
            }
            return false;
        }
        throw new NullPointerException("One of the values was null");
    }

    @Override
    public boolean containsNodeFor(E item) {

        if(item != null)
        {
            if(itemToNode.containsKey(item))
                return true;
            else
                return false;
        }
        throw new NullPointerException("Item was null");
    }

    @Override
    public int nodeCount() {
        return itemToNode.values().size();
    }

    @Override
    public Iterator<Node<E>> iterator() {
        return new NodeIterator();
    }

    @Override
    public Iterator<Node<E>> heads() {
        return heads.iterator();
    }

    @Override
    public int headCount() {
        return heads.size();
    }

    @Override
    public Iterator<Node<E>> tails() {
        return tails.iterator();
    }

    public String toString()
    {
        return itemToNode.toString();
    }

    @Override
    public int tailCount() {
        return tails.size();
    }

    @Override
    public List allItems() {
        ArrayList<E> list = new ArrayList<E>();

        for(MyNode<E> node : itemToNode.values()){
            list.add(node.item());
        }
        return list;
    }

    @Override
    public int edgeCount() {

        int count = 0;

        for (MyNode n : itemToNode.values())
        {
            count += n.outDegree();
        }
        return count;
    }

    @Override
    public void removeNodeFor(E item) {

        if(item == null)
            throw new NullPointerException("Item was null");

        Node<E> n = getNodeFor(item);
        if(n == null)
            System.err.println("Node for the item was not found.");


        if(n.isHead())
            heads.remove(n);

        if(n.isTail())
            tails.remove(n);

        MyNode<E> node = (MyNode<E>) n;
        node.disconnect();

        itemToNode.remove(item);
    }

    @Override
    public boolean containsEdgeFor(E from, E to) {

        if(from != null && to != null)
        {
            if(itemToNode.containsKey(from) && itemToNode.containsKey(to)) {
                if(itemToNode.get(from).hasSucc(itemToNode.get(to))) {
                    return true;
                }
            }
            return false;
        }
        else {
            throw new NullPointerException("One of the values was null");
        }
    }

    @Override
    public boolean removeEdgeFor(E from, E to) {
        if(from == null || to == null)
            throw new NullPointerException("None of the items can be null");

        if(containsEdgeFor(from, to))
        {
            MyNode<E> nodeFrom = (MyNode<E>) getNodeFor(from);
            MyNode<E> nodeTo = (MyNode<E>) getNodeFor(to);

            nodeFrom.removeSucc(nodeTo);
            nodeTo.removePred(nodeFrom);

            if(nodeFrom.isTail())
                tails.add(nodeFrom);

            if(nodeTo.isTail())
                tails.add(nodeTo);

            if(nodeTo.isHead())
                heads.add(nodeTo);

            return true;
        }
        return false;
    }

    private class NodeIterator implements Iterator<Node<E>> {

        Iterator iterator = itemToNode.values().iterator();

        @Override
        public boolean hasNext()
        {
            return iterator.hasNext();
        }

        @Override
        public Node<E> next()
        {
            return (Node<E>) iterator.next();
        }
    }
}
