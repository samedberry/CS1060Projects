package TravelingSalesmanTest1;

/**
 *
 * @author CSC161 Weighted Graph Application
 */
public class TravelingSalesmanTest {
  public static void main(String[] args)throws Exception {
     
    WeightedGraphHelper<String> graph = createGraph();
    
    WeightedGraphHelper<String>.ShortestPathTree tree = graph.getShortestPath("Chicago");
    tree.printPath("Atlanta");
    
    tree = graph.getShortestPath("Atlanta");
    tree.printPath("Chicago");
    
//    tree.printAllPaths();
    }
  
	static WeightedGraphHelper createGraph() throws Exception {
    
		WeightedGraphHelper<String> graph = new WeightedGraphHelper();
		graph.addVertex("New York");
		graph.addVertex("Boston");
		graph.addVertex("Chicago");
		graph.addVertex("Kansas City");
		graph.addVertex("Atlanta");
        graph.addVertex("Dallas");
        graph.addVertex("Houston");
        graph.addVertex("Miami");
		graph.addEdge("New York", "Boston", 214);
		graph.addEdge("New York", "Chicago", 787);
        graph.addEdge("New York", "Kansas City", 1260);
        graph.addEdge("New York", "Atlanta", 888);
        graph.addEdge("Boston", "Chicago", 983);
        graph.addEdge("Chicago", "Kansas City", 533);
        graph.addEdge("Kansas City", "Dallas", 496);
        graph.addEdge("Kansas City", "Atlanta", 864);
        graph.addEdge("Kansas City", "Dallas", 496);
        graph.addEdge("Dallas", "Atlanta", 781);
        graph.addEdge("Dallas", "Houston", 239);
        graph.addEdge("Houston", "Miami", 1187);
        graph.addEdge("Miami", "Atlanta", 661);
		return graph;
	}
}
