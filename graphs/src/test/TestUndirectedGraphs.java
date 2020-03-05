package test;

import graphs.DirectedALGraph;
import graphs.UndirectedALGraph;

public class TestUndirectedGraphs
{
    public static void main(String[] args)
    {
        UndirectedALGraph<Integer> numGraph = new UndirectedALGraph<>();

        numGraph.addVertex(1, 2,3, 4, 5);
        numGraph.addEdges(
            new DirectedALGraph.Edge<>(1, 2, 0),
            new DirectedALGraph.Edge<>(2, 3, 0),
            new DirectedALGraph.Edge<>(2, 4, 0),
            new DirectedALGraph.Edge<>(1, 4, 0),
            new DirectedALGraph.Edge<>(2, 5, 0)
        );

        System.out.println("Vertex set size: " + numGraph.vertexSize());
        System.out.println("Edge set size: " + numGraph.edgeSize());
    }
}
