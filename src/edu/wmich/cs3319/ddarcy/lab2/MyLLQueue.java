package edu.wmich.cs3319.ddarcy.lab2;

/**
CLASS - MyLLQueue
This class uses a linked list to implement a queue data structure which holds MyNodes.
 */

public class MyLLQueue {
	
	//Attributes
	private MyLinkedList linkedListQueue = new MyLinkedList();
	private int length;
	
	/**
	 This is the constructor for the MyAQueue class.  It receives no input so all of the variables are set to 0 or null.
	 */
	public MyLLQueue() {
		super();
		this.length = 0;
	}
	
	/**
	 Adds item to the queue
	 @param n - number to put in node
	 */
	public void enqueue(int n) {
		linkedListQueue.insert(n);
		length++;
	}
	
	/**
	 Removes item from the front of the queue
	 */
	public MyNode dequeue() {
		if (length == 0) {
			System.out.println("There is nothing to dequeue it is empty!");
			return null;
		}
		else {
			MyNode tempNode = new MyNode();
			tempNode = linkedListQueue.getHead();
			System.out.println(linkedListQueue.getHead().getMyNum() + " Was deleted");
			linkedListQueue.deleteHead();
			length--;
			return tempNode;
		}
	}

	/**
	 Returns length
	 @return length - length of data structure
	 */
	public int getLength() {
		return length;
	}
	
	 /**
	  Return node which is first "in line"
	  @return queueArray[0] - first node in line
	 */
	public MyNode getFrontInLine() {
		if (length == 0) {
			System.out.println("There is nothing to pop it is empty!");
			return null;
		}
		else
			return linkedListQueue.getHead();
	}
	
	/**
	 Takes a decimal number and stores its binary digits in data structure
	 @param n - decimal number to be stored in data structure
	 */
	public void store(int n) {
		if(n == 0) {
			enqueue(n%2);
		}
		else if(n == 1) {
			enqueue(n%2);
		}
		else {
			while(n>=1) {
				enqueue(n%2);
				n=n/2;
			}
		}
	}
	
	/**
	 Returns decimal form of stored binary digits
	 @return decimalNum - binary number converted to decimal
	 */
	public int toDecimal() {
		int decimalNum = 0;

		while(linkedListQueue.getLength() >= 1) {
			int returnedInt = 0;
			int exponentialInt = (int) Math.pow(2, linkedListQueue.getLength()-1);
			MyNode tempNode = new MyNode();
			tempNode = linkedListQueue.getRear();
			returnedInt = tempNode.getMyNum();
			linkedListQueue.delete();
			decimalNum = decimalNum + (returnedInt*exponentialInt);			
		}
		return decimalNum;
	}
}
