package al223jw;

import graphs.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyNode<E> extends Node<E> {

    private Set<Node<E>> preds = new HashSet<Node<E>>();
    private Set<Node<E>> succs = new HashSet<Node<E>>();

    protected MyNode(E item)
    {
        super(item);
    }

    @Override
    public boolean hasSucc(Node node) {
        return succs.contains(node);
    }

    @Override
    public int outDegree() {
        return succs.size();
    }

    @Override
    public Iterator<Node<E>> succsOf() {
        return succs.iterator();
    }

    @Override
    public boolean hasPred(Node node) {
        return preds.contains(node);
    }

    @Override
    public int inDegree() {
        return preds.size();
    }

    @Override
    public Iterator<Node<E>> predsOf() {
        return preds.iterator();
    }

    @Override
    protected void addSucc(Node<E> succ) {
        succs.add(succ);
    }

    @Override
    protected void removeSucc(Node succ) {
        succs.remove(succ);
    }

    @Override
    protected void addPred(Node pred) {
        preds.add(pred);
    }

    @Override
    protected void removePred(Node pred) {
        preds.remove(pred);
    }

    @Override
    protected void disconnect() {

        for(Node<E> n : this.succs)
        {
            MyNode<E> node = (MyNode<E>) n;

            node.removePred(this);
        }
        for(Node<E> n : this.preds)
        {
            MyNode<E> node = (MyNode<E>) n;

            node.removeSucc(this);
        }
        succs.clear();
        preds.clear();
    }
}
