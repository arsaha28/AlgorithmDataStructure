package com.ds.linkedlist;

public class NLinkedList<T> {

	private Node<T> header;
	private int size;

	public boolean insert(T value) {
		boolean insertOK = false;
		try {
			Node<T> node = new Node<T>(); 
			node.setValue(value);
			node.setNext(null);
			if(header == null) {
				header = node;
				size = size+1;
			}else{
				Node<T> currentNode = header;
				while(!(currentNode.getNext() == null)) {
					currentNode = currentNode.getNext();
				}
				currentNode.setNext(node);
				size = size+1;
			}
			insertOK = true;
			return insertOK;
		}catch(Exception ex) {
			insertOK = false;
		}
		return insertOK;
	}
	
	public void print() {
		if(header == null) {
			return;
		}else {
			Node<T> currentNode = header;
			while(!(currentNode.getNext() == null)) {
				System.out.print(currentNode.getValue()+"\t");
				currentNode = currentNode.getNext();
			}
			System.out.print(currentNode.getValue()+"\t");
		}
	}
	
	public void delete(T value) {
		if(header == null) {
			return ;
		}else {
			Node<T> currentNode = header;
			Node<T> previousNode = null;
			if(currentNode.getValue().equals(value)) {
				header = currentNode.getNext();
			}
			while(!(currentNode.getNext() == null)) {
				if(currentNode.getValue().equals(value)) {
					previousNode.setNext(currentNode.getNext());
				}
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
		}
	}
	
	public boolean find(T val) {
		if(header == null) {
			return false;
		}else {
			Node<T> currentNode = header;
			while(!(currentNode.getNext() == null)) {
				if(currentNode.getValue().equals(val)) {
					return true;
				}else {
					currentNode = currentNode.getNext();
				}
			}
			if(currentNode.getValue().equals(val)) {
				return true;
			}
		}
		return false;
	}
	
	public void reverse() {
		Node<T> previous = null;
		Node<T> next = header;
		Node<T> current = header;
		
		while(null != current) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;	
		}
		header = previous;
	}
	public void printInReverse() {
		Object array[] = new Object[this.size];
		if(header == null) {
			return;
		}else {
			int i = 0;
			Node<T> currentNode = header;
			while(!(currentNode.getNext() == null)) {
				array[i] = currentNode.getValue();
				currentNode = currentNode.getNext();
				i = i+1;
			}
			array[i] = currentNode.getValue();
		}
		
		for (int i = array.length -1; i >= 0; i--) {
			System.out.println("Element is :"+array[i]);
		}
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
