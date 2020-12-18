package edu.wmich.cs3319.ddarcy.lab2;

/**
CLASS - MyLinkedList
This class implements a linked list using nodes from MyNode class which store an int value
 */

public class MyLinkedList {
	
	//Attributes
	private MyNode head;
	private MyNode rear;
	private int length;
	
	
	public MyLinkedList() {
		
		this.length = 0;
	}
	
	/**
	 * Adds item to the linkedList
	 * @param n - number to be stored in node
	 */
	public void insert(int n) {
		MyNode addedNode = new MyNode(n);
		if(length == 0) {
			head = addedNode;
			rear = addedNode;
			rear.setNextNode(head);
			head.setPrevNode(rear);
			length++;
		}
		else {
			rear.setPrevNode(addedNode);
			addedNode.setNextNode(rear);
			rear = addedNode;
			length++;
		}
	}
	
	/**
	 * Removes item from rear of linked list
	 */
	public void delete() {
		if(length == 0) {
			System.out.println("The linked list is empty, there is nothing to delete!");
			return;
		}
		else if(length == 1) {
			length --;
		}
		else {
			MyNode tempNode = new MyNode();
			tempNode = rear.getNextNode();
			rear = tempNode;
			length--;
		}
	}
	
	/**
	 * Removes item from head of linked list
	 */
	public void deleteHead() {
		if(length == 0) {
			System.out.println("The linked list is empty, there is nothing to delete!");
			return;
		}
		else if(length == 1) {
			length--;
		}
		else {
			MyNode tempNode = new MyNode();
			tempNode = head.getPrevNode();
			head = tempNode;
			length--;
		}
	}
	
	/**
	 * Returns head node
	 * @return head - front node
	 */
	public MyNode getHead() {
		return head;
	}
	
	/**
	 * Sets head node
	 * @param head - front node
	 */
	public void setHead(MyNode head) {
		this.head = head;
	}

	/**
	 * Returns rear node
	 * @return - rear - last node
	 */
	public MyNode getRear() {
		return rear;
	}

	/**
	 * Sets rear node
	 * @param rear - back node
	 */
	public void setRear(MyNode rear) {
		this.rear = rear;
	}

	/**
	 * Returns the length
	 * @return length - length of the data structure
	 */
	public int getLength() {
		return length;
	}
}
