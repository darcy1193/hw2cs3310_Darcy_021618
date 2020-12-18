package edu.wmich.cs3319.ddarcy.lab2;

/**
CLASS - MyAQueue
This class uses an array to implement a queue data structure which holds MyNodes.
 */

public class MyAQueue {
	
	//Attributes
	private MyNode queueArray[] = new MyNode[100];
	private int length;	
	
	/**
	 This is the constructor for the MyAQueue class.  It receives no input so all of the variables are set to 0 or null.
	 */
	public MyAQueue() {
		super();
		this.length = 0;
	}
	
	/**
	 Adds item to the queue
	 @param n - number to put in node
	 */
	public void enqueue(int n) {
		MyNode addedNode = new MyNode(n);
		queueArray[length] = addedNode;
		length++;
	}
	
	/**
	 Removes item from the front of the queue
	 */
	public void dequeue() {
		for(int i=0; i<length; i++) {
			MyNode tempNode = new MyNode();
			tempNode = queueArray[i+1];
			queueArray[i] = tempNode;
			length--;
		}
	}
	
	/**
	 Return node which is first "in line"
	 @return queueArray[0] - first node in line
	 */
	public MyNode showFirstInLine() {
		if(length == 0) {
			System.out.println("The queue is empty, there is nothing!");
			return null;
		}
		else
			return queueArray[0];
	}

	/**
	 Returns length
	 @retun length - length of data structure
	 */
	public int getLength() {
		return length;
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
		int counter = 0;
		
		while(queueArray[counter] != null) {
			int returnedInt = 0;
			int exponentialInt = (int) Math.pow(2, counter);
			MyNode tempNode = new MyNode();
			tempNode = queueArray[counter];
			returnedInt = tempNode.getMyNum();
			decimalNum = decimalNum + (returnedInt*exponentialInt);
			counter++;
		}
		return decimalNum;
	}
}
