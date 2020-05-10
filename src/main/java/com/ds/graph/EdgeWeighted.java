package com.ds.graph;

public class EdgeWeighted implements Comparable<EdgeWeighted> {
	
	private NodeWeighted source;
	private NodeWeighted destination;
	private double weight;
	
	public EdgeWeighted(NodeWeighted source, NodeWeighted destination, double weight) {
		super();
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(EdgeWeighted otherEdge) {
		if (this.weight > otherEdge.weight) {
	        return 1;
	    }
	    else return -1;
	}
	
	public String toString() {
	    return String.format("(%s -> %s, %f)", source.getName(), destination.getName(), weight);
	}

	public NodeWeighted getSource() {
		return source;
	}

	public void setSource(NodeWeighted source) {
		this.source = source;
	}

	public NodeWeighted getDestination() {
		return destination;
	}

	public void setDestination(NodeWeighted destination) {
		this.destination = destination;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
