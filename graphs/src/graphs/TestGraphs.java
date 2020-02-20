package graphs;

public class TestGraphs
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
            new DirectedALGraph.Edge<>('d', 'c', 1.0),
            new DirectedALGraph.Edge<>('a', 'd', 1.0),
            new DirectedALGraph.Edge<>('b', 'f', 1.0)
        );

        System.out.println(letterGraph.vertexSize());
        System.out.println(letterGraph.edgeSize());
    }
}
