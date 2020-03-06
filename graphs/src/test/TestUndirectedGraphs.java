package test;

import graphs.DirectedALGraph;
import graphs.UndirectedALGraph;

import java.util.List;

public class TestUndirectedGraphs
{
    public static void main(String[] args)
    {
        UndirectedALGraph<Integer> numGraph = new UndirectedALGraph<>();

        numGraph.addVertex(1, 2,3, 4, 5, 6, 7);
        numGraph.addEdges(
            new DirectedALGraph.Edge<>(1, 2, 1),
            new DirectedALGraph.Edge<>(2, 3, 3),
            new DirectedALGraph.Edge<>(2, 4, 2),
            new DirectedALGraph.Edge<>(1, 4, 1),
            new DirectedALGraph.Edge<>(2, 5, 2),
            new DirectedALGraph.Edge<>(3, 4, 1),
            new DirectedALGraph.Edge<>(2, 6, 2),
            new DirectedALGraph.Edge<>(3, 6, 2),
            new DirectedALGraph.Edge<>(6, 7, 1),
            new DirectedALGraph.Edge<>(1, 7, 2)
        );

        System.out.println("Vertex set size: " + numGraph.vertexSize());
        System.out.println("Edge set size: " + numGraph.edgeSize());

        List<DirectedALGraph.Edge<Integer>> mst = numGraph.mst(1);
        for (DirectedALGraph.Edge<Integer> edge : mst)
        {
            System.out.println(edge);
        }
    }
}
