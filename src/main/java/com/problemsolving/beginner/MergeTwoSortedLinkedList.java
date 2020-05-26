package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;
import com.ds.linkedlist.Node;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		NLinkedList<Integer> linkedList1 = new NLinkedList<Integer>();
		linkedList1.insert(10);
		linkedList1.insert(20);
		linkedList1.insert(30);
		linkedList1.insert(40);
		linkedList1.insert(50);
		linkedList1.insert(60);
		
		NLinkedList<Integer> linkedList2 = new NLinkedList<Integer>();
		linkedList2.insert(5);
		linkedList2.insert(15);
		linkedList2.insert(25);
		linkedList2.insert(35);
		linkedList2.insert(45);
		linkedList2.insert(55);
		linkedList2.insert(99);

		Node<Integer> current1 = linkedList1.header;
		Node<Integer> current2 = linkedList2.header;
		NLinkedList<Integer> linkedList3 = new NLinkedList<Integer>();

		while(null != current1 && null != current2 ) {
			if(current1.getValue()<current2.getValue()) {
				linkedList3.insert(current1.getValue());
				current1 = current1.getNext();
			}else {
				linkedList3.insert(current2.getValue());
				current2 = current2.getNext();
			}
		}
		if(null != current1) {
			while(null != current1) {
				linkedList3.insert(current1.getValue());
				current1 = current1.getNext();
			}
		}else if(null != current2) {
			while(null != current2) {
				linkedList3.insert(current2.getValue());
				current2 = current2.getNext();
			}
		}
		linkedList3.print();

	}

}
