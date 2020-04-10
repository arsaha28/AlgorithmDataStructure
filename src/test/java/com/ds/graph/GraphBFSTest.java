package com.ds.graph;

import org.junit.Test;

public class GraphBFSTest {
	
	@Test
	public void bfs() {
		GGraph gGraph = new GGraph(6);
		gGraph.addEdge(1,2);
		gGraph.addEdge(1,3);
		
		gGraph.addEdge(2,4);
		gGraph.addEdge(2,5);
		gGraph.addEdge(2,3);
		
		gGraph.addEdge(3,1);
		gGraph.addEdge(3,5);
		
		gGraph.addEdge(4,2);
		gGraph.addEdge(4,5);
		
		gGraph.addEdge(5,3);
		gGraph.addEdge(5,2);
		gGraph.addEdge(5,4);
		gGraph.addEdge(5,6);
		
		gGraph.addEdge(6,4);
		gGraph.addEdge(6,5);
		gGraph.bfs(1);
	}

}
