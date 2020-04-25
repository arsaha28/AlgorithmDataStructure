package com.ds.binarysrchtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BBinarySearchTreeTest {
	
	@Test
	public void insertCase_1() {
		BBinarySearchTree binarySearchTree = new BBinarySearchTree();
		binarySearchTree.insert(8);
		binarySearchTree.insert(7);
		binarySearchTree.insert(6);
		binarySearchTree.insert(5);
		binarySearchTree.insert(9);
		binarySearchTree.insert(12);
		binarySearchTree.insert(10);
		assertEquals(5, binarySearchTree.findParent(4).getData());
		assertEquals(8, binarySearchTree.findParent(9).getData());
		assertEquals(9, binarySearchTree.findParent(12).getData());
		assertEquals(12, binarySearchTree.findParent(10).getData());
		binarySearchTree.inOrder();
	}
	@Test
	public void insertCase_2() {
		BBinarySearchTree binarySearchTree = new BBinarySearchTree();
		binarySearchTree.insert(40);
		binarySearchTree.insert(20);
		binarySearchTree.insert(10);
		binarySearchTree.insert(30);
		binarySearchTree.insert(60);
		binarySearchTree.insert(50);
		binarySearchTree.insert(70);
		assertEquals(40, binarySearchTree.findParent(20).getData());
		assertEquals(20, binarySearchTree.findParent(10).getData());
		assertEquals(20, binarySearchTree.findParent(30).getData());
		assertEquals(40, binarySearchTree.findParent(60).getData());
		assertEquals(60, binarySearchTree.findParent(50).getData());
		assertEquals(60, binarySearchTree.findParent(70).getData());
		binarySearchTree.inOrder();
		System.out.println("\n");
		binarySearchTree.postOrder();
		System.out.println("\n");
		binarySearchTree.preOrder();

		

	}
	@Test
	public void inOrderTraversal() {
		BBinarySearchTree binarySearchTree = new BBinarySearchTree();
		binarySearchTree.insert(8);
		binarySearchTree.insert(7);
		binarySearchTree.insert(6);
		binarySearchTree.insert(5);
		binarySearchTree.insert(9);
		binarySearchTree.insert(12);
		binarySearchTree.insert(10);
		binarySearchTree.inOrder();
		//TODO:Are you testing by comparing with your eyes!!
	}
	
	@Test
	public void findMin_case1() {
		BBinarySearchTree binarySearchTree = new BBinarySearchTree();
		binarySearchTree.insert(40);
		binarySearchTree.insert(20);
		binarySearchTree.insert(10);
		binarySearchTree.insert(30);
		binarySearchTree.insert(60);
		binarySearchTree.insert(50);
		binarySearchTree.insert(70);
		assertEquals(10, binarySearchTree.min().getData());
	}
	
	@Test
	public void findMin_case2() {
		BBinarySearchTree binarySearchTree = new BBinarySearchTree();
		binarySearchTree.insert(20);
		binarySearchTree.insert(25);
		binarySearchTree.insert(23);
		binarySearchTree.insert(26);
		binarySearchTree.insert(15);
		binarySearchTree.insert(18);
		binarySearchTree.insert(19);
		binarySearchTree.insert(17);
		binarySearchTree.insert(12);
		assertEquals(12, binarySearchTree.min().getData());
	}
	

}
