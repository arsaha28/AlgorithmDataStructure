package com.problemsolving.beginner;

public class LongestPalindrome {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.arrange("alxxyyxxbe2jdhdk");
		binaryTree.findLongestPalindrom(binaryTree.root);
		System.out.println(binaryTree.longestPalindrome);
	}
	
	public static class BinaryTree{
		
		private BNode root;
		private StringPalindrome palindrome = new StringPalindrome();
		String longestPalindrome = "";
		
		public void findLongestPalindrom(BNode root) {
			if(root == null) {
				return ;
			}
			BNode current = root;
			if(null != current) {
				String content = current.value;
				boolean isPalindrome = palindrome.isPalindrome(content);
				if(isPalindrome && longestPalindrome.length()<content.length()) {
					this.longestPalindrome = content;
				}
				findLongestPalindrom(current.leftChild );
				findLongestPalindrom(current.rightChild);

			}
			
			
			
		}
		
		public void arrange(BNode parent ,String str) {
			BNode node = null;
			if(parent == null) {
				node = new BNode(str);
				parent = node;
				root = parent;
			}
			if(str.length()>=3) {
				String leftChild = str.substring(1,str.length());
				String rightChild = str.substring(0,str.length()-1);
				BNode left = new BNode(leftChild);
				BNode right = new BNode(rightChild);
				parent.leftChild = left;
				parent.rightChild = right;
				arrange(left,leftChild);
				arrange(right,rightChild);

			}
			

		}
		
		public void arrange(String str) {
			arrange(root,str);
			
		}
	}
	
	public static class BNode {
		String value;
		BNode leftChild;
		BNode rightChild;
		public BNode(String value) {
			this.value = value;
		}
	}
}
