package edu.wmich.cs3319.ddarcy.lab2;

/**
CLASS - MyLLStack
This class uses an linked list to implement a stack data structure which holds MyNodes.
 */

public class MyLLStack {
	
	//Attributes
	private MyLinkedList linkedListStack = new MyLinkedList();
	private int length;
	
	/**
	 This is the constructor for the MyAQueue class.  It receives no input so all of the variables are set to 0 or null.
	 */
	public MyLLStack() {
		super();
		this.length = 0;
	}
	
	/**
	 Pushes node onto stack
	 @param n - number to be in node pushed onto stack
	 */
	public void push(int n) {
		linkedListStack.insert(n);
		length++;
	}
	
	/**
	 Removes node from top of stack
	 @return stackArray[length] - length of data structure
	 */
	public MyNode pop() {
		if (length == 0) {
			System.out.println("There is nothing to pop it is empty!");
			return null;
		}
		else {
		MyNode tempNode = new MyNode();
		tempNode = linkedListStack.getHead();
		linkedListStack.delete();
		length--;
		return tempNode;
		}
	}

	/**
	 * Returns the length
	 * @return length - length of the data structure
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * Returns the top node
	 * @return linkedListStack.getRear() - top of the stack
	 */
	public MyNode getTop() {
		if (length == 0) {
			System.out.println("There is nothing to pop it is empty!");
			return null;
		}
		else
			return linkedListStack.getRear();
	}
	
	/**
	 Takes a decimal number and stores its binary digits in data structure
	 @param n - decimal number to be stored in data structure
	 */
	public void store(int n) {
		if(n == 0) {
			push(n%2);
		}
		else if(n == 1) {
			push(n%2);
		}
		else {
			while(n>=1) {
				push(n%2);
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

		while(linkedListStack.getLength() != 0) {
			int returnedInt = 0;
			int exponentialInt = (int) Math.pow(2, linkedListStack.getLength()-1);
			MyNode tempNode = new MyNode();
			tempNode = linkedListStack.getRear();
			returnedInt = tempNode.getMyNum();
			linkedListStack.delete();
			decimalNum = decimalNum + (returnedInt*exponentialInt);
		}
		return decimalNum;
	}
}
