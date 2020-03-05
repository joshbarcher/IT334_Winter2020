package test;

import graphs.DirectedALGraph;
import graphs.IGraph;

import java.util.List;

public class TestDirectedGraphs
{
    public static void main(String[] args)
    {
        IGraph<Character> letterGraph = new DirectedALGraph<>();

        //add single vertices
        letterGraph.addVertex('a');
        letterGraph.addVertex('b');
        letterGraph.addVertex('c');

        //add multiple vertices
        letterGraph.addVertex('d', 'e', 'f', 'g', 'h');

        //add single edges
        letterGraph.addEdge('a', 'b', 1.0);
        letterGraph.addEdge('b', 'c', 1.0);
        letterGraph.addEdge('c', 'b', 1.0);

        //add multiple edges
        letterGraph.addEdges(
            new DirectedALGraph.Edge<>('a', 'g', 1.0),
            new DirectedALGraph.Edge<>('d', 'c', 1.0),
            new DirectedALGraph.Edge<>('a', 'd', 1.0),
            new DirectedALGraph.Edge<>('b', 'f', 1.0),
            new DirectedALGraph.Edge<>('f', 'e', 1.0),
            new DirectedALGraph.Edge<>('e', 'g', 1.0),
            new DirectedALGraph.Edge<>('g', 'f', 1.0)
        );

        System.out.println(letterGraph.vertexSize());
        System.out.println(letterGraph.edgeSize());

        //test dfs() and see if it works...
        List<Character> dfs = letterGraph.dfsOverComponents();
        for (char character : dfs)
        {
            System.out.println(character);
        }
    }
}







