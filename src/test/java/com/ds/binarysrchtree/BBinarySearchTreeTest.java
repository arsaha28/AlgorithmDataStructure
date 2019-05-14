package com.ds.binarysrchtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BBinarySearchTreeTest {
	
	@Test
	public void insert() {
		BBinarySearchTree bBinarySearchTree = new BBinarySearchTree();
		bBinarySearchTree.insert(8);
		bBinarySearchTree.insert(7);
		bBinarySearchTree.insert(6);
		bBinarySearchTree.insert(5);
		bBinarySearchTree.insert(9);
		bBinarySearchTree.insert(12);
		assertEquals(5, bBinarySearchTree.findParent(4).getData());
		assertEquals(8, bBinarySearchTree.findParent(9).getData());
		assertEquals(9, bBinarySearchTree.findParent(12).getData());
		
		
	}

}
