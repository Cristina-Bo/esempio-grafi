package it.polito.tdp.grafi;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.graph.SimpleGraph;

public class Esempio {

	public static void main(String[] args) {
		
		// grafo non orientato
		Graph<Integer, DefaultEdge> g =
				new SimpleGraph<>(DefaultEdge.class);
		
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(5);
		g.addVertex(6);
		
		g.addEdge(1,2);
		g.addEdge(1,5);
		g.addEdge(2,5);
		g.addEdge(3,6);
		
		System.out.println(g);
		
		
		//grafo orientato:
		
		
		Graph<Integer, DefaultEdge> g2 =
				new DefaultDirectedGraph<>(DefaultEdge.class);
		
		Graphs.addAllVertices(g2, g.vertexSet());
		
		g2.addEdge(1, 2);
		g2.addEdge(2, 2);
		g2.addEdge(2, 5);
		g2.addEdge(2, 4);
		g2.addEdge(4, 1);
		g2.addEdge(4, 5);
		g2.addEdge(5, 4);
		g2.addEdge(6, 3);
		
		
		
		System.out.println(g2);
	}

}
