package com.problemsolving.beginner;

import java.util.ArrayList;
import java.util.List;

import com.ds.binarysrchtree.BBinarySearchTree;
import com.ds.binarysrchtree.BSTNode;

public class FindKLargeElementsFromBST {

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
		List<Integer> klargeELements = new ArrayList<Integer>();
		int k = 4;
		fillKLargeELements(root, k, klargeELements);
		
		klargeELements.forEach(i->{
			System.out.println(i);
		});
	}
	
	public static void fillKLargeELements(BSTNode root,int k,List<Integer> klargeELements) {
		if(null != root) {
			fillKLargeELements(root.getRightNode(), k, klargeELements);
			if(klargeELements.size()<k) {
				klargeELements.add(root.getData());
				fillKLargeELements(root.getLeftNode(), k, klargeELements);
			}
		}
		
	}

}
