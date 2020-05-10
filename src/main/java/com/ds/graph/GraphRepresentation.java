package com.ds.graph;

public class GraphRepresentation {

	public static void main(String[] args) {
		GraphWeighted graphWeighted = new GraphWeighted(false);
		NodeWeighted nodeWeightedA = new NodeWeighted("A");
		NodeWeighted nodeWeightedB = new NodeWeighted("B");
		NodeWeighted nodeWeightedC = new NodeWeighted("C");
		NodeWeighted nodeWeightedD = new NodeWeighted("D");
		NodeWeighted nodeWeightedE = new NodeWeighted("E");
		
		graphWeighted.addEdge(nodeWeightedA, nodeWeightedB, 6);
		graphWeighted.addEdge(nodeWeightedA, nodeWeightedD, 1);
		graphWeighted.addEdge(nodeWeightedB, nodeWeightedD, 2);
		graphWeighted.addEdge(nodeWeightedD, nodeWeightedE, 1);
		graphWeighted.addEdge(nodeWeightedB, nodeWeightedE, 2);
		graphWeighted.addEdge(nodeWeightedB, nodeWeightedC, 5);
		graphWeighted.addEdge(nodeWeightedC, nodeWeightedE, 5);
		graphWeighted.printEdges();
		
		

	}

}
