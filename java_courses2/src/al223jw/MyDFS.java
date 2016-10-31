package al223jw;

import graphs.DFS;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

public class MyDFS<E> implements DFS<Integer> {

    @Override
    public List<Node<E>> dfs(DirectedGraph graph, Node root) {

        List<Node<E>> nodes = new ArrayList<Node<E>>();
        HashSet visited = new HashSet<>();

        root = graph.getNodeFor(root.item());

        return dfsRecursive(nodes, root, visited);
    }

    private List<Node<E>> dfsRecursive(List<Node<E>> nodes, Node<E> node, HashSet<Node<E>> visited)
    {
        Iterator<Node<E>> succs = node.succsOf(); // O(1)

        node.num = nodes.size(); // O(1)
        visited.add(node); // O(1)
        nodes.add(node); // O(1)

        while(succs.hasNext()) // O(S) where S is amount of succs.
        {
            Node<E> next = succs.next(); // O(1)

            if(!visited.contains(next)) // O(1)
                dfsRecursive(nodes, next, visited); // O(N)
        }
        return nodes; // O(1)
    }

    @Override
    public List<Node<E>> dfs(DirectedGraph graph) {

        List<Node<E>> nodes = new ArrayList<Node<E>>(); // O(1)
        HashSet<Node<E>> visited = new HashSet<Node<E>>(); // O(1)
        Iterator<Node<E>> heads = graph.heads(); // O(1)

        if(graph.headCount() != 0) // O(1)
            while (heads.hasNext()) // O(1)
            {
                nodes = dfsRecursive(nodes, heads.next(), visited); // O(N + S)
            }
        else
            nodes = dfsRecursive(nodes, graph.getNodeFor(graph.allItems().get(0)), visited); // O(N + S)

        return nodes; // O(1)
    }

    @Override
    public List<Node<E>> postOrder(DirectedGraph g, Node root) {

        ArrayList<Node<E>> postList = new ArrayList<Node<E>>();
        HashSet<Node<E>> visited = new HashSet<Node<E>>();

        root = g.getNodeFor(root.item());

        return postOrderRecursive(postList, root, visited);
    }

    private List<Node<E>> postOrderRecursive(List<Node<E>> postList, Node<E> node, HashSet<Node<E>> visited)
    {

        if(!visited.contains(node))
        {
            Iterator<Node<E>> succs = node.succsOf();
            visited.add(node);

            while(succs.hasNext())
            {
                Node<E> next = succs.next();
                if(!postList.contains(next))
                    postOrderRecursive(postList, next, visited);
            }

            node.num = postList.size() + 1;
            postList.add(node);
        }

        return postList;
    }

    @Override
    public List<Node<E>> postOrder(DirectedGraph g) {

        List<Node<E>> postList = new ArrayList<Node<E>>();
        HashSet<Node<E>> visited = new HashSet<Node<E>>();
        Iterator<Node<E>> heads = g.heads();

        if(g.headCount() != 0)
            while(heads.hasNext())
                postList = postOrderRecursive(postList, heads.next(), visited);
        else
            postList = postOrderRecursive(postList, g.getNodeFor(g.allItems().get(0)), visited);

        return postList;

    }

    @Override
    public List<Node> postOrder(DirectedGraph g, boolean attach_dfs_number) {
        return null;
    }

    @Override
    public boolean isCyclic(DirectedGraph graph) {
        Iterator<Node<E>> it = graph.iterator();

        while (it.hasNext())
        {
            Node<E> node = it.next();
            Iterator<Node<E>> it2 = node.succsOf();

            while (it2.hasNext())
                if (it2.next().hasSucc(node))
                    return true;
        }
        return false;
    }

    @Override
    public List<Node> topSort(DirectedGraph graph) {

        if(isCyclic(graph))
            throw new RuntimeException("Graph need to be acyclic.");

        Node<E>[] topSortArr = new Node[graph.nodeCount()];

        for(Node<E> node : postOrder(graph))
            topSortArr[graph.nodeCount() - (node.num)] = node;

        return Arrays.asList(topSortArr);
    }
}
