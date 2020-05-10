package com.ds.graph;

import java.util.LinkedList;

public class NodeWeighted {
	
	private String name;
	private boolean visited;
    private LinkedList<EdgeWeighted> edges;
    
	public NodeWeighted(String name) {
		super();
		this.name = name;
		visited = false;
        edges = new LinkedList<>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public LinkedList<EdgeWeighted> getEdges() {
		return edges;
	}

	public void setEdges(LinkedList<EdgeWeighted> edges) {
		this.edges = edges;
	}



}
