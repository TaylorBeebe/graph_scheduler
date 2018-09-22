import structure5.*;
import java.util.Iterator;

class BFSComponentSize {

    public static <V,E> int BFS(Graph<V,E> g, V src) {
 Queue<V> todo = new QueueList<V>(); int count = 0;
 g.visit(src); count++;
 todo.enqueue(src); 
 while (!todo.isEmpty()) {
     V node = todo.dequeue();  
     System.out.println(node);
     Iterator<V> neighbors = g.neighbors(node);
     while (neighbors.hasNext()) {
  V next = neighbors.next();
  if (!g.isVisited(next)) {
      g.visit(next); count++;
      todo.enqueue(next);
  }
     }
 }
 return count;
    }
    
    public static void main(String[] args) {
 // First an undirected graph
      /*
 Graph<String,Integer> g = new GraphListUndirected<String,Integer>();

 g.add("A"); g.add("B"); g.add("C"); g.add("D"); g.add("E");
 g.addEdge("A","B", 1);
 g.addEdge("A","C", 1);
 g.addEdge("B","C", 1);
 g.addEdge("C","D", 1);
 g.addEdge("D","B", 1);
 g.addEdge("D","E", 1);


 for( String v : g) {
     System.out.println("Number of vertices reachable from " + 
          v + ": " + BFS(g,v) );
     g.reset(); // "unvisit" each vertex
 }
 */
 System.out.println("\n\n");

 // Then a directed graph
 GraphListDirected<String, Integer> g =new GraphListDirected<String,Integer>();

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
 

/*
 for( String v : g) {
     System.out.println("Number of vertices reachable from " + 
          v + ": " + BFS(g,v) );
     g.reset(); // "unvisit" each vertex
     
    */
 BFS(g, g.get("A"));
 
    }

}