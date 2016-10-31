package al223jw;

import graphs.DirectedGraph;
import graphs.Node;
import graphs.TransitiveClosure;

import java.util.*;

public class MyTransitiveClosure<E> implements TransitiveClosure<E>{

    @Override
    public Map<Node<E>, Collection<Node<E>>> computeClosure(DirectedGraph<E> dg) {

        Map<Node<E>, Collection<Node<E>>> map = new HashMap<Node<E>, Collection<Node<E>>>(); // O(1)
        Iterator<Node<E>> it = dg.iterator(); // O(1)

        MyDFS<E> dfs = new MyDFS<E>(); // O(1)

        while (it.hasNext()) // O(N)
        {
            Node<E> next = it.next(); // O(1)
            map.put(next, dfs.dfs(dg, next)); // O(N + S)
        }

        return map; // O(1)
    }
}
