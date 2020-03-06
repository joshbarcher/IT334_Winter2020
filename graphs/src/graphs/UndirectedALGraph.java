package graphs;

import java.util.*;

public class UndirectedALGraph<V> extends DirectedALGraph<V>
{
    @Override
    public void addEdge(V source, V destination, double weight)
    {
        //add two edges in both directions
        super.addEdge(source, destination, weight);
        super.addEdge(destination, source, weight);
    }

    @Override
    public int edgeSize()
    {
        return super.edgeSize() / 2;
    }

    public List<Edge<V>> mst(V source)
    {
        //helper structures
        Set<V> known = new HashSet<>();
        List<Edge<V>> results = new ArrayList<>();
        Queue<Edge<V>> heap = new PriorityQueue<>();

        //add my initial edges in the mst
        visit(source, known, heap);

        //loop until we add all vertices to the mst
        while (known.size() < vertexSize())
        {
            Edge<V> nextEdge = heap.poll();

            if (!known.contains(nextEdge.getSource()) || !known.contains(nextEdge.getDestination()))
            {
                //add to my results
                results.add(nextEdge);

                //figure out the unknown vertex
                V unknown = (known.contains(nextEdge.getSource())) ? nextEdge.getDestination() : nextEdge.getSource();

                //visit it
                visit(unknown, known, heap);
            }
        }

        return results;
    }

    private void visit(V current, Set<V> known, Queue<Edge<V>> heap)
    {
        //add the vertex to the known set
        known.add(current);

        //add all incident edges to our heap
        Node node = adjacencyList.get(current);
        while (node != null)
        {
            //if unknown, add to heap
            V other = node.getVertex();
            if (!known.contains(other))
            {
                heap.add(new Edge<>(current, other, node.getWeight()));
            }

            node = node.getNext();
        }
    }
}









