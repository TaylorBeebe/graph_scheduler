import structure5.*;
import java.util.Iterator;

class DFSComponentSize {

    public static <V,E> int DFS(Graph<V,E> g, V src) {

	//Stack is perfect data structure for Depth First Search
	Stack<V> todo = new StackList<V>();
	int count = 0;
	
	todo.push(src);

	//Check each node as they come off the stack
	while (!todo.isEmpty()) {
	    V node = todo.pop();
	    if (!g.isVisited(node)) {
		g.visit(node);
		System.out.println(node);
		count++;
	    }
	    
	    Iterator<V> neighbors = g.neighbors(node);
	    while (neighbors.hasNext()) {
		V next = neighbors.next();
		if (!g.isVisited(next))
		    todo.push(next);
	    }
	}
	
	return count;
    }

    //Main fuction for testing
    public static void main(String[] args) {

	// Test Depth First Search on an undirected graph
	GraphListDirected<String, Integer> g =new GraphListDirected<String,Integer>();

	//Add all edges and nodes
	g.add("A"); g.add("B"); g.add("C"); g.add("D"); g.add("E"); g.add("F"); g.add("G"); g.add("H");
	g.addEdge("A","B", 1);
	g.addEdge("A","C", 1);
	g.addEdge("A", "G", 1);
	g.addEdge("A", "H", 1);
	g.addEdge("G", "F", 1);
	g.addEdge("F", "C", 1);
	g.addEdge("F", "D", 1);
	g.addEdge("C", "B", 1);
	g.addEdge("C", "D", 1);
	g.addEdge("B", "D", 1);
	g.addEdge("B", "G", 1);
	g.addEdge("B", "H", 1);
	g.addEdge("H", "E", 1);
	g.addEdge("E", "D", 1);
	g.addEdge("E", "H", 1);
	
	DFS(g, g.get("A"));
 
    }

}
