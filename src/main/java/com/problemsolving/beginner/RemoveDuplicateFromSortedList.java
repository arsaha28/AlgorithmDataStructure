package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;
import com.ds.linkedlist.Node;

public class RemoveDuplicateFromSortedList {

	public static void main(String[] args) {
		NLinkedList<Integer> linkedList1 = new NLinkedList<Integer>();
		linkedList1.insert(10);
		linkedList1.insert(20);
		linkedList1.insert(50);
		linkedList1.insert(50);
		linkedList1.insert(50);
		linkedList1.insert(60);
		linkedList1.insert(60);
		linkedList1.insert(60);
		linkedList1.insert(60);
		linkedList1.insert(65);


		Node<Integer> current = linkedList1.header;
		Node<Integer> next = linkedList1.header.getNext();
		
		while(null != current && null != next) {
			if(current.getValue() != next.getValue()) {
				current.setNext(next);
				current = next;
				next = next.getNext();
				
			}else if(current.getValue() == next.getValue()) {
				next = next.getNext();

			}
		}
		current.setNext(null);
		linkedList1.print();
		
		
		

	}

}
