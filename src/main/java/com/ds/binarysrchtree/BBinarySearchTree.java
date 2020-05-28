package com.ds.binarysrchtree;

public class BBinarySearchTree {

	public BSTNode root;

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
	
	public BSTNode min() {
		return findMin(root);
	}
	public BSTNode findMin(BSTNode node) {
		if(node.getLeftNode() == null) return node;
		else return findMin(node.getLeftNode());
	}
	public void preOrder() {
		if (root != null) {
			preOrderTraversal(root);
		}

	}

	private void preOrderTraversal(BSTNode bstNode) {
		if (null != bstNode) {
			System.out.print(bstNode.getData());
			preOrderTraversal(bstNode.getLeftNode());
			preOrderTraversal(bstNode.getRightNode());
		}
		
	}

	public void postOrder() {
		if (root != null) {
			postOrderTraversal(root);
		}
	}

	private void postOrderTraversal(BSTNode bstNode) {
		if (null != bstNode) {
			postOrderTraversal(bstNode.getLeftNode());
			postOrderTraversal(bstNode.getRightNode());
			System.out.print(bstNode.getData());
		}
	}

	public void inOrder() {
		if (root != null) {
			inOrderTraversal(root);
		}

	}

	private void inOrderTraversal(BSTNode bstNode) {
		if (null != bstNode) {
			inOrderTraversal(bstNode.getLeftNode());
			System.out.print(bstNode.getData()+"||");
			inOrderTraversal(bstNode.getRightNode());
		}
	}

}
