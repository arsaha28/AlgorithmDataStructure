package com.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GGraph {
	
	private int vertexCount;
	private LinkedList<Integer> adjacencyList[];
	
	public GGraph(int size) {
		vertexCount = size;
		adjacencyList = new LinkedList[10];
		for(int i= 0;i<10;++i) {
			adjacencyList[i] = new LinkedList<Integer>();
		}	
	}
	
	public void addEdge(int vertex,int otherVertex) {
		adjacencyList[vertex].add(otherVertex);
	}
	
	public void bfs(int vertex) {
		
		boolean isVisited[] = new boolean[10];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		isVisited[vertex] = true;
		queue.add(vertex);
		while(queue.size()!=0) {
			vertex = queue.poll();
			System.out.println(vertex);
			Iterator<Integer> itr = adjacencyList[vertex].listIterator();
			while(itr.hasNext()) {
				int adjacentVertex = itr.next();
				if(!isVisited[adjacentVertex]) {
					isVisited[adjacentVertex] = true;
					queue.add(adjacentVertex);
				}
			}
		}
	}
	
}
