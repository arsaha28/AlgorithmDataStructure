package com.ds.graph;

import java.util.LinkedList;

public class GGraph {
	
	private int vertexCount;
	private LinkedList<Integer> adjacencyList[];
	
	public GGraph(int size) {
		vertexCount = size;
		adjacencyList = new LinkedList[vertexCount];
		for(int i= 0;i<vertexCount;++i) {
			adjacencyList[i] = new LinkedList<Integer>();
		}	
	}
	
	public void addEdge(int vertex,int otherVertex) {
		adjacencyList[vertex].add(otherVertex);
	}
	
}
