package al223jw;

import graphs.*;

import java.util.Iterator;


public class MyGML<E> extends GML<E> {

    public MyGML(DirectedGraph<E> dg) {
        super(dg);
    }

    @Override
    public String toGML() {

        String newGML = "graph [\n";

        Iterator<Node<E>> iterator = graph.iterator();
        int count = 0;
        while(iterator.hasNext())
        {
            count++;
            newGML += "\tnode [\n";
            newGML += "\t\tid " + count + "\n";
            newGML += "\t\tlabel " + "\"" + "node" + iterator.next() + "\" \n";
            newGML += "\t]\n";
        }

        return newGML + "]";
    }
}
