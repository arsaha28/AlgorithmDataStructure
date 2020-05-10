package com.ds.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GraphWeighted {
	private Set<NodeWeighted> nodes;
    private boolean directed;

    public GraphWeighted(boolean directed) {
        this.directed = directed;
        nodes = new HashSet<>();
    }
    
    public void addEdge(NodeWeighted source, NodeWeighted destination, double weight) {
    	nodes.add(source);
    	nodes.add(destination);
    	addEdgeHelper(source, destination, weight);
    	if (!directed && source != destination) {
            addEdgeHelper(destination, source, weight);
        }
    }
    
    private void addEdgeHelper(NodeWeighted a, NodeWeighted b, double weight) {
        for (EdgeWeighted edge : a.getEdges()) {
        	if(edge.getSource()==a && edge.getDestination() == b) {
                edge.setWeight(weight);
                return;
        	}
        }
        a.getEdges().add(new EdgeWeighted(a, b, weight));

    }
    
    public void printEdges() {
        for (NodeWeighted node : nodes) {
            LinkedList<EdgeWeighted> edges = node.getEdges();
            if (edges.isEmpty()) {
                System.out.println("Node " + node.getName() + " has no edges.");
                continue;
            }
            System.out.print("Node " + node.getName() + " has edges to: ");
            for (EdgeWeighted edge : edges) {
                System.out.print(edge.getDestination().getName() + "(" + edge.getWeight() + ") ");
            }
            System.out.println();
        }
    }

}
