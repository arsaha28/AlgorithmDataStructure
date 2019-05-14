package com.ds.binarysrchtree;

public class BBinarySearchTree {

	private BSTNode root;

	public BSTNode insert(int data) {
		BSTNode node = new BSTNode(data);
		if (root == null) {
			root = node;
		} else {
			BSTNode parentNode = findParent(data, root);
			if (data < parentNode.getData()) {
				parentNode.setLeftNode(node);
			} else if (data > parentNode.getData()) {
				parentNode.setRightNode(node);
			}
		}
		return node;
	}

	public BSTNode findParent(int data, BSTNode node) {
		if (node == null) {
			return null;
		}
		if (data < node.getData()) {
			if (node.getLeftNode() != null && node.getLeftNode().getData() == data) {
				return node;
			} else if (node.getLeftNode() != null) {
				return findParent(data, node.getLeftNode());

			} else {
				return node;
			}
		} else if (data > node.getData()) {
			if (node.getRightNode() != null && node.getRightNode().getData() == data) {
				return node;

			} else if (node.getRightNode() != null) {
				return findParent(data, node.getRightNode());
			} else {
				return node;
			}
		}
		return null;
	}

	public BSTNode findParent(int data) {
		return findParent(data, root);
	}

}
