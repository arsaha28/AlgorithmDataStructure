package com.problemsolving.beginner;

import com.ds.binarysrchtree.BBinarySearchTree;
import com.ds.binarysrchtree.BSTNode;

public class FirstKeyGreaterThanGivernValueInBST {

	public static void main(String[] args) {
		BBinarySearchTree bst = new BBinarySearchTree();
		bst.insert(19);
		bst.insert(7);
		bst.insert(3);
		bst.insert(11);
		bst.insert(2);
		bst.insert(5);
		bst.insert(17);
		bst.insert(13);
		bst.insert(43);
		bst.insert(23);
		bst.insert(47);
		bst.insert(53);
		bst.insert(37);
		bst.insert(29);
		bst.insert(41);
		bst.insert(31);
		//bst.inOrder();
		
		BSTNode root = bst.root;
		BSTNode firstKeyGreaterThan = null;
		int value = 23;
		while(null != root) {
			if(root.getData()>value) {
				firstKeyGreaterThan = root;
				root = root.getLeftNode();				
			}else {
				root = root.getRightNode();
			}
		}
		
		System.out.println(firstKeyGreaterThan.getData());
		

	}

}
