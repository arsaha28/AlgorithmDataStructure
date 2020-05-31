package com.problemsolving.beginner;

import com.ds.linkedlist.NLinkedList;
import com.ds.linkedlist.Node;

public class EvenOddMerge {

	public static void main(String[] args) {
		NLinkedList<Integer> linkedList1 = new NLinkedList<Integer>();
		linkedList1.insert(0);
		linkedList1.insert(1);
		linkedList1.insert(2);
		linkedList1.insert(3);
		linkedList1.insert(4);
		linkedList1.insert(5);
		linkedList1.insert(6);
		linkedList1.insert(7);
		linkedList1.insert(8);
		linkedList1.insert(9);
		linkedList1.insert(10);

		
		
		Node<Integer> fast = linkedList1.header;
		Node<Integer> slow = linkedList1.header.getNext();
		Node<Integer> slowHeader = linkedList1.header.getNext();
		
		while(null != fast && null != fast.next && null != fast.next.next) {
			fast.next = fast.next.next;
			fast = fast.next;
			slow.next = fast.next;
			slow = slow.next;
			linkedList1.print();
			System.out.println("\n");

		}
		
		
		fast.next = slowHeader;
		System.out.println("Final list");
		linkedList1.print();
	}

}
