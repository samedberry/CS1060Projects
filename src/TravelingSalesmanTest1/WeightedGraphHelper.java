package TravelingSalesmanTest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

//import demonstrations.UnweightedGraphHelper.Vertex;

/**
 * @author bobgi
 */
public class WeightedGraphHelper<T> extends UnweightedGraphHelper<T> {
    // note: adjacency vertex list is managed by super class
    protected Map<Vertex<T>, List<WeightedEdge<T>>> neighbors; // adjaceny weighted edge list

    WeightedGraphHelper() {
        super();
        neighbors = new LinkedHashMap<>();
    }

    public boolean addEdge(T v1, T v2, int weight) throws Exception {
        super.addEdge(v1, v2);
        Vertex<T> u = getVertex(v1);
        Vertex<T> v = getVertex(v2);
        neighbors.putIfAbsent(u, new ArrayList<WeightedEdge<T>>());
        neighbors.putIfAbsent(v, new ArrayList<WeightedEdge<T>>());
        return addEdge(new WeightedEdge(u, v, weight));
    }

    private boolean addEdge(WeightedEdge<T> e) throws Exception {
        if (neighbors.get(e.u).indexOf(e) == -1) {
            neighbors.get(e.u).add(e);
            neighbors.get(e.v).add(e);
            return true;
        } else {
//            return false;
            throw new Exception("addEdge() error");
        }
    }

    private WeightedEdge<T> getEdge(Vertex<T> u, Vertex<T> v) throws Exception {
        for (WeightedEdge e : neighbors.get(u)) {
            if ((e.u.equals(u) && e.v.equals(v)) || (e.u.equals(v) && e.v.equals(u)))
                return e;
        }
        throw new Exception("getEdge() error");
    }

    /**
     * Get a minimum spanning tree rooted at vertex 0
     */
    public MST getMinimumSpanningTree(T label) throws Exception {
        Vertex<T> e;
        e = getVertex(label);
        if (e != null)
            return getMinimumSpanningTree(e);
        else
            throw new Exception("getMinimumSpanningTree() error");
    }

    /**
     * Get a minimum spanning tree rooted at a specified vertex
     * using Prim's Algorithm
     */
    public MST getMinimumSpanningTree(Vertex<T> startingVertex) throws Exception {
        // startingVertex is the root        
        Map<Vertex<T>, Vertex<T>> parent = new LinkedHashMap<>(); // Parent of a vertex
        double totalWeight = 0.0; // Total weight of the tree thus far

        // Let T be a set of vertices in the spanning tree.
        List<Vertex<T>> T = new ArrayList<>(); // set of vertices already processed

        // initially add the starting vertex to T
        T.add(startingVertex);

        // loop until every vertex in V-T is copied to T
        while (T.size() < getSize()) {
            Vertex<T> u = null;
            Vertex<T> v = null;
            double weight = 0;
            double currentMinCost = Double.POSITIVE_INFINITY;

            // Find x in T and y in V - T where smallest weight edge
            for (Vertex<T> x : T)
                for (Vertex<T> y : adjVertices.get(x)) {
                    weight = getEdge(x, y).weight;
                    if (!T.contains(y) && weight < currentMinCost) {
                        currentMinCost = weight;
                        u = x;
                        v = y;
                    }
                }

            // add y to T if it is the smallest cost
            if (u != null) {
                T.add(v); //add a new vertex to T
                parent.put(v, u);  // set parent[y] = x
            } else
                break;
            totalWeight += getEdge(u, v).weight;
        }
        return new MST(startingVertex, parent, T, totalWeight);
    }

    // class MST is an inner class in WeightedGraphHelper
    public class MST<T> extends UnweightedGraphHelper<T>.SearchTree {
        private double totalWeight;

        public MST(Vertex<T> root, Map<Vertex<T>, Vertex<T>> parent, List<Vertex<T>> searchOrder, double totalWeight) {
            super(root, parent, searchOrder);
            this.totalWeight = totalWeight;
        }

        public double getTotalWeight() {
            return totalWeight;
        }
    } //end class MST

    // Dijkstra's Single-Source Shortest-Path Algorithm
    public ShortestPathTree getShortestPath(T sourceVertex) throws Exception {
        // startingVertex is the root        
        Map<Vertex<T>, Vertex<T>> parent = new LinkedHashMap<>(); // Parent of a vertex
        Map<Vertex<T>, Double> cost = new LinkedHashMap<>();
        List<Vertex<T>> T = new ArrayList<>(); // set of vertices already processed
        Vertex<T> u;
        Vertex<T> s; // Vertex to be determined 
//        T.add(s);

        for (Vertex<T> e : adjVertices.keySet())
            cost.put(e, Double.POSITIVE_INFINITY);

        s = getVertex(sourceVertex);
        cost.put(s, 0.0);
        parent.put(s, null);

        // Find smallest cost of u in V - T
        u = s;
        while (T.size() < getSize()) {
            double weight = 0;
            double currentMinCost = Double.POSITIVE_INFINITY;

            //IS THIS METHOD RECURSIVE???

            // get vertex with smallest cost
//            for (Vertex<T> v : cost.keySet()) {
//                // to be completed by student
////              if (cost[v] > cost[u] + weight of edge(u,v)) {
//                if () {
////                  cost[v] = cost[u] + w(u, v);
////                  parent[v] = u;
//
//                }
//            }
        }
        return new ShortestPathTree(getVertex(sourceVertex), parent, T, cost);
    }

    // class ShortestPathTree is an inner class in WeightedGraphHelper
    public class ShortestPathTree extends UnweightedGraphHelper<T>.SearchTree {
        private Map<Vertex<T>, Double> cost;

        public ShortestPathTree(Vertex<T> source, Map<Vertex<T>, Vertex<T>> parent, List<Vertex<T>> searchOrder, Map<Vertex<T>, Double> cost) {
            super(source, parent, searchOrder);
            this.cost = cost;
        }

        public double getCost(T v) {
            return cost.get(v);
        }

        /**
         * Print paths from all vertices to the source
         */
        public void printAllPaths() throws Exception {
            System.out.println("All shortest paths from " + getRoot() + " are:");
            for (Vertex<T> e : adjVertices.keySet()) {
                printPath(e.label); // Print a path from i to the source
                System.out.println("(cost: " + cost.get(e) + ")"); // Path cost
            }
        }
    } //end class ShortestPathTree

    class WeightedEdge<V> implements Comparable<WeightedEdge<V>> {
        Vertex<V> u;
        Vertex<V> v;
        public int weight;

        public WeightedEdge(Vertex<V> u, Vertex<V> v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }

        public boolean equals(WeightedEdge<V> rhs) {
            return (this.u.equals(rhs.u) && this.v.equals(rhs.v));
        }

        @Override
        public int compareTo(WeightedEdge<V> rhs) {
            if (weight > rhs.weight)
                return 1;
            else if (weight == rhs.weight)
                return 0;
            else
                return -1;
        }
    } // end class WeightedEdge

} // end class WeightedGraphHelper
