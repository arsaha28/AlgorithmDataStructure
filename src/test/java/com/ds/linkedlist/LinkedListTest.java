package com.ds.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {
	
	@Test
	public void insertFirstItem() {
		NLinkedList<String>  linkedList = new NLinkedList<String>();
		linkedList.insert("Arnab");
		linkedList.print();
		assertEquals(1, linkedList.getSize());
		System.out.println("***********TEST COMPLETE************");
	}
	
	@Test
	public void insertSecondItem() {
		NLinkedList<String>  linkedList = new NLinkedList<String>();
		linkedList.insert("Arnab");
		linkedList.insert("Anish");
		linkedList.insert("Rakesh");
		linkedList.print();
		assertEquals(3, linkedList.getSize());
		System.out.println("***********TEST COMPLETE************");
	}
	
	@Test
	public void printInReverse() {
		NLinkedList<String>  linkedList = new NLinkedList<String>();
		linkedList.insert("Arnab");
		linkedList.insert("Anish");
		linkedList.insert("Rakesh");
		linkedList.printInReverse();
		System.out.println("***********TEST COMPLETE************");
	}
	@Test
	public void findValue() {
		NLinkedList<String>  linkedList = new NLinkedList<String>();
		linkedList.insert("Arnab");
		linkedList.insert("Anish");
		linkedList.insert("Rakesh");
		assertEquals(true, linkedList.find("Arnab"));
		assertEquals(false, linkedList.find("arnab"));
	
	}
	@Test
	public void delete() {
		NLinkedList<String>  linkedList = new NLinkedList<String>();
		linkedList.insert("Arnab");
		linkedList.insert("Anish");
		linkedList.insert("Rakesh");
		assertEquals(true, linkedList.find("Arnab"));
		assertEquals(false, linkedList.find("arnab"));
	
	}

}
