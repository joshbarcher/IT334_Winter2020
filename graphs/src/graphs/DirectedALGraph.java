package graphs;

import java.util.HashMap;
import java.util.Map;

public class DirectedALGraph<V> implements IGraph<V>
{
    //fields
    private Map<V, Node> adjacencyList;

    public DirectedALGraph()
    {
        adjacencyList = new HashMap<>();
    }

    @Override
    public boolean addVertex(V vertex)
    {
        //precondition
        if (adjacencyList.containsKey(vertex))
        {
            return false; //not successful
        }
        else
        {
            //insert the new vertex
            adjacencyList.put(vertex, null);
            return true;
        }
    }

    @Override
    public boolean addVertex(V... vertices)
    {
        return false;
    }

    @Override
    public boolean addEdge(V source, V destination, double weight)
    {
        return false;
    }

    @Override
    public boolean addEdges()
    {
        return false;
    }

    @Override
    public boolean hasVertex(V vertex)
    {
        return false;
    }

    @Override
    public boolean hasEdge(V source, V destination)
    {
        return false;
    }

    @Override
    public int vertexSize()
    {
        return 0;
    }

    @Override
    public int edgeSize()
    {
        return 0;
    }

    @Override
    public boolean removeVertex(V vertex)
    {
        return false;
    }

    @Override
    public boolean removeEdge(V source, V destination)
    {
        return false;
    }

    @Override
    public boolean areAdjacent(V first, V second)
    {
        return false;
    }

    @Override
    public boolean updateEdgeWeight(V source, V destination, double newWeight)
    {
        return false;
    }

    private class Node
    {
        private V vertex;
        private Node next;

        public Node(V vertex)
        {
            this.vertex = vertex;
        }

        public Node(V vertex, Node next)
        {
            this.vertex = vertex;
            this.next = next;
        }
    }
}