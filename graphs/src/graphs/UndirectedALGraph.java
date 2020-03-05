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

        return null;
    }

    private void visit(V current, Set<V> known, Queue<Edge<V>> heap)
    {
        //add the vertex to the known set
        known.add(current);

        //add all incident edges to our heap
        Node edge = adjacencyList.get(current);
        while (edge != null)
        {
            //if unknown, add to heap
            V other = edge.getVertex();
            if (!known.contains(other))
            {
                heap.add(new Edge<>(current, other, edge.getWeight()));
            }
        }
    }
}









