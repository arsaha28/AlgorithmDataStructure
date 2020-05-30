package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;
import com.ds.linkedlist.Node;

public class MergeTwoSortedLinkedListWithoutSpace {
	//To be optimised to use no extra pointer for c3
	public static void main(String[] args) {
		NLinkedList<Integer> linkedList1 = new NLinkedList<Integer>();
		linkedList1.insert(10);
		linkedList1.insert(20);
		linkedList1.insert(30);
		linkedList1.insert(40);
		linkedList1.insert(50);
		linkedList1.insert(60);
		linkedList1.insert(61);
		linkedList1.insert(63);
		linkedList1.insert(65);
		linkedList1.insert(67);
		linkedList1.insert(69);
		linkedList1.insert(71);
		linkedList1.insert(73);
		linkedList1.insert(75);
		linkedList1.insert(77);
		linkedList1.insert(79);
		
		NLinkedList<Integer> linkedList2 = new NLinkedList<Integer>();
		linkedList2.insert(5);
		linkedList2.insert(15);
		linkedList2.insert(25);
		linkedList2.insert(35);
		linkedList2.insert(45);
		linkedList2.insert(55);
		linkedList2.insert(62);
		linkedList2.insert(64);
		linkedList2.insert(66);
		linkedList2.insert(68);
		linkedList2.insert(70);
		linkedList2.insert(72);
		linkedList2.insert(74);
		linkedList2.insert(76);
		linkedList2.insert(78);
		linkedList2.insert(80);
		linkedList2.insert(82);
		
		//linkedList2.insert(99);
		Node<Integer> current1 = linkedList1.header;
		Node<Integer> current2 = linkedList2.header;
		Node<Integer> current3 = null;
		Node<Integer> header3 = null;
		
		while(null != current1 && null != current2) {
			if(current1.getValue()<current2.getValue()) {
				if(current3 == null) {
					current3 = current1;
					current3.setNext(current1.getNext());
					header3 = current3;
				}else {
					current3.setNext(current1);
					current3 = current1;
				}
				current1 = current1.getNext();

			}else if (current2.getValue()<current1.getValue()){
				if(current3 == null) {
					current3 = current2;
					current3.setNext(current2.getNext());
					header3 = current3;
				}else {
					current3.setNext(current2);
					current3 = current2;
				}					
				current2 = current2.getNext();

			}
		}
		
		if(null == current1) {
			current3.setNext(current2);
		}else if (null == current2) {
			current3.setNext(current1);
		}
		Node toIterate = header3;
		while(null != toIterate) {
			System.out.println(toIterate.getValue());
			toIterate = toIterate.getNext();
		}

	}

}
