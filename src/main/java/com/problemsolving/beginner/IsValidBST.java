package com.problemsolving.beginner;

import java.util.ArrayList;
import java.util.List;

import com.ds.binarysrchtree.BBinarySearchTree;
import com.ds.binarysrchtree.BSTNode;

public class IsValidBST {

	public static void main(String[] args) {
		BBinarySearchTree bst = new BBinarySearchTree();
		bst.insert(20);
		bst.insert(25);
		bst.insert(22);
		bst.insert(30);
		bst.insert(15);
		bst.insert(10);
		bst.insert(18);
		
		List<Integer> array = new ArrayList<Integer>();
		populateArray(bst.root, array);
		int previous = Integer.MIN_VALUE;
		for(Integer i :array) {
			if(i<previous) {
				System.out.println("Not a BST");
			}else {
				previous = i;
			}
		}
	}
	
	private static void populateArray(BSTNode root,List<Integer> array ) {
		if(null != root) {
			populateArray(root.getLeftNode(), array);
			array.add(root.getData());
			System.out.println(root.getData());
			populateArray(root.getRightNode(), array);
		}
		
	}

}
