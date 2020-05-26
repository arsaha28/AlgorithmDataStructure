package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;
import com.ds.linkedlist.Node;

public class RemoveKthElement {

	public static void main(String[] args) {
		NLinkedList<Integer> linkedList1 = new NLinkedList<Integer>();
		linkedList1.insert(10);
		linkedList1.insert(20);
		linkedList1.insert(30);
		linkedList1.insert(40);
		linkedList1.insert(50);
		linkedList1.insert(60);
		//Remove 2nd Element from above linkedlist
		int k = 2;
		
		Node<Integer> previous = null;
		Node<Integer> current = linkedList1.header;
		int numberOfElement = 0;
		while(null != current) {
			if(numberOfElement != k) {
				previous = current;
				current = current.getNext();				
			}else if(numberOfElement == k) {
				current = current.getNext();
				if(null != previous) {
					previous.setNext(current);
				}else {
					previous = current;
					linkedList1.header = previous;
				}
			}
			numberOfElement = numberOfElement+1;

		}
		linkedList1.print();
		

	}

}
