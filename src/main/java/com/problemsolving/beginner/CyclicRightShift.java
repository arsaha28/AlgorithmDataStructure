package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;
import com.ds.linkedlist.Node;

public class CyclicRightShift {

	public static void main(String[] args) {
		NLinkedList<Integer> linkedList = new NLinkedList<Integer>();
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(5);
		linkedList.insert(3);
		linkedList.insert(2);
		linkedList.print();
		System.out.println("\n");
		int k = 3;
		
		Node<Integer> head = linkedList.header;
		Node<Integer> tail = head;
		int length = 1;
		
		while(null !=tail.next) {
			length = length+1;
			tail = tail.next;
		}
		k = k%length;
		tail.next = head;
		Node<Integer> newTail = tail;
		int stepForNewHead = length - k;
		while(stepForNewHead>0) {
			newTail = newTail.next;
			stepForNewHead = stepForNewHead -1;
		}
		head = newTail.next;
		linkedList.header = head;
		newTail.next = null;
		linkedList.print();

	}

}
