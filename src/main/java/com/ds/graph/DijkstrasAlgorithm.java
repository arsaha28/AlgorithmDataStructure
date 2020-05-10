package com.ds.graph;

import java.util.HashMap;
import java.util.Set;

public class DijkstrasAlgorithm {
	
	Set<NodeWeighted> nodes;

    public void findShortestPath(NodeWeighted start, NodeWeighted end) {
        HashMap<NodeWeighted, NodeWeighted> previousNode = new HashMap<>();
        previousNode.put(start, null);
        HashMap<NodeWeighted, Double> shortestDistance = new HashMap<>();
        for (NodeWeighted node : nodes) {
            if (node == start)
                shortestDistance.put(start, 0.0);
            else shortestDistance.put(node, Double.POSITIVE_INFINITY);
        }
        for (EdgeWeighted edge : start.getEdges()) {
            shortestDistance.put(edge.getDestination(), edge.getWeight());
            previousNode.put(edge.getDestination(), start);
        }
        start.setVisited(true);
        while (true) {
            NodeWeighted currentNode = closestReachableUnvisited(shortestDistance);
            if (currentNode == null) {
                System.out.println("There isn't a path between " + start.getName() + " and " + end.getName());
                return;
            }
            if (currentNode == end) {
                System.out.println("The path with the smallest weight between " + start.getName() + " and " + end.getName() + " is:");
                NodeWeighted child = end;
                String path = end.getName();
                while (true) {
                    NodeWeighted parent = previousNode.get(child);
                    if (parent == null) {
                        break;
                    }
                    path = parent.getName() + " " + path;
                    child = parent;


                }
                System.out.println(path);
                System.out.println("The path costs: " + shortestDistance.get(end));
                return;
            }
            currentNode.setVisited(true);

            for (EdgeWeighted edge : currentNode.getEdges()) {
                if (edge.getDestination().isVisited())
                    continue;

                if (shortestDistance.get(currentNode)
                   + edge.getWeight()
                   < shortestDistance.get(edge.getDestination())) {
                    shortestDistance.put(edge.getDestination(),
                                       shortestDistance.get(currentNode) + edge.getWeight());
                    previousNode.put(edge.getDestination(), currentNode);
                }
            }
        }	


    }
    
    private NodeWeighted closestReachableUnvisited(HashMap<NodeWeighted, Double> shortestPathMap) {
        double shortestDistance = Double.POSITIVE_INFINITY;
        NodeWeighted closestReachableNode = null;
        for (NodeWeighted node : nodes) {
            if (node.isVisited())
                continue;

            double currentDistance = shortestPathMap.get(node);
            if (currentDistance == Double.POSITIVE_INFINITY)
                continue;

            if (currentDistance < shortestDistance) {
                shortestDistance = currentDistance;
                closestReachableNode = node;
            }
        }
        return closestReachableNode;
    }
}
