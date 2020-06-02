package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;
import com.ds.linkedlist.Node;

public class LinkedListIsPalindrome {

	public static void main(String[] args) {
		NLinkedList<String> linkedList = new NLinkedList<String>();
		NLinkedList<String> linkedList2 = new NLinkedList<String>();

		linkedList.insert("A");
		linkedList.insert("B");
		linkedList.insert("B");
		linkedList.insert("B");
		
		
		Node<String> slow = linkedList.header;
		Node<String> fast = linkedList.header;
		Node<String> firstIter = linkedList.header;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		while(slow!= null) {
			linkedList2.insert(slow.value);
			slow = slow.next;
		}
		linkedList2.reverse();
		Node<String> secondItem = linkedList2.header;
		boolean isPalindrome = true;
		while(null != firstIter && null != secondItem) {
			if(firstIter.value != secondItem.value) {
				System.out.println("Not palindrome");
				isPalindrome = false;
				break;
			}
			firstIter = firstIter.next;
			secondItem = secondItem.next;
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome");
		}
		

	}

}
