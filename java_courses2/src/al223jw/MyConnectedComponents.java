package al223jw;

import graphs.ConnectedComponents;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

public class MyConnectedComponents<E> implements ConnectedComponents<E>{

    HashSet visited;
    Collection<Node<E>> collection;

    @Override
    public Collection<Collection<Node<E>>> computeComponents(DirectedGraph<E> dg) {

        visited = new HashSet<>(); // O(1);
        collection = new HashSet<>(); // O(1);

        Collection<Collection<Node<E>>> newCollection = new HashSet<>(); // O(1);
        Iterator<Node<E>> dgIterator = dg.iterator(); // O(1);

        while (dgIterator.hasNext()) { // O(N);
            Node<E> next = dgIterator.next(); // O(1);

                if (!visited.contains(next)) { // O(1);
                    computeComponentsRecursive(next); // O(E + S);
                }

                for (Collection<Node<E>> c : newCollection) { // O(C);
                    if (!Collections.disjoint(c, collection)) { // O(1);
                        c.addAll(collection); // O(1);
                        collection = new HashSet<>(); // O(1);
                    }
                }

                if (!collection.isEmpty()) { // O(1);
                    newCollection.add(collection); // O(1);
                    collection = new HashSet<>(); // O(1);
                }
            }
        return newCollection; // O(1);
    }

    private void computeComponentsRecursive(Node<E> node)
    {
        Iterator<Node<E>> succs = node.succsOf(); // O(1);

        visited.add(node); // O(1);
        collection.add(node); // O(1);

        while(succs.hasNext()) // O(E);
        {
            Node<E> next = succs.next(); // O(1);

            if(!collection.contains(next)) // O(1);
                computeComponentsRecursive(next); // O(S);
        }
    }
}
