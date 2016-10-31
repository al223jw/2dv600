package al223jw;

import graphs.BFS;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MyBFS<E> implements BFS<E> {
    @Override
    public List<Node<E>> bfs(DirectedGraph graph, Node root) {

        HashSet<Node<E>> set = new HashSet<Node<E>>();
        HashSet<Node<E>> visited = new HashSet<Node<E>>();
        List<Node<E>> list = new ArrayList<Node<E>>();

        set.add(root);

        return bfsRecursive(set, list, visited);
    }

    private List<Node<E>> bfsRecursive(HashSet<Node<E>> set, List<Node<E>> list, HashSet<Node<E>> visited)
    {
        Iterator<Node<E>> setIt = set.iterator(); // O(1)
        set = new HashSet<>(); // O(1)

        while (setIt.hasNext()) // O(N)
        {
            Node<E> next = setIt.next(); // O(1)

            if(!visited.contains(next)) // O(1)
            {
                next.num = list.size() + 1; // O(1)
                visited.add(next); // O(1)
                list.add(next); // O(1)
            }

            Iterator<Node<E>> succsIt = next.succsOf(); // O(1)

            while (succsIt.hasNext()) // O(S)
            {
                Node<E> succ = succsIt.next(); // O(1)
                if (!visited.contains(succ))// O(1)
                {
                    set.add(succ); // O(1)
                }
            }
        }
        if(!set.isEmpty()) // O(1)
            bfsRecursive(set, list, visited); // O(1)

        return list; // O(1)
    }

    @Override
    public List<Node<E>> bfs(DirectedGraph graph) {
        List<Node<E>> list = new ArrayList<Node<E>>(); // O(1)
        HashSet<Node<E>> set;
        HashSet<Node<E>> visited = new HashSet(); // O(1)
        Iterator<Node<E>> heads = graph.heads(); // O(1)

        if(graph.headCount() != 0) // O(1)
            while (heads.hasNext())// O(1)
            {
                set = new HashSet<>(); // O(1)
                set.add(heads.next());// O(1)
                list = bfsRecursive(set, list, visited); // O(S)
            }
        else
        {
            set = new HashSet<>(); // O(1)
            set.add(graph.getNodeFor(graph.allItems().get(0))); // O(1)
            list = bfsRecursive(set, list ,visited); // O(S)
        }

        return list; // O(1)
    }
}
