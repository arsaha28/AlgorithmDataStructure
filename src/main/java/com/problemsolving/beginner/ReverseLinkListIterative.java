package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;

public class ReverseLinkListIterative {

	public static void main(String[] args) {
		NLinkedList<String> linkedList = new NLinkedList<String>();
		linkedList.insert("A");
		linkedList.insert("B");
		linkedList.insert("C");
		linkedList.insert("D");
		linkedList.insert("E");
		linkedList.insert("F");
		linkedList.print();
		System.out.println("\n");
		linkedList.reverse();
		linkedList.print();

	}

}
